import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
public class TestLinkedStackOfString{
   public static void main(String[] args){
      LinkedStackOfString stack = new LinkedStackOfString();
      
      while( !StdIn.isEmpty() ){
         String s = StdIn.readString();
         StdOut.println(s);
         stack.push(s); 
      }   
     StdOut.println("***************************");
      while( !stack.isEmpty() ) {
         String s = stack.pop();
         StdOut.println(s);
     }

   }

}
