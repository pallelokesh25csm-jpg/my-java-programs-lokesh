import java.util.Scanner;

public class PrimePalindromeChecker {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        // Check divisibility up to the square root of the number for efficiency
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true;
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int digit = num % 10;
            reversedNum = (reversedNum * 10) + digit;
            num /= 10;
        }

        // Returns true if the original number matches the reversed number
        return originalNum == reversedNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check: ");
        int number = scanner.nextInt();

        // Check both conditions using short-circuit evaluation
        if (isPalindrome(number) && isPrime(number)) {
            System.out.println(number + " is a Prime Palindrome number.");
        } else {
            System.out.println(number + " is NOT a Prime Palindrome number.");
        }

        scanner.close();
    }
}
