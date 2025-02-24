import java.util.ArrayList;
import java.util.List;

public class String_p11 {
     public static void main(String[] args) {
        String text = "apple,banana,orange,grape";
        char delimiter = ',';

        List<String> result = splitString(text, delimiter);

        System.out.println("Split Strings:" + result);
        // for (String str : result) {
        //     System.out.println(str);
        // }
    }

    public static List<String> splitString(String text, char delimiter) {
        List<String> result = new ArrayList<>();
        int start = 0;

        for (int i = 0; i < text.length(); i++) {
      
            if (text.charAt(i) == delimiter) {
         
                result.add(text.substring(start, i));
                start = i + 1;
            }
        }

        if (start < text.length()) {
            result.add(text.substring(start));
        }

        return result;
    }
}
