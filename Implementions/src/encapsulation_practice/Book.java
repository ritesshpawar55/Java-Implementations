package encapsulation_practice;

class Book {
    private final String title; // immutable field

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    
    public static void main(String[] args) {
        Book b = new Book("Java Basics");
        System.out.println("Title: " + b.getTitle());
    }
}
