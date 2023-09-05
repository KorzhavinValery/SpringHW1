package pro.sky.democalculatorspring.controller;

import org.springframework.stereotype.Service;
import pro.sky.democalculatorspring.controller.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    private int sum;

    public String calculator() {
        return "Добро пожаловать! <br> <b>Это программа простого калькулятора!</b>";
    }

    public String plusCalculator(int num1, int num2) {
        sum = num1 + num2;
        return "Результат сложения " + num1 + " + " + num2 + " = " + sum;
    }

    public String minusCalculator(int num1, int num2) {
        sum = num1 - num2;
        return "Результат вычитания " + num1 + " - " + num2 + " = " + sum;
    }

    public String multiplyCalculator(int num1, int num2) {
        sum = num1 * num2;
        return "Результат Умножения " + num1 + " * " + num2 + " = " + sum;
    }

    public String divideCalculator(int num1, int num2) {
        if (num1 != 0 && num2 != 0) {
            sum = num1 / num2;
            return "Результат деления " + num1 + " / " + num2 + " = " + sum;
        } else return "<b>На 0 делить нельзя!</b>";

    }

}
