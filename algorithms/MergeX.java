import edu.princeton.cs.algs4.In;
public class MergeX {
   private final static int CUT_OFF = 7;
   public static <T extends Comparable<? super T>> void sort(T[] a) {
      T[] aux = (T[])(new Comparable[a.length]);
	  sort(aux, a, 0, a.length - 1);

  }
   private static <T extends Comparable<? super T>> void  merge(T[] a, T[] aux, int lo, int mid, int hi) {

	  int i = lo;
	  int j = mid + 1;
      for (int k = lo; k <= hi; k++){
         if (i > mid)
			aux[k] = a[j++];
		 else if (j > hi) 
             aux[k] = a[i++];
         else if (less(a[i], a[j]))
			 aux[k] = a[i++];
		 else
			 aux[k] = a[j++];
      }

   }

   private static <T extends Comparable<? super T>> void sort(T[] a, T[] aux, int lo, int hi ){
	   if( hi <= lo + CUT_OFF){
		   Insertion.sort(aux, lo, hi);
		   return;
	   }
	   int mid = (lo + hi) / 2;
	   sort(aux, a, lo, mid);
	   sort(aux, a, mid+1,hi);

	   if (!less(a[mid + 1], a[mid])){
		   System.arraycopy(a, lo, aux, lo, hi - lo + 1);
		   return;
	   }
	   merge(a, aux, lo, mid, hi);
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
