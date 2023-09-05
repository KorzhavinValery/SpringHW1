package pro.sky.democalculatorspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String calculator() {
        return calculatorService.calculator();
    }

    @GetMapping(path = "/plus")
    public String plusCalculator(@RequestParam(required = true) int num1, @RequestParam(required = true) int num2) {

        return calculatorService.plusCalculator(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minusCalculator(@RequestParam(required = true) int num1, @RequestParam(required = true) int num2) {
        return calculatorService.minusCalculator(num1, num2);
    }


    @GetMapping(path = "/multiply")
    public String multiplyCalculator(@RequestParam(required = true) int num1, @RequestParam(required = true) int num2) {
        return calculatorService.multiplyCalculator(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String divideCalculator(@RequestParam(required = true) int num1, @RequestParam(required = true) int num2) {
        return calculatorService.divideCalculator(num1, num2);

    }

}
