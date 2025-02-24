import java.util.*;
public class Array_Problems {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
       Integer arr[] = new Integer[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr);
        Collections.reverse(Arrays.asList(arr));
        int a=arr[0];
        int b=arr[1];
        System.out.println("MAXIMUM PRODUCT: "+ a*b);
        scanner.close();

    }
}
