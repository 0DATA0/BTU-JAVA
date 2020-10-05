package ge.edu.btu.calculator;

import ge.edu.btu.calculator.service.impl.CalculatorServiceImpl;

public class Main {
    public static void main(String[] args) {
        CalculatorServiceImpl myService = new CalculatorServiceImpl();
        System.out.println(myService.sum(9,4));
        System.out.println(myService.sum(3.5, 8.985));
        System.out.println(myService.divide(9,0));
        System.out.println(myService.divide(10.8,2.2));
    }
}
