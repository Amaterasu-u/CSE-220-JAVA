import java.util.*;

class GenericContainer<T, U> {
    private List<T> elementsT;
    private List<U> elementsU;

    public GenericContainer() {
        elementsT = new ArrayList<>();
        elementsU = new ArrayList<>();
    }

    public void addElement(T element1, U element2) {
        elementsT.add(element1);
        elementsU.add(element2);
    }

    public void printElements() {
        System.out.println("Elements of Type T: " + elementsT);
        System.out.println("Elements of Type U: " + elementsU);
    }
}

public class Generic_class_2 {
    public static void main(String[] args) {
        // Container for Integer and String pairs
        GenericContainer<Integer, String> pairContainer = new GenericContainer<>();
        pairContainer.addElement(1, "Apple");
        pairContainer.addElement(2, "Banana");
        pairContainer.addElement(3, "Cherry");
        pairContainer.addElement(4, "Date");
        
        System.out.println("Pairs of Integer and String:");
        pairContainer.printElements();

        // Container for Double and Character pairs
        GenericContainer<Double, Character> doubleCharContainer = new GenericContainer<>();
        doubleCharContainer.addElement(5.6, 'A');
        doubleCharContainer.addElement(3.2, 'B');
        doubleCharContainer.addElement(9.8, 'C');
        doubleCharContainer.addElement(1.5, 'D');

        System.out.println("Pairs of Double and Character:");
        doubleCharContainer.printElements();
    }
}
