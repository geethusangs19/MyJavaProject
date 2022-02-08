package Practice;

public class ConstructorSample {

	String fname;
	String lname;
	int age;
	
	public ConstructorSample(int age1, String fname1, String lname2) {
		fname = fname1;
		lname = lname2;
		age = age1;
	}
	static void welcome() {
		System.out.println("Welcome to Code Lab Tech\n");
	}
	public void display() {
		
		System.out.println("Student Details");
		System.out.println("=======================================================");
		System.out.println("First-Name                  : " + fname);
		System.out.println("Last-Name                   : " + lname);
		System.out.println("Age                         : " + age);
	}
	public static void main(String[] args) {
		
		welcome();
		ConstructorSample myObj = new ConstructorSample(30, "Alayna", "Ajith");
		myObj.display();
	}

}
