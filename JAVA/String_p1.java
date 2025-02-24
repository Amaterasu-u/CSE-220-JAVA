public class String_p1 {
    public static void main(String[] args) {
        String str = "0000111123";
       
       // str = str.replaceAll("0", "");
        str=str.replaceFirst("^0+" , "Kireee kakku");
        System.out.println(str); 

        String str1 = "Hello World!";
String noSpaces = str1.replaceAll("\\s", "");
System.out.println(noSpaces);
    }
}

