import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdRandom;
public class Quick {
   public static <T extends Comparable<? super T>> void sort(T[] a) {
   	  StdRandom.shuffle(a);
	  sort(a, 0, a.length - 1);
   }

   private static <T extends Comparable<? super T>> int partition(T[] a, int lo, int hi){
     int i = lo;
	 int j = hi + 1;

	 while(true) {
        while( less(a[++i],  a[lo]) && i < hi);
		while( a[--j].compareTo(a[lo]) > 0 && j > lo);
		if ( j <= i )
            break;
		exch(a, i, j);
	 }
	 exch(a, j, lo);
	 return j;
   }


   private static <T extends Comparable<? super T>> void sort(T[] a, int lo, int hi){
      if( hi <= lo)
		  return;
	  int p = partition(a, lo, hi);
	  sort(a, lo, p-1);
	  sort(a, p + 1, hi);
   }

   private static <T extends Comparable<? super T>>  boolean less(T v, T w){
      return v.compareTo(w) < 0;
   }

   private static <T extends Comparable<? super T>>  void exch(T[] a, int i, int j) {
	  T tmp = a[i];
	  a[i] = a[j];
	  a[j] = tmp;
   }

   public static <T extends Comparable<? super T>>  boolean isSorted(T[] a)  {
      for ( int i = 1; i < a.length; i++)
		  if (a[i - 1].compareTo(a[i]) > 0) 
			  return false;
      return true;
   }
   
   public static <T extends Comparable<? super T>>  void show (T[] a) {
      for (int i = 0; i < a.length; i++) {
	     System.out.println("index: " + i + ", value: " + a[i]); 
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
