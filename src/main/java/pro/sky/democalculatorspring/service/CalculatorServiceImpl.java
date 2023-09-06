package pro.sky.democalculatorspring.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    private int sum;



@Override
    public int plusCalculator(int num1, int num2) {
        sum = num1 + num2;
        return sum;
    }
@Override
    public int minusCalculator(int num1, int num2) {
        sum = num1 - num2;
        return sum;
    }
@Override
    public int multiplyCalculator(int num1, int num2) {
        sum = num1 * num2;
        return sum;
    }
@Override
    public int divideCalculator(int num1, int num2) {
        if (num1 != 0 && num2 != 0) {
            sum = num1 / num2;
            return sum;
        } else return Integer.parseInt("<b>На 0 делить нельзя!</b>");

    }


}
