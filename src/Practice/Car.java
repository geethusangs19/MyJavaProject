package Practice;

public class Car {

	//Create a fullThrottle() method
	  public void fullThrottle() {
	    System.out.println("The car is going as fast as it can!");
	  }

	  // Create a speed() method and add a parameter
	  public void speed(int maxSpeed) {
	    System.out.println("Max speed is: " + maxSpeed);
	  }
	  
	  public void color(String color) {
		  System.out.println("Available Color: " + color);
	  }
	  
	  // Inside main, call the methods on the myCar object
	  public static void main(String[] args) {
	    Car myCar = new Car();     // Create a myCar object
	    Car sCar = new Car();
	    myCar.fullThrottle();      // Call the fullThrottle() method
	    myCar.speed(200); 
	    myCar.color("Red");// Call the speed() method
	    sCar.speed(150);
	    sCar.color("Black");
	  
	  }

}
