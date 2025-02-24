import java.util.Arrays;

public class Array_p9 {
        public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {1, 3, 6};
        int minLength = Math.min(arr1.length, arr2.length);
        int i = 0;
        while (i < minLength && arr1[i] == arr2[i]) {
            i++;
        }
        int[] commonPrefix = Arrays.copyOf(arr1, i);
        System.out.println("Longest common prefix: " + Arrays.toString(commonPrefix));
    }
}
