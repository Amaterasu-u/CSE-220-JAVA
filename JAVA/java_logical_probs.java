import java.util.*;

public class java_logical_probs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }

    // Function to check if a number is Armstrong using string conversion
    public static boolean isArmstrong(int num) {
        String numStr = Integer.toString(num);  // Convert number to string
        int sum = 0;

        // Iterate through each character in the string
        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));  // Get the digit from the character
            sum += Math.pow(digit, 3);  // Cube the digit and add to sum
        }

        return sum == num;  // Check if the sum of cubes is equal to the original number
    }
}

