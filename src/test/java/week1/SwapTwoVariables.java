package week1;

public class SwapTwoVariables {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swapping: a = " + a + ", b = " + b);
        //System.out.println("");
        //System.out.println("-------------------Start explanation how code works");
        a = a + b;
        //System.out.println("After a=a+b; "+" a = "+a + ", b = " + b);
        b = a - b;
       // System.out.println("After b=a-b; "+" a = "+a + ", b = " + b);
        a = a - b;
        //System.out.println("After a=a-b; "+" a = "+a + ", b = " + b);
        //System.out.println("-------------------Finish explanation how code works");
        //System.out.println("");
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
