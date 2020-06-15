class Monster {
   var name = "Monster"
   var town: Town?
   
   func terrorizeTown() {
      if town != nil{
          print("\(name) is terrorizing town: \(town!.name)")
      }else {
          print("\(name) has not found a town to terrorize yet")
      }
   }
}

class Zombie: Monster{
   var walkWithLimp = true 
   
   override func terrorizeTown() { 
      town?.changePopulation(by: -10)
      super.terrorizeTown()   
   }
}
