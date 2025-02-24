public class String_p8 {
    public static void main(String[] args) {
        String str1 = "madam";
        String str2 = "racecar";
        System.out.println("Are palindromes: " + arePalindromes(str1, str2));
    }

    public static boolean arePalindromes(String str1, String str2) {
        return new StringBuilder(str1).reverse().toString().equals(str1)
            && new StringBuilder(str2).reverse().toString().equals(str2);
    }
}
