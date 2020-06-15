public class GCD {
   public static long gcd(long p, long q){
	if(q==0)
	return p;
	long r = p%q;
	while (r != 0) {
	p = q;
	q = r;
	r = p % q;
	}
	return q;
    }
    public static void main(String[] args){
	System.out.println("gcd(91和63)="+gcd(91, 63));
}
}
