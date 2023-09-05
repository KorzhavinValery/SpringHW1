package pro.sky.democalculatorspring;

public interface CalculatorService {
    String firstPage();

    String calculator();

    String plusCalculator(int number1, int number2);

    String minusCalculator(int number1, int number2);

    String multiplyCalculator(int number1, int number2);

    String divideCalculator(int number1, int number2);
}
