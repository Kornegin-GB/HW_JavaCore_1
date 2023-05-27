package ru.geekbrains.controller;

/**
 * Класс математических действий
 */
public class MathCalc {
    /**
     * Функция умножения двух чисел
     *
     * @param a первый множитель
     * @param b второй множитель
     * @return Результат умножения двух чисел
     */
    public int multiplication(int a, int b) {
        return a * b;
    }

    /**
     * Функция деления двух чисел
     *
     * @param a делимое
     * @param b делитель
     * @return Результат деления двух чисел
     */
    public int division(int a, int b) {
        return a / b;
    }

    /**
     * Функция сложения двух чисел
     *
     * @param a первое слагаемое
     * @param b второе слагаемое
     * @return Результат сложение двух чисел
     */
    public int addition(int a, int b) {
        return a + b;
    }
}
