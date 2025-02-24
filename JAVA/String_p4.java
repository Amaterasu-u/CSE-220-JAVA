public class String_p4 {
    public static void main(String[] args) {
        String str = "hello                                                                          world";
        str=str.replaceAll("\\s" , "");
        String word = "world";
        System.out.println("Word found at index: " + searchWord(str, word));
    }

    public static int searchWord(String str, String word) {
        return str.indexOf(word);
    }
}
