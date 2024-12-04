import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
        books.add(new Book());
        books.add(new Book());
        books.add(new Book());
        books.add(new Book());
        books.add(new Book());
    }

    public Library(ArrayList<Book> books) {
        this.books = new ArrayList<>(books);
    }

    public ArrayList<Book>searchBook(String keyword){
        ArrayList<Book> book= new ArrayList<>(book);
        if (keyword == )
    }

    public Library(Library anotherLibrary) {
        this.books = new ArrayList<>(anotherLibrary.books);
    }

    public boolean equals(Library anotherLibrary) {
        return books == anotherLibrary.books;
    }

    public String toString() {
        return books.toString();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}