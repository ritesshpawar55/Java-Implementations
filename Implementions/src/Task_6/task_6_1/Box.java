//assignment 6-1
package box;
//import java.util.Scanner;
public class Box {
	int length;
	int breadth;
	int height;
	
	Box(int l, int b, int h){
		this.length=l;
		this.breadth=b;
		this.height=h;
	}
	
	int area() {
		return length*breadth + breadth*height +length*height; 
	}
	
	int volume() {
		return 2 * (length*breadth + breadth*height +length*height);
	}
	
	public static void main(String[] args) {
		Box3d b = new Box3d(11,27,33);	
		
		System.out.println("area: "+b.area());
		System.out.println("volume: "+b.volume());
	}
}
