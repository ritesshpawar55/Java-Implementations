package task_5_10;

public class Author {
	String authorname;
	String address;
	Double published;
	public Author(String authorname, String address, Double published) {
	
		this.authorname = authorname;
		this.address = address;
		this.published = published;
	}
	public void Display3()
	{
		System.out.println(authorname+" "+address+" "+published);
	}
	

}