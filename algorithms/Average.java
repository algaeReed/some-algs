import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Average{
     public static void main(String[] args){
        int N = 0;
        double sum = 0.0
        while (!stdIn.isEmpty()){
          double x = StdIn.readDouble();
            sum += x;
           N++;
       }
      if(N !=0){
      StdOut.printf("The average is %.2f\n",sum/N);
    }
      else{
      StdOut.printf("No date entered.")
      }
    }
}
