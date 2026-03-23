package Task_5.task_5_10;

public class LibraryApp {
	public static void main(String[] args)
	{
		Library l1=new Library(34567,"java");
		l1.Display();
		Book b1=new Book("java Histroy",200.1,1000.00);
		b1.Display2();
		Author a1= new Author("james","usa-NewYork",1997.2);
		a1.Display3();
		
	}

}