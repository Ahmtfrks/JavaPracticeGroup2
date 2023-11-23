package songul;

import java.util.Scanner;

public class DivisibleBy {
    public static void main(String[] args) {




        Scanner input= new Scanner(System.in);
        int n=100;

        String divisibleBy15="";
        String divisibleBy5="";
        String divisibleBy3="";

        for (int i = 0; i<n; i++){
            if (i%3==0 && i%5==0 && i%15==0){
                divisibleBy15+=i+ " ";
            } else if (i%3==0 && i%15!=0) {
                divisibleBy3+=i+ " ";

            }else {
                divisibleBy5+=i+ " ";
            }
        }

        System.out.println("divisibleBy15 = " + divisibleBy15);
        System.out.println("divisibleBy3 = " + divisibleBy3);
        System.out.println("divisibleBy5 = " + divisibleBy5);


    }
}