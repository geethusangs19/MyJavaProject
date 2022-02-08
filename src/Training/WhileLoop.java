package Training;

public class WhileLoop {

	public static void main(String[] args) {
		int sum = 0, i = 100;
		   
        while (i != 0) {
            sum += i;     // sum = sum + i;
            --i;
            System.out.println(sum);
        }
	   
        System.out.println("Sum = " + sum);


	}

}
