
import java.util.*;

public class Generic_Class {
    public static void main(String [] args){
          Scanner scanner = new Scanner(System.in);
          int n = scanner.nextInt();
          GenericPrinter <Integer> obj = new GenericPrinter(n);
          obj.Print();
          scanner.nextLine();
          String a=scanner.nextLine();
          GenericPrinter <String> obj1 = new GenericPrinter(a);
          obj1.Print();
          String [] arr={"Hello" , "HI" , "BYE"};
          printList(arr);
          scanner.close();
    }

    public static <T> void printList(T [] array){
        System.out.println(Arrays.toString(array));
    }
}

class GenericPrinter<T>{
    T element;
    public GenericPrinter(T element){
        this.element=element;
    }
    public void Print(){
        System.out.println(element);    
    }
}
