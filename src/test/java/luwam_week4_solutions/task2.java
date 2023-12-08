package luwam_week4_solutions;

import java.util.Arrays;

public class task2 {

    public static boolean same(String str1, String str2) {
        return Arrays.equals(
                str1.chars().sorted().toArray(),
                str2.chars().sorted().toArray()
        );
    }
    public static void main(String[] args) {
        System.out.println(same("abc", "cab"));  // true
        System.out.println(same("abc", "abb"));  // false
    }
}
