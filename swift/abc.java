import edu.princeton.cs.algs4.Interval1d;
import edu.princeton.cs.algs4.Interval2d;
import edu.princeton.cs.algs4.Point;

public class MonteKarlo {
   public static void main(String[] args) {
	double xlo = Double.parseDouble(args[0]);
	double xhi = Double.parseDouble(args[1]);
	double xlo = Double.parseDouble(args[2]);
	double xhi = Double.parseDouble(args[3]);
	int N = Integer.parseInt(args[4]);
	
	Interval1D xInterval = new Interval1D(xlo, xhi);
	Interval1D yInterval = new Interval1D(ylo, yhi);
	Interval2D box = new Interval2D(xInterval, yInterval);
	box.draw();

 	Counter c = new Counter("Hits me");
	for(int i = 0; i < N; i++) {
	      double x = Math.random();
	      double y = Math.random();
	      Point p = new Point(x, y);
	      if (box.contains(p))
	         c.increment();
              else
	         P.draw();
	}
	StdOut.println(c);
	StdOut.printf("The area of box is %5.3f\n", box.area());
     }
}
