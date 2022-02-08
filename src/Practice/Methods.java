package Practice;

public class Methods {

	public static void main(String[] args) {
		int[] numbers = {43, 56, 78, 13, 35, 47, 90};
		System.out.println("Sum               : " + (sum(30, 456.87)));
		System.out.println("Multiplication    : " + (multiply(25, 67.54)));
		System.out.println("The Max number is : " + (findMax(numbers)));
	}
	public static double sum(double input1, double input2) {
		return input1 + input2;
	}
	
	public static double multiply(double input1, double input2) {
		return input1 * input2;
	}
	
	public static int findMax(int[] numbers) {
		int max = 0;
		if(numbers.length > 0) {
			for(int i : numbers) {
				if(i > max) {
					max = i;
				}
			}
		}
		return max;
	}
}
