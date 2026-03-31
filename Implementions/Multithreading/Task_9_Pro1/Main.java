package Task_9_Pro1;

public class Main extends Thread{

	public static void main(String[] args) {
		
		Pro1 p = new Pro1();
		One o = new One();
		
		p.start();
		o.start();
	}
}
