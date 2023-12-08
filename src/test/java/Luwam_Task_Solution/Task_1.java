package Luwam_Task_Solution;

public class Task_1 {

    public static void main(String[] args) {
        int a = 200;
        int b = -20;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
