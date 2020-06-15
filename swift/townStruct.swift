struct Town {
   enum TownSize: String {
      case small 
      case medium
      case large
   }

   
   let name: String
   var population: Int 
   var numberOfStoplights: Int
   var hasPostOffice: Bool
      
   
   init(name: String, population: Int, numberOfStoplights: String,hasPostOffice: Bool ){
      self.name = name
      self.population = population
      self.numberOfStoplights = numberOfStoplights
      self.hasPostOffice = hasPostOffice   
      
   }


   func size() -> String {
      if population < 10000 {  
         return TownSize.small.rawValue
      }

      if population < 10000 {  
         return TownSize.medium.rawValue
      }

      return TownSize.large.rawValue
   }
 
   mutating func changePopulation( by amount: Int ){
      population += amount
   }
   
   func description(){
      print("name: \(name)")
      print("population: \(population) size: \(size())")
      print("number of light stoplights: \(numberOfStoplights)")
      print("has post office? \(hasPostOffice)")
   }
   
}

var myTown = Town(name: "KnowHere", population: "5422", 
stopLights: 4, hasPostOffice: false)
myTown.description()
