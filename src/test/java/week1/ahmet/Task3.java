package week1.ahmet;

public class Task3 {
    public static void main(String[] args) {
        int N = 24;  // This is the number up to which you want to print

        for (int i = 1; i <= N; i++) {
            String result = "";

            if (i % 2 == 0) {
                result += "Codility";
            }
            if (i % 3 == 0) {
                result += "Test";
            }
            if (i % 5 == 0) {
                result += "Coders";
            }

            if (result.equals("")) {
                // If the result is empty, the number is not divisible by 2, 3, or 5
                System.out.println(i);
            } else {
                // Print the concatenated result
                System.out.println(result);
            }
        }
    }
}
