package luwam_week3_solutions;

import java.util.Scanner;

public class Q2 {

    public static int neg(int num){
        return (num *-1);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a negative number:");
        int r1 = sc.nextInt();
        int res= neg(r1);
        System.out.println(res);
    }

}
