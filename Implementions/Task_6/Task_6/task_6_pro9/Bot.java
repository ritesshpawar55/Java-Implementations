package Task_6.task_6_pro9;

public class Bot {
	
	void createShape() {
		 Shape s = new Shape() {

			@Override
			public void draw() {
				System.out.println("Bot is named to Circle.");
			}
		 };
		 s.draw();		 
	} 
	public static void main(String[] args) {
		Bot b = new Bot();
		
		b.createShape();
	}
}