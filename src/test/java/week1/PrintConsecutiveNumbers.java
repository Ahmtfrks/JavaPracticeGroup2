package week1;
import java.util.Scanner;

public class PrintConsecutiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer N: ");
        int N = scanner.nextInt();
        //int N = 11; // You can replace N with any positive integer
        if (N <= 0 || N > 100) {
            System.out.println("Number you enter is not valid!");
            throw new RuntimeException ("You enter invalid number "+ N);
            //System.exit (1);

        } else {
            for (int i = 1; i <= N; i++) {
                StringBuilder result = new StringBuilder();

                if (i % 2 == 0) {
                    result.append("Codility");
                }
                if (i % 3 == 0) {
                    result.append("Test");
                }
                if (i % 5 == 0) {
                    result.append("Coders");
                }

                // If not divisible by 2, 3, or 5, use the number itself
                if (result.length() == 0) {
                    System.out.println(i);
                } else {
                    System.out.println(result.toString());
                }
            }
            scanner.close();
        }
    }

}
