package Training;

public class Attributes {

	int x = 50;
	int y = 70;
	
	public void sanMethod() {
		System.out.println("Hey this is Sangeeta");
	}
		
	public static void main(String[] args) {
	
		Attributes sanObj = new Attributes();
		System.out.println(sanObj.x + sanObj.y);
		sanObj.y = 72;
		System.out.println(sanObj.x * sanObj.y);
		sanObj.sanMethod();

	}

}
