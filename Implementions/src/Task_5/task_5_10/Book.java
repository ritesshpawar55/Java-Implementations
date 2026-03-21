package task_5_10;

public class Book {
	String tittle;
	Double pages;
	Double price;
	public Book(String tittle, Double pages, Double price) {
	
		this.tittle = tittle;
		this.pages = pages;
		this.price = price;
	}
	public void Display2()
	{
		System.out.println(tittle+" "+pages+" "+price);
	}
	

}
