package ru.geekbrains;

import ru.geekbrains.controller.Decor;
import ru.geekbrains.controller.MathCalc;

public class Main {
    public static void main(String[] args) {
        Decor decor = new Decor();
        MathCalc mathCalc = new MathCalc();
        String result = decor.decoration(mathCalc.addition(4, 2));
        System.out.println(result);
        result = decor.decoration(mathCalc.division(4, 2));
        System.out.println(result);
        result = decor.decoration(mathCalc.multiplication(4, 2));
        System.out.println(result);
    }
}