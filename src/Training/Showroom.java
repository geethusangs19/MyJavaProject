package Training;

public class Showroom {

	public static void main(String[] args) {
		
		Car myObj = new Car();
		
		
		System.out.println(myObj.getBrand() );
		System.out.println(myObj.model);
		System.out.println(myObj.modelDt);
		myObj.honk();

	}

}
