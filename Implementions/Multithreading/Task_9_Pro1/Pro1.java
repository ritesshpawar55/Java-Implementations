package Task_9_Pro1;

public class Pro1 extends Thread {
	
	@Override
	public void run() {
		for(int i=0; i<=15; i++) {
			System.out.println("GOOD MORNING");
		}
	}
}
