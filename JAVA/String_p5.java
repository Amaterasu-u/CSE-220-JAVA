import java.util.HashSet;
import java.util.Set;

public class String_p5 {
        public static void main(String[] args) {
        String str = "aba";
        printSubstrings(str);
    }

    public static void printSubstrings(String str) {
        Set<String> substrings = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                substrings.add(str.substring(i, j));
            }
        }
        substrings.forEach(System.out::println);
    }
}
