package Task_6.task_6_pro8;

public class Greet {
	
	public void generateGreeting() {
		
		Greeting g = new Greeting() {

			@Override
			public void sayHello() {
				System.out.println("Hieee Hello");
			}
		};
		g.sayHello();
	}	
}