public class Stopwatch{
   private static final  long  start = System.currentTimeMillis();
   
   public double elapsedTime() {
      long now = System.currentTimeMillis();
      long delta = now - start;
      return delta / 1000.0;
   }
   
} 
