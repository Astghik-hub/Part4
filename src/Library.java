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
        books.add(new Book("How to Speak Chinese", "Your Name", 9.99, "To be confirmed", "123-4-56-789012-3"));
        books.add(new Book("Java Programming", "John Doe", 19.99, "Tech Publisher", "456-7-89-123456-7"));
        books.add(new Book("Learn Python", "Jane Smith", 15.99, "Code World", "789-0-12-345678-9"));
        books.add(new Book("C++ Essentials", "Albert Johnson", 25.99, "Pro Books", "123-4-56-789012-3"));
        books.add(new Book("Web Development Basics", "Emily Davis", 12.99, "Web Co.", "456-7-89-123456-8"));
    }

    /**
     * constructor with the arraylist
     *
     * @param books an Arraylist of books
     */
    public Library(ArrayList<Book> books) {
        this.books = new ArrayList<>(books);
    }

    /**
     * Search method
     * @param keyword a word
     * @return all books with the keyword
     */
    public ArrayList<Book> searchBook(String keyword) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                book.getAuthor().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(book);
            }
        }
        return result;
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