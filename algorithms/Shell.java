import edu.princeton.cs.algs4.In;
public class Shell {
   public static <T extends Comparable<? super T>> void sort(T[] a) {
	   int N = a.length;
	   int h = 1;
	   while (h < N / 3)
		   h = 3 * h + 1;
	   while (h >= 1){
	       for(int i = h; i < N; i++)
		       for(int j = i; j >= h && less(a[j], a[j-h]);  j -= h)
			    
				      exch(a, j, j-h);
		   h /= 3;
	   }
  
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
