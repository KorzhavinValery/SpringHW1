package pro.sky.democalculatorspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.democalculatorspring.service.CalculatorService;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }


    @GetMapping()
    public String calculator() {

        return "Добро пожаловать! <br> <b>Это программа простого калькулятора!</b>" +
                "<br> Пример использования: /calculator/divide?num1=5&num2=5" +
                "<br> Доступные команды: " +
                "<br> plus - сложить; " +
                "<br> minus - вычесть; " +
                "<br> multiply - умножить; " +
                "<br> divide - разделить; ";

    }

    @GetMapping(path = "/plus")
    public String plusCalculator(@RequestParam(required = true) int num1, @RequestParam(required = true) int num2) {

        return viewStructure(num1, num2, calculatorService.plusCalculator(num1, num2), "+");
    }

    @GetMapping(path = "/minus")
    public String minusCalculator(@RequestParam(required = true) int num1, @RequestParam(required = true) int num2) {
        return viewStructure(num1, num2, calculatorService.minusCalculator(num1, num2), "-");
    }


    @GetMapping(path = "/multiply")
    public String multiplyCalculator(@RequestParam(required = true) int num1, @RequestParam(required = true) int num2) {
        return viewStructure(num1, num2, calculatorService.multiplyCalculator(num1, num2), "*");
    }

    @GetMapping(path = "/divide")
    public String divideCalculator(@RequestParam(required = true) int num1, @RequestParam(required = true) int num2) {
        if (num1 != 0 && num2 != 0) {
            return viewStructure(num1, num2, calculatorService.divideCalculator(num1, num2), "/");
        } else return "<b>На 0 делить нельзя!</b>";

    }

    private String viewStructure(Integer num1, Integer num2, Number result, String operation) {
        return num1 + " " + operation + " " + num2 + " = " + result;
    }

}
