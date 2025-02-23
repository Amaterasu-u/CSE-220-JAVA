import java.util.Arrays;

public class Array_p5 {
    public static void main(String[] args) {
                int[] arr = {1, 2, 3, 4, 5}; // Try with unsorted values e.g. {1, 3, 2, 4, 5}
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Is sorted in ascending order: " + isSorted);
    }
    }

