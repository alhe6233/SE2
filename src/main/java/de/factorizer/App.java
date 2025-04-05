package de.factorizer;

import java.util.List;

public class App {
    public static void main(String[] args) {
        if (args.length > 0) {
            for (String arg : args) {
                int number = Integer.parseInt(arg);
                List<Integer> factors = Factorizer.factorize(number);
                System.out.println("* n=" + number + " -> " + factors);
            }
        } else {
            System.out.println("No numbers provided.");
        }
    }
}