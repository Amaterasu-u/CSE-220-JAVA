import java.util.Arrays;
import java.util.stream.IntStream;

public class Array_p2 {
        public static void main(String[] args) {
        int[] arr1 = {5, 2, 9, 1, 5, 6};
        int[] arr2 = {3, 4, 7, 2, 5};
        int[] merged = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).distinct().sorted().toArray();
        System.out.println("Merged sorted array without duplicates: " + Arrays.toString(merged));
    }
}
