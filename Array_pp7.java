import java.util.Arrays;
import java.util.Collections;

public class Array_pp7 {
        public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        Collections.rotate(Arrays.asList(arr), k);
        System.out.println("Rotated array: " + Arrays.toString(arr));
    }
}
// public class LeftRotateArray {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         int k = 2; 
//         k = k % arr.length; 

//       
//         reverse(arr, 0, k - 1);
//       
//         reverse(arr, k, arr.length - 1);
//      
//         reverse(arr, 0, arr.length - 1);

//         System.out.println(Arrays.toString(arr));
//     }

//     private static void reverse(int[] arr, int start, int end) {
//         while (start < end) {
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }
//     }