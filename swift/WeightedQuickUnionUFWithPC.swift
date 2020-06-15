final class WeightedQuickUnionUFWithPC {
   private var id: [Int]
   private var sz: [Int]
   init(_ N: Int) {
      id = [Int]()
      sz = [Int](repeating: 1, count:N)
      for i in 0 ..< N {
         id.append(i)
      }
   }

   func find(_ p: Int) -> Int {
      var x = p;
      while x != id[x] {
		 id[x] = id[id[x]]
         x = id[x]
      }  
      return x
  }
  
  func connected(_ p:Int, _ q: Int) -> Bool {
    
      return find(p) == find(q)
  }

  func union (_ p: Int, _ q: Int) {
     let pid = find(p)
     let qid = find(q)
     if pid == qid {
       return 
     }
     if sz[pid] < sz[qid] {
        id[pid] = qid
	    sz[qid] += sz[pid]
	 } else {
        id[qid] = pid
		sz[pid] += sz[qid]
	 }
  }
}

func testWeightedQuickUnionWithPC() {
   guard let line = readLine(),
         let N = Int(line) else {
      print("Reading data failure")
      return       
   }  

   let uf =  WeightedQuickUnionUFWithPC(N)
   let timer = Stopwatch() 
 
   while let oneStr = readLine(){
       let twoStr = oneStr.split(separator: " ")
       guard let p = Int(twoStr[0]),
             let q = Int(twoStr[1]) else {
         print("Invalid data format")
         return 
       }
       
       if !uf.connected(p, q) {
          uf.union(p, q)
          print("p = \(p), q = \(q)")
       }
   }
   let time = timer.elapsedTime()
   print("Elapsed time: \(time) seconds.")
}


