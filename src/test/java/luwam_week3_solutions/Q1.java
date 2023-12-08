package luwam_week3_solutions;

public class Q1 {

    //write a method
    //boolean
    // it can be divided by itself or 1
    // if statement
    // create for loop
    //print it out the result

    public static boolean isPrime(int number) {
        // Numbers less than or equal to 1 are not prime
        if (number <= 1) {
            return false;
        }

        // Iterate from 2 to the square root of the number
        // Instead of Math.sqrt(number)
        // for (int i = 2; i * i <= number; i++)
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If divisible by any i, it's not prime
            }
        }

        return true; // If no divisors found, the number is prime
    }

    public static void main(String[] args) {

        int number = 25;

        boolean result = isPrime(number);

        System.out.println(result);
    }
}
