package Practice;

public class ObjectSample {

	int year = 2022;

	public static void main(String[] args) {
		ObjectSample objectSample = new ObjectSample();
		System.out.println("Current Year :" + objectSample.year + "\n");
		objectSample.printMessage("I love java programming");

	}
	
	public void printMessage(String message) {
		System.out.println(message);		
	}

}
