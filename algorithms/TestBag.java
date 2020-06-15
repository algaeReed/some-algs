import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
public class TestBag{
   public static void main(String[] args){
      LinkedBag<String> bag = new LinkedBag<>();
      
      while( !StdIn.isEmpty() ){
         String s = StdIn.readString();
         StdOut.println(s);
         bag.add(s); 
      }   
     StdOut.println("***************************");

     for (String s: bag)
        StdOut.println(s); 

     StdOut.println("***************************");
   }

}
