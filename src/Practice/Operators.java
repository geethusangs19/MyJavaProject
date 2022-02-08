package Practice;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Arithmatic Operators
		//Get user inputs
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input 1(integer)");
		int input1 = sc.nextInt();
		System.out.println("Enter input 2(integer)");
		int input2 = sc.nextInt();
		//int input1 = 10;
		//int input2 = 5;
		System.out.println("Enter input 3(double)");
		double input3 = sc.nextDouble();
		System.out.println("Enter input 4(double)");
		double input4 = sc.nextDouble();
		System.out.println("Enter input 5(double)");
		double input5 = sc.nextDouble();
		System.out.println("Enter input 6(double)");
		double input6 = sc.nextDouble();
		
		System.out.println("Arithmetic Operators");
		System.out.println("==========================================");
		System.out.println("Addition            : " + (input1 + input2));
		System.out.println("Subtraction         : " + (input1 - input2));
		System.out.println("Multiplication      : " + (input1 * input2));
		System.out.println("Division            : " + (input1 / input2));
		System.out.println("Modular             : " + (input1 % input2));
		System.out.println("Increment           : " + (++input1));
		System.out.println("Decrement           : " + (--input2));
		
		//Comparison Operators
		System.out.println("\nComparison Operators");
		System.out.println("==========================================");
		if(input1 == input2) {
			System.out.println(input1+" is equal to "+input2);
		}
		else if(input1 > input2) {
			System.out.println(input1+" is greater than "+input2);
		}
		else {
			System.out.println(input1+" is lesser than "+input2);
		}
		
		//Logical Operators
		System.out.println("\nLogical Operators");
		System.out.println("==========================================");
		if(input3 >= input4 && input5 <= input6) {
			System.out.println("Both Conditions are true");
		}
		else if(input3 >= input4 || input5 <= input6) {
			System.out.println("Either the first or the second condition is true");
		}
		else {
			System.out.println("Both conditiona are false");
		}
		
	}

}
