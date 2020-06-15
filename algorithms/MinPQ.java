import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.Transaction;
public class MinPQ<Key extends Comparable<? super Key>>{
    
   private Key[] pq;
   private int N;

   public MinPQ() {
      pq =(Key[])(new  Comparable[2]);
	  N = 0;
   }

   public MinPQ(Key[] keys) {
	  this();
	  for(int i = 0;i < keys.length; i++){
        insert(keys[i]);
      }
  
   }

   public void insert(Key key) {
	  if (N >= pq.length - 1)
		  resize(2 * N + 1);
      pq[++N] = key;
	  swim(N);
   }

   public  boolean greater(int i, int j) {
      return pq[i].compareTo(pq[j]) > 0;
   }
   
   public void swim(int k){
	   while(k > 1 && greater(k/2, k)){
         exch(k/2, k);
		 k /= 2;
	  }
   }

   private void exch(int i, int j) {
     Key tmp = pq[i];
	 pq[i] = pq[j];
	 pq[j] = tmp;
   }


   public Key delMin() {
	  exch(1, N);
	  Key Min = pq[N];
	  pq[N--] = null;
	  sink(1);
	  if ( N >= 1 && N <= pq.length / 4)
		  resize(2 * N + 1);
      return Min;
   }

   private void resize(int  capacity) {
     Key[] tmp = (Key[])(new Comparable[capacity]);
	 for(int i = 1; i <= N; i++)
		 tmp[i] = pq[i];
	 pq = tmp;
   }
   
   private void sink(int k) {
      while( 2*k <= N){
          int j = 2 * k;
		  if (j < N && greater(j, j+1))
		     j++;
		  if (!greater(k, j))
		     break;
		 exch(k, j);
		 k = j;
	  }
   }

   public Key Min() {
      return pq[1];
   }
   
   public int size() {
      return N;
   }

   public boolean isEmpty() {
      return N == 0;
   }
   public static void main(String[] args){
      int M = Integer.parseInt(args[0]);
	  MinPQ<Transaction> pq = new MinPQ<>();
	  while (!StdIn.isEmpty()) {
           String line = StdIn.readLine();
		   Transaction t = new Transaction(line);
		   pq.insert(t);

		   if(pq.size() > M)
			   pq.delMin();
	  }
      
	  while (!pq.isEmpty())
		  System.out.println(pq.delMin());

   }
}
