
import java.util.*;
public class Array_p4{
    public static void main(String[] args) {
                int[] arr = {1, 10, 3, 7, 2};
        Arrays.sort(arr);
        int maxGap = 0;
        for (int i = 1; i < arr.length; i++) {
            maxGap = Math.max(maxGap, arr[i] - arr[i - 1]);
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Largest gap: " + maxGap);
    }
    }
