package de.factorizer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class FactorizerTest {

    @Test
    void testFactorizeRegularCases() {
        // Regular cases
        assertEquals(List.of(2), Factorizer.factorize(2));
        assertEquals(List.of(3), Factorizer.factorize(3));
        assertEquals(List.of(2, 2), Factorizer.factorize(4));
        assertEquals(List.of(3, 3, 3), Factorizer.factorize(27));
        assertEquals(List.of(2, 2, 3, 7), Factorizer.factorize(84));
        assertEquals(List.of(7, 23, 59, 1153), Factorizer.factorize(10952347));
    }

    @Test
    void testFactorizeValidCornerCases() {
        // Valid corner cases
        assertEquals(List.of(), Factorizer.factorize(1)); // 1 has no prime factors
        assertEquals(List.of(2147483647), Factorizer.factorize(2147483647)); // MAX_INT
    }

    @Test
    void testFactorizeInvalidCases() {
        // Invalid exception cases
        IllegalArgumentException exception1 = assertThrows(IllegalArgumentException.class, () -> {
            Factorizer.factorize(-1);
        });
        assertEquals("negative argument", exception1.getMessage());

        IllegalArgumentException exception2 = assertThrows(IllegalArgumentException.class, () -> {
            Factorizer.factorize(-10);
        });
        assertEquals("negative argument", exception2.getMessage());

        IllegalArgumentException exception3 = assertThrows(IllegalArgumentException.class, () -> {
            Factorizer.factorize(-2147483648); // MIN_INT
        });
        assertEquals("negative argument", exception3.getMessage());
    }
}