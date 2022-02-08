package Practice;

public class MultiThreading extends ATM implements Runnable{

	public static void main(String[] args) {
		Thread thread1 = new Thread("SMS Thread");
		Thread thread2 = new Thread("Email Thread");
		thread1.start();
		thread2.start();
		System.out.println(thread1.getName());
		System.out.println(thread2.getName());
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
