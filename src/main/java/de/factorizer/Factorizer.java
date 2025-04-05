package de.factorizer;

import java.util.ArrayList;
import java.util.List;

public class Factorizer {
    // Method to prime factorize an integer
    public static List<Integer> factorize(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("negative argument");
        }
        
        List<Integer> factors = new ArrayList<>();
        
        // Start with the smallest prime factor (2)
        while (number % 2 == 0) {
            factors.add(2);
            number /= 2;
        }

        // Now check for odd factors from 3 upwards
        for (int i = 3; i * i <= number; i += 2) {
            while (number % i == 0) {
                factors.add(i);
                number /= i;
            }
        }

        // If number is still greater than 2, it's prime
        if (number > 2) {
            factors.add(number);
        }
        
        return factors;
    }
}