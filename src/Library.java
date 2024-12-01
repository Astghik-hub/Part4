import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
        books.add(new Book("Crime and Punishment"));
        books.add(new Book("War and Peace"));
        books.add(new Book("Moby Dick"));
        books.add(new Book("The Alchemist"));
        books.add(new Book("The Metamorphosis"));
    }

    public Library(ArrayList<Book> books) {
        this.books = new ArrayList<>(books);
    }

    public Library(Library anotherLibrary) {
        this.books = new ArrayList<>(anotherLibrary.books);
    }

    public boolean equals(Library anotherLibrary) {
        return
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}