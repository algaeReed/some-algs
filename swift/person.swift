struct  person {
   let name: String
   let age: Int
   let experiencesOfWorking: Int
}

struct Department: TabularDataSource, CustomStringConvertible {
    let name: String
	var employees: [person]

	init(name: String){
		self.name = name
	    emplyees = [person]()
	}

	mutating func add(_ employee: person) {
       employees.append(employee)
	}

	var description: String {
       return "Department: \(name)"
	}
    var rows: Int {
       return employees.count
	}
    var columns:Int {
       return 3
	}

	func label(col: int) -> String {
       switch col {
           case 0 :
			   return "Employee Name"
		   case 1 :
			   return "Age"
		   case 2 :
                return "Experience of working"
		   default:
			   fatalError("Invalid Colum")

	   }
	}


	func itemFor(col: int) -> String {
       switch col {
           case 0 :
			   return employee[row].name
		   case 1 :
			   return String(employees[row].age)
		   case 2 :
                return String(employess[row].experienceOfWorking)
		   default:
			   fatalError("Invalid Colum")
	   }
	}


}


