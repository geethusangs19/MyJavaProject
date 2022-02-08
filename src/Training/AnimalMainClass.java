package Training;

public class AnimalMainClass {

	public static void main(String[] args) {
		
		Animal myAnimal = new Animal();
		Animal myDog = new Dog();
		Animal myCat = new Cat();
		
		myAnimal.animalSound();
		myDog.animalSound();
		myCat.animalSound();

	}

}
