package Practice;

import java.util.HashMap;

public class Arrays {

	public static void main(String[] args) {
		
		//Single dimensional Arrays
		/*int[] myInts = {10,20,34,46,76,67,87,89,54};
		String[] fruits = {"Apple", "Mango", "Grapes", "Strawberry", "Blue Berry", "Orange"};
		
		for(int i=0;i<myInts.length;i++) {
			System.out.println(myInts[i]);
		}
		
		for(String f : fruits) {
			System.out.println(f);
		}
		
		//Multi dimensional arrays
		String[][] fruits1 = {{"Strawberry", "Blue Berry", "Rasberry"}, {"Fuji Apple", "Green Apple", "Honeycrisp Apple", "Gala Apple"}, {"Orange", "Grapefruit", "Mosambi"}, {"Litchie", "Rabutan", "Dragon fruit"}};
		for(String[] fts : fruits1) {
			for(String fruit : fts) {
				System.out.println(fruit);
			}
			System.out.println("\n");
		}
		
		//another way
		for(int i=0; i<fruits1.length; i++) {
			for(int j=0; j<fruits1[i].length; j++) {
				System.out.println(fruits1[i][j]);
			}
			System.out.println("\n");
		}*/
		
		HashMap<String, Integer> person = new HashMap<String, Integer>();
		person.put("Nancy", 23);
		person.put("Kim", 30);
		person.put("Roy", 40);
		System.out.println(person);
		person.forEach(
	            (key, value)
	                -> System.out.println(key + " = " + value));
		
	}

}
