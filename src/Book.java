/**
 * Class that allows the user to store information about a book
 */
public class Book {
    // the book's title
    private String title;
    // the book's author
    private String author;
    // the book's price
    private double price;
    // the book's publisher
    private String publisher;
    // the book's isbn
    private String isbn;

    /**
     * Default Constructor
     */
    public Book() {
        title = "";
        author = "";
        price = 0;
        publisher = "";
        isbn = "";
    }

    /**
     * Constructor with the title
     *
     * @param title title of the book
     */
    public Book(String title) {
        this.title = title;
        this.author = "";
        this.price = 0;
        this.publisher = "";
        this.isbn = "";
    }

    /**
     * Constructor with all parameters
     *
     * @param title     title of the book
     * @param author    author of the book
     * @param price     price of the book
     * @param publisher publisher of the book
     * @param isbn      isbn of the book
     */
    public Book(String title, String author, double price, String publisher, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    /**
     * Copy Constructor
     *
     * @param anotherBook another object of the class book
     */
    public Book(Book anotherBook) {
        title = anotherBook.title;
        author = anotherBook.author;
        price = anotherBook.price;
        publisher = anotherBook.publisher;
        isbn = anotherBook.isbn;
    }

    /**
     * method that checks the isbn of the book
     *
     * @return 0 if the isbn is of length 13, 1 if the length is 17
     * and -1 if the isbn is invalid
     */
    public int checkIsbnStatus() {
        int checkIsbn;
        if (isbn.length() == 13) {
            checkIsbn = 0;
        } else if (isbn.length() == 17) {
            checkIsbn = 1;
        } else checkIsbn = -1;
        return checkIsbn;
    }

    /**
     * method that converts every word in the title to titlecase
     *
     * @param name title of the book
     * @return the title with every word in titlecase
     */
    public String toTitleCase(String name) {
        String c = "";
        if (name.charAt(0) == ' ') {
            c += " ";
        } else {
            c += Character.toUpperCase(name.charAt(0));
        }
        for (int i = 1; i < name.length(); i++) {
            if (name.charAt(i - 1) == ' ') {
                c += Character.toUpperCase(name.charAt(i));

            } else {
                c += Character.toLowerCase(name.charAt(i));
            }
        }
        return c;
    }

    /**
     * the toString method
     *
     * @return information of the book
     */
    public String toString() {
        String str = String.format("%-9s: %s", "Title", title = toTitleCase(title));
        str += String.format("%-9s: %s", "Author", author = toTitleCase(author));
        str += String.format("%-9s: %.2f", "Price", price);
        str += String.format("%-9s: %s", "Publisher", publisher);
        str += String.format("%-9s: %s", "ISBN", isbn);
        return str;
    }

    /**
     * equals method
     *
     * @param anotherBook another object of the class Book
     * @return true if both objects are equal
     */
    public boolean equals(Book anotherBook) {
        return title.equals(anotherBook.title) &&
               author.equals(anotherBook.author) &&
               price == anotherBook.price &&
               publisher.equals(anotherBook.publisher) &&
               isbn.equals(anotherBook.isbn);
    }

    /**
     * clone method
     *
     * @return a copy of a Book object
     */
    public Book clone() {
        return new Book(this);
    }
    /**
     * get method for the title
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }
    /**
     * set method for the title
     *
     * @param title the title of the book
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * get method for the author
     *
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * set method for author
     *
     * @param author author of the book
     */
    public void setAuthor(String author) {
        this.author = author;
    }
    /**
     * get method for the price
     *
     * @return the price
     */
    public double getPrice() {
        return price;
    }
    /**
     * set method for price
     *
     * @param price price of the book
     */
    public void setPrice(double price) {
        this.price = price;
    }
    /**
     * get method for the publisher
     *
     * @return the publisher
     */
    public String getPublisher() {
        return publisher;
    }
    /**
     * set method for publisher
     *
     * @param publisher publisher of the book
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    /**
     * get method for the isbn
     *
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }
    /**
     * set method for isbn
     *
     * @param isbn isbn of the book
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
