package week1.ahmet;

public class consecutiveNumbers {
/*
Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line.
Replace numbers divisible by:
2 with "Codility"
3 with "Test"
5 with "Coders"
If a number is divisible by more than one of the numbers 2, 3, or 5, it should be replaced by a concatenation of the respective words in the given order (Codility, Test, Coders).
For example, numbers divisible by both 2 and 3 are replaced by "CodilityTest" and numbers divisible by 2, 3, and 5 are replaced by "CodilityTestCoders".
 */
    public static void main(String[] args) {

        int N=24;

        for (int i = 0; i <= N; i++) {
            String result = "";



            if (i%2==0 ){
                result += "Codility";



            }if  ( i%3==0){
                result += "Test";



            } if (i%5==0){
                result += "Coders";



            }
            if (result.equals("")){
                System.out.println(i);
            }else {
                System.out.println(result);
            }

        }
        }
    }

