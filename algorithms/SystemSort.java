import edu.princeton.cs.algs4.In;
import java.util.Arrays;
public class SystemSort {

   public static <T extends Comparable<? super T>>  void show (T[] a) {
      for (int i = 0; i < a.length; i++) {
	     System.out.println("index: " + i + ", value: " + a[i]); 
   }

   public static <T extends Comparable<? super T>>  boolean isSorted(T[] a)  {
      for ( int i = 1; i < a.length; i++)
		  if (a[i - 1].compareTo(a[i]) > 0) 
			  return false;
      return true;
   }
   
}
    public static void main(String[] args) {
       In in = new In(args[0]);
       String[] items = in.readAllStrings();

	   Stopwatch timer = new Stopwatch();
	   sort(items);
	   double time = timer.elapsedTime();


	   if (isSorted(items))
		   show(items);
	   System.out.println("Sorting " + items.length + "Number, elapsed time: " + time + " seconds. ");
	}

}
