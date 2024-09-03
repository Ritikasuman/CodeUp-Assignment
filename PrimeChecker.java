/***
 * Task 3: Prime Number Checker
 * Write a Java program to determine if a given integer is a prime number.
 * Example 1:
           ● Input: 21
           ● Output: "The given number is NOT prime"
           ● Explanation:
           The number 21 is divisible by 3 and 7, hence it is not a prime number.
 * Owner = Ritika suman
 * Date = 09/02/2024
 */


import java.util.Scanner;

public class PrimeChecker {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int num;
        
        while (true) {
            System.out.println(Constants.INPUT_MESSAGE);
            num = number.nextInt();
            
            if (num < 0) {
                break; 
            }
            
            int result = isPrime(num);
            
            if (result == 1) {
                System.out.println("\nIt is a prime number");
            } else {
                System.out.println("\nIt is not a prime number");
            }
        }
        
        number.close();
    }

    // Method to check if a number is prime
    public static int isPrime(int num) {
        if (num < 2) {
            return 0; // Not a prime number
        }
        int sqrt = calculateSquareRoot(num);
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) {
                return 0; // Not a prime number
            }
        }
        return 1; // Prime number
    }

    // Method to calculate the square root of a number 
    public static int calculateSquareRoot(int num) {
        int sqrt = 0;
        int i = 1;
        while (i * i <= num) {
            sqrt = i;
            i++;
        }
        return sqrt;
    }
}
