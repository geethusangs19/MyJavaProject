package Practice;

public class Overloading {

	public static void main(String[] args) {
		
		System.out.println("Multiplication of 2 integers(5, 50) :" + multiply(5, 50));
		System.out.println("Multiplication of integer and double(10, 20.15) :" + multiply(10, 20.15));
		System.out.println("Multiplication of 2 doubles and 1 integer(5.75, 12.36, 60) :" + multiply(5.75, 12.36, 60));
		System.out.println("Multiplication of 3 integers(10, 32, 47) :" + multiply(10, 32, 47));


	}

	public static int multiply(int a, int b) {
		return a*b;
	}
	
	public static double multiply(int a, double b) {
		return a*b;
	}
	
	public static double multiply(double a, double b, int c) {
		return a*b*c;
	}
	
	public static int multiply(int a, int b, int c) {
		return a*b*c;
	}
}
