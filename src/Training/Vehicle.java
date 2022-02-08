package Training;

public class Vehicle {

	private String brand = "BMW";
	public void honk() {
		System.out.println("Horn Peep Peep");
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
}

class Car extends Vehicle {
	
	String model = "5 Series";
	int modelDt = 2020;
}