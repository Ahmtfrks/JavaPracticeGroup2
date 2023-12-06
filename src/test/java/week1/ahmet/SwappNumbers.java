package week1.ahmet;

public class SwappNumbers {


    public static void main(String[] args) {

        int num1=5;//10

        int num2=10;

        int num3;//5

        num3=num1;
        num1=num2;
        num2=num3;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

//second way
        int n1=5;//15
        int n2=10;//5

        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

    }

}
