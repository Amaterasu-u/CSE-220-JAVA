import java.util.*;
public class String_p10 {
    public static void main(String[] args) {
        String str1="mug";
        String str2="gum";
        char [] a = str1.toCharArray();
        char [] b = str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        
      System.out.println(Arrays.equals(a, b));
    }
}
