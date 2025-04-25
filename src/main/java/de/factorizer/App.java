package de.factorizer;

import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello Factors!");
        if (args.length > 0) {
            for (String arg : args) {
                int number = Integer.parseInt(arg);
                List<Integer> factors = Factorizer.factorize(number);
                System.out.print(" - n=" + number + " -> " + factors);
                if (factors.size() == 1 && factors.get(0) == number) {
                    System.out.print(" (prime number)");
                }
                System.out.println();
            }
        } else {
            System.out.println("No numbers provided.");
        }
    }
}