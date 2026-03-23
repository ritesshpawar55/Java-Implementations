package Task_1;

class Third{
	public static void main(String[] args) {
		double radius = Double.parseDouble(args[0]);
		double area = Math.PI * (radius * radius);
		System.out.println("Area of Circle is "+area);
	}
}