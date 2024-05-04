package ru.job4j.calculator;

public class Multiple {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 9;
    public static void main(String[] args) {
        for (int row = MIN_NUMBER; row <= MAX_NUMBER; row++) {
            for (int column = MIN_NUMBER; column <= MAX_NUMBER; column++) {
                System.out.println(String.format("%d x %d = %d", row, column, row * column));
            }
            System.out.println();
        }
    }
}
