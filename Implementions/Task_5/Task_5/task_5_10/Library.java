package Task_5.task_5_10;
public class Library {
	int bookid;
	String name;
	public Library(int bookid, String name) {

		this.bookid = bookid;
		this.name = name;
	}
	public void Display()
	{
		System.out.println(bookid+" "+name);
	}
	

}