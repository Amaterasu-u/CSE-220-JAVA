import java.util.Arrays;

public class Array_p8 {
     public static void main(String[] args) {
        int[] arr = { -1, 2, -1, 1, 4 };
        int n = arr.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        for (int num : arr) {
            if (num >= 0 && num < n) {
                result[num] = num;
            }
        }
        System.out.println("Rearranged array: " + Arrays.toString(result));
    }
}
