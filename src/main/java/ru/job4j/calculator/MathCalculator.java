package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;
public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double minAndDel(double first, double second) {
        return min(first, second)
                + del(first, second);
    }

    public static double sumAndMultiplyAndMinAndDel(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + del(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
    }
}
