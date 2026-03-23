package Task_5.task_5_7;

public class Rectangle {
	Double length;
	Double width;
	//constructor
	public Rectangle(Double length, Double width) {
		this.length = length;
		this.width = width;
	}
	public void CalculateArea()
	{
		Double area;
		area=length*width;
		System.out.println("The CalculatedArea is :"+area);
		
	}
	public void Perimeter()
	{
		Double perimeter;
		perimeter=2 *length+width;
		System.out.println("The Calculatedperimeter is :"+perimeter);
	}
}