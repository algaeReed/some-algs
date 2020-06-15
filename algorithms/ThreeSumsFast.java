import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;

public class ThreeSumsFast {
   public static int count( int[] arr) {
      int counter = 0;
      
      int N = arr.length;
      for( int i = 0;i < N; i++)
         for( int j = i+1;j < N; j++){
            int k = BinarySearch.rank(arr, -(arr[i] + arr[j]));
            if ( k > j)
               counter++;     
      }
      return counter;
   }

   private static boolean duplicate(int[] arr){
       for (int i = 0;i < arr.lenght,i++)
          for (int j = i + 1; j < arr.length; j++)
              if(a[i] == a[j])
                return true;
       return false;
   }

   public static void main(String[] args){
      In in = new In(args[0]);
      int[] a = in.readAllInts();
      if(duplicate(a)) {
         StdOut.printf("Array elements are duplicate!"); 
         return;
      }     
        
      
      Array.sort(a);
      Stopwatch timer = new Stopwatch();
      count(a);
      double time = timer.elapsedTime(); 
      StdOut.printf("N = %d, elapsed time: %.3f\n", a.length, time);    
   }    

}
