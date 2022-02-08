package Practice;

public class SoftDrinksApp {
	public void getTaste() {
		System.out.println("Every soft drinks has differet taste and some hidden sugar content");
	}	
	
}

class Coke extends SoftDrinksApp{
	public void getTaste(double sugarPercent) {
		System.out.println("Coke is bitter sweet and has " + sugarPercent + " Sugar");
	}
}

class Sprite extends SoftDrinksApp{
	public void getTaste(double sugarPercent) {
		System.out.println("Sprite is corbonated sweet drink and has " + sugarPercent + " Sugar");
	}
}

class Fanta extends SoftDrinksApp{
	public void getTaste(double sugarPercent) {
		System.out.println("Fanta is a sweet and tangy drink and has " + sugarPercent + " Sugar");
	}
}
