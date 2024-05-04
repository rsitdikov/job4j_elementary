package ru.job4j.converter;

public class Converter {
    private static final int EURO_RATE = 70;
    private static final int DOLLAR_RATE = 60;

    public static int rubleToEuro(int value) {
        return value / EURO_RATE;
    }

    public static int rubleToDollar(int value) {
        return value / DOLLAR_RATE;
    }

    public static int euroToRuble(int value) {
        return value * EURO_RATE;
    }

    public static int dollarToRuble(int value) {
        return value * DOLLAR_RATE;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euros. Test result : " + passed);
        in = 120;
        expected = 2;
        out = rubleToDollar(in);
        passed = expected == out;
        System.out.println("120 rubles are 2 dollars. Test result : " + passed);
        in = 2;
        expected = 140;
        out = euroToRuble(in);
        passed = expected == out;
        System.out.println("2 euros are 140 rubles. Test result : " + passed);
        in = 2;
        expected = 120;
        out = dollarToRuble(in);
        passed = expected == out;
        System.out.println("2 dollars are 120 rubles. Test result : " + passed);
    }
}