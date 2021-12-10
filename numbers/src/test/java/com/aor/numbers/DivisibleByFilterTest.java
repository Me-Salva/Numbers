package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class DivisibleByFilterTest {

    @Test
    void acceptDivideBy2() {
        DivisibleByFilter filter = new DivisibleByFilter(2);
        List<Integer> divisible = Arrays.asList(0, 2, 4, 8, 10, 10000);
        List<Integer> notDivisible = Arrays.asList(1, 3, 5, 7, 9, 10001);

        for (int n : divisible)
            Assertions.assertTrue(filter.accept(n));

        for (int n : notDivisible)
            Assertions.assertFalse(filter.accept(n));

    }

    @Test
    void acceptDivideBy3() {
        DivisibleByFilter filter = new DivisibleByFilter(3);
        List<Integer> divisible = Arrays.asList(0, 3, 6, 9, 12, 15, 999);
        List<Integer> notDivisible = Arrays.asList(1, 2, 4, 5, 10, 1000);

        for (int n : divisible)
            Assertions.assertTrue(filter.accept(n));

        for (int n : notDivisible)
            Assertions.assertFalse(filter.accept(n));

    }

    @Test
    void acceptDivideBy5() {
        DivisibleByFilter filter = new DivisibleByFilter(5);
        List<Integer> divisible = Arrays.asList(0, 5, 10, 15, 20, 25, 1000);
        List<Integer> notDivisible = Arrays.asList(1, 2, 4, 7, 9, 999);

        for (int n : divisible)
            Assertions.assertTrue(filter.accept(n));

        for (int n : notDivisible)
            Assertions.assertFalse(filter.accept(n));

    }
}
