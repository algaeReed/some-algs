import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
public class TestLinkedQueueOfString{
   public static void main(String[] args){
      LinkedQueue<String> queue = new LinkedQueue<>();
      
      while( !StdIn.isEmpty() ){
         String s = StdIn.readString();
         StdOut.println(s);
         queue.enqueue(s); 
      }   
     StdOut.println("***************************");
      while( !queue.isEmpty() ) {
         String s = queue.dequeue();
         StdOut.println(s);
     }

   }

}
