import java.util.*;
public class Library_Management_System {
    // Main class to demonstrate the Library Management System
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Magazine magazine1 = new Magazine("National Geographic", "Various Authors", "Science");

        library.addBook(book1);
        library.addBook(magazine1);

        library.displayBooks();
    }
}

// Book class representing a book in the library
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

// Subclass of Book, representing a Magazine
class Magazine extends Book {
    private String category;

    public Magazine(String title, String author, String category) {
        super(title, author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}

// Library class managing the collection of books
class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
            if (book instanceof Magazine) {
                System.out.println("Category: " + ((Magazine) book).getCategory());
            }
        }
    }
}


/*This code is a Java program that demonstrates a basic Library Management System using 
object-oriented programming (OOP) principles. The program creates a library, 
adds books (including a subclass for magazines), and displays the details of the books
 in the library.

Let's break down the code step by step:

1. **Main Class**: The program starts with a `Library_Management_System` class,
 which contains the `main` method. This method creates an instance of the `Library` class, 
 adds a `Book` and a `Magazine` to the library, and then displays the list of books
  in the library.

2. **Book Class**: The `Book` class is the parent class representing a general book.
 It has private fields for the book's title and author. The class provides a constructor
  to initialize these fields and getter methods to retrieve the title and author of the book.

3. **Magazine Class**: The `Magazine` class is a subclass of `Book` that
 represents a magazine. It adds a new field for the magazine's category and
  a constructor that accepts the title, author, and category. The `Magazine` class
   uses the `super` keyword to call the constructor of the parent `Book` class and
    initializes the shared fields.

4. **Library Class**: The `Library` class is responsible for managing a collection of books.
 It contains an `ArrayList` to store the books. The class has methods to add books to the
  collection and to display the details of the books in the library. The `displayBooks` method 
  iterates over the list of books, prints the title and author for each book, and if the book
   is an instance of a `Magazine`, it also prints the category.

In summary, this code demonstrates a simple Library Management System that utilizes class
 inheritance (with the `Book` and `Magazine` classes), polymorphism (checking the type of
  book to display additional details for magazines), and encapsulation (private fields with
   public getter methods) to manage a collection of books in a library. It shows how OOP 
   principles can be used to create well-structured and modular code.*/