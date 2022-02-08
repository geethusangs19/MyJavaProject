package Training;

public class Animal {
	public void animalSound() {
	System.out.println("Animals make sounds");	
	}
}

class Dog extends Animal {
	
	public void animalSound() {
		System.out.println("Dog bark: Bow Bow");
	}
	
}

class Cat extends Animal {
	
	public void animalSound() {
		System.out.println("Cat says: Meow Meow");
	}
}
