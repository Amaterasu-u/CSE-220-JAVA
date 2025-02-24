

import java.util.*;
public class practice {
    public static void main(String [] args){

    }
}

class Lib{
private Book [] books;
private LibMem [] mems;
private Scanner cin;
public Lib(Scanner scanner){
   cin=scanner;
   for(int i=0;i<3;i++){
    books[i]=new Book();
   }
   for(int i=0;i<3;i++){    
    mems[i]=new LibMem();
    }

}
public void addBookMem(){
    for(int i=0;i<3;i++){
        System.out.println("Enter Book details "+ (i+1)+ ": ");
        cin.nextLine();
        String author=cin.nextLine();
        String title=cin.nextLine();
        int year=cin.nextInt();
        cin.nextLine();
        books[i].set(author , title , year);
        books[i].mark=true;
    }

    for (int i = 0; i < 3; i++) {
        System.out.println("Enter details for Member " + (i + 1) + " (ID, Name):");
        String a = cin.nextLine();
        String b = cin.nextLine();
        mems[i].set(a, b);
    }
}
public void displayAllBooks() {
    for (int i = 0; i < 3; i++) {
        books[i].display();
    }
}
public void displayAllMembers() {
    for (int i = 0; i < 3; i++) {
        mems[i].displayMem();
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
        if (mems[i].getId().equalsIgnoreCase(id)) {
            return mems[i];
        }
    }
    return null;
}

}
