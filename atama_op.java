package atama_op;

public class atama_op {
	public static void main(String[] args) {
		
		int    a = 10, b = 12,  c = 5;
		double d = 7,  e = 20, f = 18;
		
		a += b;
		b -= c;
		c *= d;
		f /= d;
		e %= d;
		
		System.out.println("d= " + d);
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		System.out.println("c= " + c);
		System.out.println("e= " + e);
		System.out.println("f= " + f);
	}

}
