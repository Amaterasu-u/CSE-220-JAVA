import java.util.*;
public class Array {
    public static void main(String [] args){
Scanner scanner = new Scanner(System.in);
int arr1[]=new int[5];
int arr2[]=new int[5];
for(int i=0;i<5;i++){
    arr1[i]=scanner.nextInt();
}
for(int i=0;i<5;i++){
    arr2[i]=scanner.nextInt();
}
System.out.println(Arrays.equals(arr1 , arr2));
System.out.println(Arrays.mismatch(arr1 , arr2));
Arrays.fill(arr1 , 5);
System.out.println(Arrays.toString(arr1));
int newArr[] =Arrays.copyOf(arr2 , 10);
System.out.println(Arrays.toString(newArr));
scanner.close();

    }
}
