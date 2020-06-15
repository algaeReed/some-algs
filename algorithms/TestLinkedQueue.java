import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
public class TestLinkedQueue{
   public static void main(String[] args){
      LinkedQueueOfString<String> queue = new LinkedQueueOfString<>();
      
      while( !StdIn.isEmpty() ){
         String s = StdIn.readString();
         StdOut.println(s);
         queue.enqueue(s); 
      }   
     StdOut.println("***************************");
     for( String s: queue)
        StdOut.println("s");
   }

}
