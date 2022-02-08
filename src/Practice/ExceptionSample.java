package Practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionSample {

	public static void main(String[] args) {
		
		int[] oddNumbers = {1,3,5,7,9};
		int age = 0;
		String fileName = "";
		
		try {
			System.out.println(oddNumbers[7]);
		}
		catch (Exception e) {
			System.out.println("Error : " + e.getMessage());
		}
		
		System.out.println("What's your age?\n");
		Scanner input = new Scanner(System.in);
		
		/*if(input.hasNextInt()) {
			age = input.nextInt();
			//input.close();
			
			if(age > 0) {
				if(age >= 18) {
					System.out.println("Access Granted!!");
				}
				else {
					input.close();
					throw new ArithmeticException("Access denied!! You're not old enough to view this content");
				}
			}			
		}*/
		
		System.out.println("Enter the file name to read\n");
		if(input.hasNextLine()) {
			fileName = input.nextLine();
			if(!fileName.isEmpty()) {
				fileName = "C:\\Users\\ajira\\OneDrive\\Desktop\\JAVA\\TestFiles\\" + fileName + ".txt";
				String str;
				try {
					BufferedReader bf = new BufferedReader(new FileReader(fileName));
					
					while((str = bf.readLine()) != null) {
						System.out.println(str);
					}
					bf.close();
				}
				catch(IOException e) {
					//System.out.println(e.getMessage());
					System.out.println("Error : " + fileName + " is Not Found here");
				}
			}
		}
		input.close();
		
	}

}
