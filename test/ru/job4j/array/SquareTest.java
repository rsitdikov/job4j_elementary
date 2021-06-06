package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {
    @Test
    public void whenBound3Then149() {
        int bound = 3;
        Square sq = new Square();
        int[] result = sq.calculate(bound);
        int[] expected = new int[] {1, 4, 9};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenBound5Then1491625() {
        int bound = 5;
        Square sq = new Square();
        int[] result = sq.calculate(bound);
        int[] expected = new int[] {1, 4, 9, 16, 25};
        Assert.assertArrayEquals(expected, result);
    }
}