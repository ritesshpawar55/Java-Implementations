package encapsulation_practice;

import java.util.*;

class Library {
    private List<String> books = new ArrayList<>();

    public void addBook(String book) {
        books.add(book);
    }

    public List<String> getBooks() {
        return new ArrayList<>(books); // return copy
    }

    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook("Java");
        lib.addBook("Python");

        System.out.println("Books: " + lib.getBooks());
    }
}
