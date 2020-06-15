import edu.princeton.cs.algs4.In;
public class Heap{
   public static <T extends Comparable<? super T>> void sort(T[] a) {
      int N = a.length;
	  for (int k = N/2; k > 0; k--)
		  sink(a, k, N);
	  for (int k = 1; k < N;k--){
		  exch(a, 1, k);
	      sink(a, 1, --N);
	  }


   }

   private static <T extends Comparable<? super T>> void sink(T[] a, int k, int N) {
      while( 2 * k <= N){
          int j = 2 * k;
		  if (j < N && less(a[j], a[j+1]))
			  j++;
		  if ( !less(a[k], a[j]))
			  break;
		  exch(a, k, j);
		  k = j;

	  }
   }
   
   private static <T extends Comparable<? super T>> void swim(T[] a, int k) {
   
   }
   
   public static <T extends Comparable<? super T>> void show(T[] a) {
   
      for (int i = 0; i < a.length; i++) {
	     System.out.println("index: " + i + ", value: " + a[i]); 
      }
   }
   
   public static <T extends Comparable<? super T>> boolean isSorted(T[] a) {
   
      for ( int i = 1; i < a.length; i++)
		  if (a[i - 1].compareTo(a[i]) > 0) 
			  return false;
      return true;
   }
   
   private static <T extends Comparable<? super T>> boolean less(T v, T w) {
      return v.compareTo(w) < 0;
   }
 
   private static <T extends Comparable<? super T>> void exch(T[] a, int i, int j) {
      T tmp = a[i];
	  a[i] = a[j];
	  a[j] = tmp;

   }
   
    public static void main(String[] args) {
       In in = new In(args[0]);
       String[] items = in.readAllStrings();

	   Stopwatch timer = new Stopwatch();
	   sort(items);
	   double time = timer.elapsedTime();


	   if (isSorted(items))
		   show(items);
	   System.out.println("Sorting " + (items.length - 1) + "Number, elapsed time: " + time + " seconds. ");
}
}
