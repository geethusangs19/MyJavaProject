package Practice;

public class Fruits {
	public void getTaste() {
		System.out.println("Each fruit has different taste");
	}
}

class Apple extends Fruits{
	public void getTaste() {
		System.out.println("Apple is Sweet and Crunchy");
	}
}

class Orange extends Fruits{
	public void getTaste() {
		System.out.println("Orange is Sweet and Tangy");
	}
}

class Tamarind extends Fruits{
	public void getTaste() {
		System.out.println("Tamarind is sour");
	}
}
