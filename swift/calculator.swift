enum Token {
   case number(Int)
   case plus
}

class Lexer {
   enum Error: Swift.Error {
     case InvalidChar(Character)
   }

   private let input: String
   private var position: String.Index

   init(expr: String) {
      input = expr
      position = input.startIndex
   }
   
private func nextChar() -> Character? {
      guard position < input.endIndex else {
	     return nil
	  }
      return input[position]
   }

   private func advance() {
	  assert(position < input.endIndex, "Can not advance pass end index")
      position = input.index(after: position)
   }
   
    
   private func getValue() ->Int {
	   var value = 0
	   while let char = nextChar(),
             let digitValue = Int(String(char)) {
          value = 10 * value + digiValue
		  advance()   
	   }
	   return value
   }
   func lex() -> [Token] {
      
       var token = [Token]() 
	   while let char = nextChar() {
	      switch char {
             case "0" ... "9" :
				 let value = getValue()
			     tokens.append(.number(value))
		     case "+" :
				 tokens.append(.plus)
			     advance()
		     case " " :
				 advance()
		     default: 
				 throw Lexer.Error.invalidChar(char)
		  }
	   }
	   return tokens
   }
}

class Parser {
   enum Error: Swift.Error {
      case invalidToken(Token)
      case unexpectedEndOfInput
   }
   private let tokens: [Token]
   private var position: Int

   init(tokens: [Token]) {
	   self.tokens = tokens
	   position = 0
   }
  
   private func nextToken() -> Token? {
       guard position < tokens.count else{
	      return nil
	   }

	   let token = tokens[position]
		   position += 1
		   return token
   }
   
   private func getNumber() -> Int {
      guard let token = nextToken() else{
          throw Parser.Error.unexpectedEndOfInput
	  }

	  switch token {
          case .number(let value):
			  return value
	      default:
		      throw Parser.Error.invalidToken(token, position)
	  }
   }


   func parser() throws -> Int {
	   var value = try getNumber()
	   while let token = nextToken(){
	      switch token {
             case .plus:
				 value += try getNumber();
		     default:
				 throw Parser.Error.invalidToken(token)
		  }
	   }
	   return value
   }
	   
   }
}

