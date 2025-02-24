public class String_p9 {
    public static void main(String[] args) {
        String str = "abc";
        printPermutations(str, "");
    }

    public static void printPermutations(String str, String perm) {
        if (str.isEmpty()) {
            System.out.println(perm);
        }
         else 
        {
            for (int i = 0; i < str.length(); i++) {
                String newStr = str.substring(0, i) + str.substring(i + 1);
                printPermutations(newStr, perm + str.charAt(i));
            }
        }
    }
}
