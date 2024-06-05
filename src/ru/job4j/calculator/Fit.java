package ru.job4j.calculator;

public class Fit {
    private static final double MAN_HEIGHT_ADJUSTMENT = 100.0;
    private static final double WOMAN_HEIGHT_ADJUSTMENT = 110.0;
    private static final double WEIGHT_COEFFICIENT = 1.15;

    public static double calculateWeight(double height, double heightAdjustment) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be greater than 0");
        }
        return (height - heightAdjustment) * WEIGHT_COEFFICIENT;
    }

    public static double calculateManWeight(double height) {
        return calculateWeight(height, MAN_HEIGHT_ADJUSTMENT);
    }

    public static double calculateWomanWeight(double height) {
        return calculateWeight(height, WOMAN_HEIGHT_ADJUSTMENT);
    }

    public static void main(String[] args) {
        testCalculateWeight();
    }

    private static void testCalculateWeight() {
        double[] heights = {100, 150, 180};
        for (double height : heights) {
            double manWeight = calculateManWeight(height);
            System.out.println(String.format("Man %f is %.2f", height, manWeight));
            double womanWeight = calculateWomanWeight(height);
            System.out.println(String.format("Woman %f is %.2f", height, womanWeight));
        }
    }
}
