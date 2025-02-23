import java.util.Arrays;

public class Array_p3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int key = 2;
        
        int index = Arrays.binarySearch(arr, key);
        if (index < 0) {
            System.out.println(-1);
        } 
        else {
          
   int left=index , right = index;
   while(left>0 && arr[left-1]==key){
    left--; 
   }
   while(right<arr.length-1 && arr[right+1]==key){
    right++;
   }
            System.out.println("Leftmost occurrence: " + left);
            System.out.println("Rightmost occurrence: " + right);
        }

        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("Largest number: " + max);
        
    }
}
