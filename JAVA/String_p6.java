public class String_p6 {
    public static void main(String[] args) {
        String s1 = "1011"; // 11 in decimal
        String s2 = "1101"; // 13 in decimal
        String sum = addBinary(s1, s2);
        System.out.println("Sum: " + sum); // Output: "11000"

        String s3 = "1101"; // 13 in decimal
        String s4 = "1011"; // 11 in decimal
        String difference = subtractBinary(s3, s4);
        System.out.println("Difference: " + difference); // Output: "0010"
    }

    public static String addBinary(String a, String b) {
        int i = a.length() - 1; // Pointer for string a (starting from the end)
        int j = b.length() - 1; // Pointer for string b (starting from the end)
        int carry = 0;          // Carry for the addition
        StringBuilder sb = new StringBuilder();

        // Loop until both strings are processed and no carry remains.
        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry; // Start with the carry

            // Add the bit from string a if available.
            if (i >= 0) {
                sum += a.charAt(i) - '0'; // Convert char to integer (0 or 1)
                i--; // Move leftwards in a
            }
            
            // Add the bit from string b if available.
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--; // Move leftwards in b
            }
            
            // Append the current bit (sum modulo 2) to the result.
            sb.append(sum % 2);
            
            // Update carry for the next iteration.
            carry = sum / 2;
        }
        
        // The result is built in reverse order, so reverse it before returning.
        return sb.reverse().toString();
    }

    public static String subtractBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1; // Pointer for string a
        int j = b.length() - 1; // Pointer for string b
        int borrow = 0;         // Borrow for the subtraction

        while (i >= 0 || j >= 0) {
            int sub = borrow; // Start with the borrow

            // Subtract the bit from string a if available.
            if (i >= 0) {
                sub += a.charAt(i) - '0'; // Convert char to integer (0 or 1)
                i--; // Move leftwards in a
            }
            
            // Subtract the bit from string b if available.
            if (j >= 0) {
                sub -= (b.charAt(j) - '0');
                j--; // Move leftwards in b
            }
            
            // Check if we need to borrow for the next iteration.
            if (sub < 0) {
                sub += 2; // Adjust for borrow
                borrow = 1; // Set borrow for next iteration
            } else {
                borrow = 0; // No borrow needed
            }
            
            // Append the current bit (sub) to the result.
            sb.append(sub);
        }

        // The result is built in reverse order, so reverse it before returning.
        return sb.reverse().toString();
    }
}
