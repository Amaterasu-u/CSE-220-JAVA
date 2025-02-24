import java.util.*;


public class oop_prac_2 {
    public static void main(String args[]){
        Scanner cin = new Scanner (System.in);
        Car [] ob1 = new Car[3];
        for(int i=0;i<3;i++){
        System.out.println("Enter the number of make: ");
        String make = cin.nextLine();
        System.out.println("Enter the number of model: ");
        String model = cin.nextLine();
        System.out.println("Enter the number of year: ");
        int year = cin.nextInt();
        cin.nextLine();
        System.out.println("Enter the number of Doors: ");
        int doors = cin.nextInt();
        cin.nextLine();
    ob1[i]=new Car(make , model , year , doors);

        }
        for(int i=0;i<3;i++){
   ob1[i].PrintDetails();
        }

    }
}

class Vehicle{
    private String make;
    private String model;
    private int year;
    public
    Vehicle(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    String getMake(){
        return make;
    }
    String getModel(){
        return model;

    }
    int getYear(){
        return year;
    }

    void PrintDetails(){
        System.out.println("Car Details: ");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle{
    private int numDoors;
    public
    Car(String make, String model, int year, int numDoors){
        super(make, model, year);
        this.numDoors = numDoors;
    }

    int getD(){
        return numDoors;
    }

    void PrintDetails(){
        super.PrintDetails();
        System.out.println("Door: "+numDoors);
    }
}