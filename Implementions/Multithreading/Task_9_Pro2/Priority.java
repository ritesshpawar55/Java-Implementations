package Task_9_Pro2;

public class Priority extends Thread{
	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();
		
		int a = t.getPriority();
		System.out.println("Default priority: "+a);
		
		try {
			t.setPriority(Thread.MAX_PRIORITY);
			System.out.println("Max Priority: "+t.getPriority());
		} catch(Exception e) {
			System.out.println("Catched.");
		}
		
		try {
			t.setPriority(Thread.MIN_PRIORITY);
			System.out.println("Min priority: "+t.getPriority());
		}catch(Exception e) {
			System.out.println("catched.");
		}
	}
}
