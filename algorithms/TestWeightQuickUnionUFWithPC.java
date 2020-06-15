import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
public class TestQuickFindUF {
   public static void main(String[] args) {
      int N = StdIn.readInt();
      QuickFindUF uf = new QuickFindUF(N);
      
      Stopwatch timer = new Stopwatch();
      
      while (!StdIn.isEmpty()) {
         int p = StdIn.readInt();
         int q = StdIn.readInt();
         if (!uf.connected(p, q)) {
            uf.union(p, q); 
            System.out.println("p=" + p +  ", q=" + q);
         }    
      }
      double time = timer.elapsedTime();
      System.out.printf("Elapsed time: %.3f seconds\n", time); 
   }
}
