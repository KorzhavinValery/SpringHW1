package pro.sky.democalculatorspring.controller;

public interface CalculatorService {

    String calculator();

    String plusCalculator(int num1, int num2);

    String minusCalculator(int num1, int num2);

    String multiplyCalculator(int num1, int num2);

    String divideCalculator(int num1, int num2);
}
