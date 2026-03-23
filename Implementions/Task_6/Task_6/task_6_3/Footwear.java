// assignment 6-3
package Task_6.task_6_3;

class Footwear{
	
	String type = "Sports";
	void type() {
	System.out.println("I am wearing "+type+" shoe.");
	}
}

class Adidas extends Footwear{
	
	String occasion = "Running Shoes";
	void occasion(){
		System.out.println("Its a "+occasion);
	}
}

class Duramo extends Adidas{
	int size = 42;
	void size() {
		System.out.println("Size is "+size);
	}

	public static void main(String [] agrs) {
		Duramo f = new Duramo();
		f.type();
		f.occasion();
		f.size();
	}
}