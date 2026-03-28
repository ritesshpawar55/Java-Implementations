package Task_9_Pro3;

public class SleepDemo extends Thread{
	
	 public void run() {
		 
		 try {
			 for(int i=0; i<=10; i++){
				 System.out.println("Good Night...");
			 	 Thread.sleep(500);
			 }
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
	 
	 public void runn() {
		 try {
			 for(int i=0; i<=10;i++) {
				 System.out.println("Good Morno...");
			 	 Thread.sleep(700);
			 }
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
	public static void main(String[] args) throws InterruptedException {
		
		SleepDemo s = new SleepDemo();
		s.start();
		s.join();
		s.runn();
	}
}
