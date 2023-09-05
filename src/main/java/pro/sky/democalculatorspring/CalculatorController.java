package pro.sky.democalculatorspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String firstPage() {
        return calculatorService.firstPage();
    }

    @GetMapping(path = "/calculator")
    public String calculator() {
        return calculatorService.calculator();
    }

    @GetMapping(path = "/calculator/plus")
    public String plusCalculator(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {

        return calculatorService.plusCalculator(number1, number2);
    }

    @GetMapping(path = "/calculator/minus")
    public String minusCalculator(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculatorService.minusCalculator(number1, number2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiplyCalculator(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculatorService.multiplyCalculator(number1, number2);
    }

    @GetMapping(path = "/calculator/divide")
    public String divideCalculator(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculatorService.divideCalculator(number1, number2);

    }

}
