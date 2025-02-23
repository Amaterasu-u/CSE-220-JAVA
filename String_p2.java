import java.util.Arrays;

public class String_p2 {
        public static void main(String[] args) {
        String str = "dcba";
        String sortedStr = sortString(str);
        System.out.println("Sorted String: " + sortedStr);
        System.out.println("Is Already Sorted? " + sortedStr.equals(str));
    }

    public static String sortString(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
