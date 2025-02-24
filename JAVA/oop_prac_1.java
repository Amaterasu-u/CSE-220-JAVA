import java.util.*;


public class oop_prac_1 {
    public static void main(String args[]){
  Scanner cin = new Scanner(System.in);
  System.out.println("Enter the name of the author:" );
  String name = cin.nextLine();
  System.out.println("Enter the Title of the book:" );
  String title = cin.nextLine();
  System.out.println("Enter the price of the book:" );
  int price = cin.nextInt();
    Book ob1 = new Book(name , title , price);
    System.out.println("Book Details:");
    ob1.PrintDetails();
        cin.close();
    }
}

class Book{
    String title,author;
    double price;
    public
    Book(String title, String author, double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    String getT(){
        return title;
    }
    String getA(){
        return author;
    }
    double getP(){
        return price;
    }

    void PrintDetails(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }

}
