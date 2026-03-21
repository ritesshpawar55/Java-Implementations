package rectangle;
import java.util.Scanner;
public class Rectangle {
	int length;
	int width;
	
	Rectangle(int length, int width){
		this.length=length;
		this.width=width;
	}
	
	void set() {
			Scanner s = new Scanner(System.in);
			
			System.out.println("enter length: ");
			length= s.nextInt();
			
			System.out.println("enter width: ");
			width = s.nextInt();
			
			s.close();
	}
	
	int getArea() {
		return length * width; 
	}
	
	int getPerimeter() {
		return 2 * (length + width);
	}
}
