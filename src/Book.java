public class Book {
    private String title;
    private String author;
    private double price;
    private String publisher;
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
     */
    public Book(String title) {
        this.title = title;
        this.author = "";
        this.price = 0;
        this.publisher = "";
        this.isbn = "";
    }

    /**
     * Constructor with all data members
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
     */
    public Book(Book anotherBook) {
        title = anotherBook.title;
        author = anotherBook.author;
        price = anotherBook.price;
        publisher = anotherBook.publisher;
        isbn = anotherBook.isbn;
    }

    public int checkIsbnStatus() {
        int checkIsbn;
        if (isbn.length() == 13) {
            checkIsbn = 0;
        } else if (isbn.length() == 17) {
            checkIsbn = 1;
        } else checkIsbn = -1;
        return checkIsbn;
    }

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

    public String toString() {
        String str = String.format("%-9s: %s", "Title", title = toTitleCase(title));
        str += String.format("%-9s: %s", "Author", author = toTitleCase(author));
        str += String.format("%-9s: %.2f", "Price", price);
        str += String.format("%-9s: %s", "Publisher", publisher);
        str += String.format("%-9s: %s", "ISBN", isbn);
        return str;
    }
    public boolean equals(Book anotherBook) {
        return title.equals(anotherBook.title) &&
               author.equals(anotherBook.author) &&
               price == anotherBook.price &&
               publisher.equals(anotherBook.publisher) &&
               isbn.equals(anotherBook.isbn);
    }
    public Book clone() {
        return new Book(this);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
