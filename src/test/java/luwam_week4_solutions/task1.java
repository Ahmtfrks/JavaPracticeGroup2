package luwam_week4_solutions;

import java.util.Arrays;
import java.util.Map;

public class task1 {

     /*
As an alternative you can use this but at the same time
this code does not allow you to add any value without
changing the code , so it is not dynamic .

    public static void main(String[] args) {
        String[] alpha = {"A", "A", "A", "B", "B", "C", "D", "D"};
        long a = Arrays.stream(alpha).filter(p->p.equals("A")).count();
        long b = Arrays.stream(alpha).filter(p->p.equals("B")).count();
        long c = Arrays.stream(alpha).filter(p->p.equals("C")).count();
        long d = Arrays.stream(alpha).filter(p->p.equals("D")).count();

        System.out.println("A"+ a +"B"+ b + "C" +c +"D"+d);
    }

 */

// This code on the other hand allows you to add characters without needing to add anymore code .

    public static void main(String[] args) {
        String[] alpha = {"A", "A", "A", "B", "B", "C", "D", "D"};

        // Count occurrences using a Map
        Map<String, Long> counts = Arrays.stream(alpha)
                .collect(java.util.stream.Collectors.groupingBy(java.util.function.Function.identity(), java.util.stream.Collectors.counting()));

        // Print the counts
        counts.forEach((letter, count) -> System.out.print(letter + count));
    }
}
