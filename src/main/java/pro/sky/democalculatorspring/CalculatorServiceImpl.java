package pro.sky.democalculatorspring;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String firstPage() {
        return "Добро пожаловать!";
    }

    public String calculator() {
        return "Добро пожаловать! <br> <b>Это программа простого калькулятора!</b>";
    }

    public String plusCalculator(int number1, int number2) {
        int sum = number1 + number2;
        return "Результат сложения " + number1 + " + " + number2 + " = " + sum;
    }

    public String minusCalculator(int number1, int number2) {
        int sum = number1 - number2;
        return "Результат вычитания " + number1 + " - " + number2 + " = " + sum;
    }

    public String multiplyCalculator(int number1, int number2) {
        int sum = number1 * number2;
        return "Результат Умножения " + number1 + " * " + number2 + " = " + sum;
    }

    public String divideCalculator(int number1, int number2) {
        if (number1 != 0 && number2 != 0) {
            int sum = number1 / number2;
            return "Результат деления " + number1 + " / " + number2 + " = " + sum;
        } else return "<b>На 0 делить нельзя!</b>";

    }
}
