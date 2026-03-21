package rectangle;

public class Main {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(0,0);
		r.set();
		
		 System.out.println("Area: " + r.getArea());
	     System.out.println("Perimeter: " + r.getPerimeter());
	}
}
