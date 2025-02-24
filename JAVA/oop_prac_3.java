import java.util.*;

public class oop_prac_3 {
    public static void main(String args[]){
        Scanner cin = new Scanner( System.in);
       Rectangle ob1 = new Rectangle(5,4);
       Circle ob2 = new Circle(5);
       System.out.println(ob1.area());
       System.out.println(ob1.perimetre());
       System.out.println(ob2.area());
       System.out.printf("%.2f%n" ,ob2.perimetre());
    ob1.kirre();
    ob2.kirre();
    }
}

interface Hello{
    public void kirre();

}

interface Shape{
    public double area();
    public double perimetre(); 
}

class Rectangle implements Shape , Hello{
    private double length;
    private double width;
    public 
    Rectangle(double a , double b){
        length = a;
        width = b;
    }
   public void kirre(){
    System.out.println("Hello");
   }
    public double area(){
        return length * width;
    }

    public double perimetre(){
        return 2 * (length + width);
    }
}

class Circle implements Shape , Hello{
    private double radius;
    public 
    Circle(double a){
        radius = a;
    }
public void kirre(){
    System.out.println("Hello");
}
    public double area(){
        return 3.14*radius*radius;
    }

    public double perimetre(){
        return 2 *3.14*radius;
    }
}
