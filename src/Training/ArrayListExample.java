package Training;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    cars.add("Mercedes");
	    cars.add("Chevvy");
	    System.out.println(cars);
	    cars.set(2, "Honda");
	    System.out.println(cars.get(2));


	}

}
