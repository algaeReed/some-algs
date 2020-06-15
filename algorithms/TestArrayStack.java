import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
public class TestArrayStack{
   public static void main(String[] args){
      ArrayStack<Strign> stack = new ArrayStack<>();
      
      while( !StdIn.isEmpty() ){
         String s = StdIn.readString();
         StdOut.println(s);
         stack.push(s); 
      }   
     StdOut.println("***************************");
     for (String s: stack)
        StdOut.println(s);
   }

}
