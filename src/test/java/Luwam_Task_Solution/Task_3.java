package Luwam_Task_Solution;

import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {

        //int  N = 25;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter positive number:");
        int N= sc.nextInt();

        for (int i=1; i<=N ; i++)
        {
            if(i % 2 == 0)
                System.out.print("Codility");
            if(i % 3 == 0)
                System.out.print("Test");
            if(i % 5 == 0)
                System.out.print("Coders");




            if(i % 2 != 0 && i % 3 != 0 && i % 5 != 0)
                System.out.print(i);

            System.out.println();

        }

    }
}
