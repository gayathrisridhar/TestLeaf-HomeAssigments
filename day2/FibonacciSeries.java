package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// declare the basic values 
	int a=0,b=1,c,num=7;
	
	System.out.println(a);
	System.out.println(b);
	
	for (int i = 1; i <= num-2; i++) {
		c= a+b;
		System.out.println(c);
		
		a=b;
		b=c;
	}
	}

}
