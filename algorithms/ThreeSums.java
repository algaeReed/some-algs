import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
public class ThreeSums {
   public static int count( int[] arr) {
      int counter = 0;
      
      int N = arr.length;
      for( int i = 0;i < N; i++)
         for( int j = i+1;j < N; j++)
            for( int k = 0;k < N; k++)
               if ( arr[i] + arr[j] + arr[k] == 0 )
                  counter++;
      return counter;
   }

   public static void main(String[] args){
      In in = new In(args[0]);
      int[] a = in.readAllInts();
      Stopwatch timer = new Stopwatch();
      count(a);
      double time = timer.elapsedTime(); 
      StdOut.printf("N = %d, elapsed time: %.3f\n", a.length, time);    
   }    

}
