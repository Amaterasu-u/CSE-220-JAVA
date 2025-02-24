import java.util.*;

public class oop_eval {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);

        Lib library = new Lib(cin);
    
        library.addBookAndMembers();
    
        System.out.println("\n--- Library Books ---");
        library.displayAllBooks();
        System.out.println("\n--- Library Members ---");
        library.displayAllMembers();
        
        System.out.println("\nEnter member id to borrow a book:");
        String memberId = cin.nextLine();
        LibMem member = library.searchMember(memberId);
        if (member == null) {
            System.out.println("Member not found!");
        } else {
            System.out.println("Enter title of the book to borrow:");
            String title = cin.nextLine();
            Book book = library.searchBook(title);
            if (book == null) {
                System.out.println("Book not found!");
            } else {
                member.borrowBook(book);
            }
        }
        
        if (member != null) {
            member.displayBorrowedBooks();
        }
        
        System.out.println("\nEnter title of the book to return:");
        String retTitle = cin.nextLine();
        if (member != null) {
            member.returnBook(retTitle);
        }
        
        cin.close();
    }
}


class Book {
    private String title, author, genre;
    private boolean available;
    
    public Book() {
        available = true;
    }
    

    public boolean borrowBook() {
        if (available) {
            available = false;
            return true;
        }
        return false;
    }
    

    public void returnBook() {
        available = true;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void set(String a, String b, String c) {
        title = a;
        author = b;
        genre = c;
    }
    
    // Display book details
    public void display() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre : " + genre);
        System.out.println("Status: " + (available ? "Available" : "Not Available"));
        System.out.println("-------------------------");
    }
    
    public void mark_av() {
        available = true;
    }
}


class LibMem {
    private String id, name;
    private Book[] borrowedBooks; 
    private int count; 
    
    public LibMem() {
        borrowedBooks = new Book[3];
        count = 0;
    }
    
    public void set(String a, String b) {
        id = a;
        name = b;
    }
    
    public String getId() {
        return id;
    }
    
    public void displayMem() {
        System.out.println("Member ID: " + id + ", Name: " + name);
    }
    
    public boolean borrowBook(Book b) {
        if (count < 3) {
            if (b.borrowBook()) { 
                borrowedBooks[count++] = b;
                System.out.println("Borrowed Book: " + b.getTitle());
                return true;
            } else {
                System.out.println("The book '" + b.getTitle() + "' is currently not available.");
                return false;
            }
        } else {
            System.out.println("Borrowing limit reached. Cannot borrow more than 3 books.");
            return false;
        }
    }
    

    public boolean returnBook(String title) {
        for (int i = 0; i < count; i++) {
            if (borrowedBooks[i].getTitle().equalsIgnoreCase(title)) {
                borrowedBooks[i].returnBook();
                System.out.println("Returned Book: " + borrowedBooks[i].getTitle());
                // Shift remaining books left in the array
                for (int j = i; j < count - 1; j++) {
                    borrowedBooks[j] = borrowedBooks[j + 1];
                }
                borrowedBooks[--count] = null;
                return true;
            }
        }
        System.out.println("Book not found in your borrowed list.");
        return false;
    }
    

    public void displayBorrowedBooks() {
        System.out.println("\nBorrowed Books for " + name + ":");
        if (count == 0) {
            System.out.println("No books borrowed.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + borrowedBooks[i].getTitle());
            }
        }
    }
}


class Lib {
    private Book[] books;
    private LibMem[] members;
    private Scanner cin;
    
    public Lib(Scanner scanner) {
        cin = scanner;
        books = new Book[3];
        members = new LibMem[3];
        
        for (int i = 0; i < 3; i++) {
            books[i] = new Book();
        }
        for (int i = 0; i < 3; i++) {
            members[i] = new LibMem();
        }
    }

    public void addBookAndMembers() {

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Book " + (i + 1) + " (Title, Author, Genre):");
            String a = cin.nextLine();
            String b = cin.nextLine();
            String c = cin.nextLine();
            books[i].set(a, b, c);
            books[i].mark_av();
        }
        

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Member " + (i + 1) + " (ID, Name):");
            String a = cin.nextLine();
            String b = cin.nextLine();
            members[i].set(a, b);
        }
    }
    

    public void displayAllBooks() {
        for (int i = 0; i < 3; i++) {
            books[i].display();
        }
    }
    

    public void displayAllMembers() {
        for (int i = 0; i < 3; i++) {
            members[i].displayMem();
        }
    }
    

    public Book searchBook(String title) {
        for (int i = 0; i < 3; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }
    

    public LibMem searchMember(String id) {
        for (int i = 0; i < 3; i++) {
            if (members[i].getId().equalsIgnoreCase(id)) {
                return members[i];
            }
        }
        return null;
    }
}

