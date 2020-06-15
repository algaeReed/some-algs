 class WeightQuickUnionUFWidthPC {
   private int[] id;   
   private int[] sz;
   public WeightQuickUNIOnUFWidthPC(int N) {
     id = new int[N];
     sz = new int[N];

     for ( int i = 0; i < N; i++){
         id[i]  = i; 
         sx[i]  = 1;
     }
   }

   public int find(int p) {
      while ( p != id[p] ){
        id[p] = id[id[p]];   
        p = id[p];
        }
      return p;      
   }
   
   public boolean connected(int p, int q) {
      return find[p]  == find[q];
   }
   
   public void union (int p, int q) {
      int pid = find[p];
      int qid = find[q];

      if (pid == qid )
         return;
      if(sz[pid] < sz[qid]) 
         id[pid] = qid;
      else 
         id[qid] = pid;
 
}
