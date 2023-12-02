package week1.mujib;

import java.util.ArrayList;

public class Divisible {
    public static void main(String[] args) {


        ArrayList<Integer> DivisibleBy15 = new ArrayList<>();
        ArrayList<Integer> DivisibleBy3 = new ArrayList<>();
        ArrayList<Integer> DivisibleBy5 = new ArrayList<>();

        for (int i = 0; i <= 100 ; i++) {
            if (i%3==0 & i%5==0 & i%15==0){
                DivisibleBy15.add(i);
            }
            if (i%3==0  & !(i%15==0)){
                DivisibleBy3.add(i);
            }
            if (i%5==0  & !(i%15==0)){
             DivisibleBy5.add(i);
            }

        }

        System.out.println("DivisibleBy15 = " + DivisibleBy15);
        System.out.println("DivisibleBy5 = " + DivisibleBy5);
        System.out.println("DivisibleBy3 = " + DivisibleBy3);



    }
}
