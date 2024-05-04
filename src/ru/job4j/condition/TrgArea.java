package ru.job4j.condition;

public class TrgArea {
    /**
     * Вычисляет площадь треугольника по формуле Герона.
     * @param a длина первой стороны треугольника
     * @param b длина второй стороны треугольника
     * @param c длина третьей стороны треугольника
     * @return площадь треугольника
     * @throws IllegalArgumentException если сумма длин любых двух сторон меньше или равна длине третьей стороны
     */
    public static double area(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Сумма длин двух сторон должна быть больше длины третьей стороны");
        }
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
