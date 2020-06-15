import edu.princeton.cs.algs4.StdDraw;
public class division {
  public static void main(String[] args){
  int N = 50;
  
  double[] a = new double[N];
  for (int i = 0; i < N; i++)
    a[i] = Math.random();
   
  double rw = 0.5 / N; 
  for (int i = 1; i <= N; i++){
     double x = (i-0.5) / N;
     double y = a[i-1] / 2;
     double rh = a[i-1] / 2;
     StdDraw.filledRectangle(x, y, rw, rh);
}
}
}
