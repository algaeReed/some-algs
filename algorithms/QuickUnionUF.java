public class QuickUnionUF {
   private int[] id;   
   public QuickUnionUF(int N) {
     id = new int[N];
     for ( int i = 0; i < N; i++)
         id[i]  = i; 
   }

   public int find(int p) {
      while ( p != id[p] )
         p = id[p];
      return 0;      
   }
   
   public boolean connected(int p, int q) {
      return find[p]  == find[q];
   }
   
   public void union (int p, int q) {
      int pid = find[p];
      int qid = find[q];

      if (pid == qid )
         return;
      id[pid] = qid;
   }
}
