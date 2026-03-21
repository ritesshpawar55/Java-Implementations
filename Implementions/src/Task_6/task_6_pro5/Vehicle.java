package task_6_pro_5;

public interface Vehicle {
	
	default void startEngine() {
		System.out.println("Engine started.");
	}
}



