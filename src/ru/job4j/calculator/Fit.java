package ru.job4j.calculator;

public class Fit {
    private static final double MAN_HEIGHT_ADJUSTMENT = 100.0;
    private static final double WOMAN_HEIGHT_ADJUSTMENT = 110.0;
    private static final double WEIGHT_COEFFICIENT = 1.15;
    public static double calculateManWeight(double height) {
        return (height - MAN_HEIGHT_ADJUSTMENT) * WEIGHT_COEFFICIENT;
    }

    public static double calculateWomanWeight(double height) {
        return (height - WOMAN_HEIGHT_ADJUSTMENT) * WEIGHT_COEFFICIENT;
    }

    public static void main(String[] args) {
        double man = calculateManWeight(100);
        System.out.println(String.format("Man 100 is %.2f", man));
        double woman = calculateWomanWeight(110);
        System.out.println(String.format("Woman 110 is %.2f", woman));
        man = calculateManWeight(150);
        System.out.println(String.format("Man 150 is %.2f", man));
        woman = calculateWomanWeight(150);
        System.out.println(String.format("Woman 150 is %.2f", woman));
        man = calculateManWeight(180);
        System.out.println(String.format("Man 180 is %.2f", man));
        woman = calculateWomanWeight(180);
        System.out.println(String.format("Woman 180 is %.2f", woman));
    }
}
