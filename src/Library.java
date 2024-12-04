import java.util.ArrayList;

/**
 * Class that stores books in a library
 */
public class Library {
    // an arraylist of books
    private ArrayList<Book> books;

    /**
     * default constructor
     */
    public Library() {
        books = new ArrayList<>();
        books.add(new Book());
        books.add(new Book());
        books.add(new Book());
        books.add(new Book());
        books.add(new Book());
    }

    /**
     * constructor with the arraylist
     *
     * @param books an Arraylist of books
     */
    public Library(ArrayList<Book> books) {
        this.books = new ArrayList<>(books);
    }

    public ArrayList<Book> searchBook(String keyword) {
        ArrayList<Book> book = new ArrayList<>(book);
        if (keyword ==)
    }

    /**
     * copy constructor
     *
     * @param anotherLibrary another object of the class Library
     */
    public Library(Library anotherLibrary) {
        this.books = new ArrayList<>(anotherLibrary.books);
    }

    /**
     * the equals method
     *
     * @param anotherLibrary another object of the class Library
     * @return true if the two objects are equal
     */
    public boolean equals(Library anotherLibrary) {
        return books == anotherLibrary.books;
    }

    /**
     * the toString method
     *
     * @return information about the object
     */
    public String toString() {
        return books.toString();
    }

    /**
     * get method for the books in the arraylist
     *
     * @return the books in the arraylist
     */
    public ArrayList<Book> getBooks() {
        return books;
    }

    /**
     * set method for the books in the arraylist
     *
     * @param books books in the arraylist
     */
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}