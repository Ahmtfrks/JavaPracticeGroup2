package luwam_week4_solutions;


import java.util.Arrays;

public class task3 {

    /* public static void main(String[] args) {
        String[] alpha = {"A","A","A","B","B","B","C","C","C"};
        alpha = Arrays.stream(alpha).distinct().toArray();
        System.out.println(Arrays.toString(alpha));

    }

    */


    public static void main(String[] args) {
        String[] alpha = {"A", "A", "A", "B", "B", "B", "C", "C", "C"};

        // Use distinct() and toArray() to remove duplicates
        alpha = Arrays.stream(alpha).distinct().toArray(String[]::new);

        System.out.println(Arrays.toString(alpha));
    }





}
