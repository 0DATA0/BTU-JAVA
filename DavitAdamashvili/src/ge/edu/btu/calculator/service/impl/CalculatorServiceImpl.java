package ge.edu.btu.calculator.service.impl;

import ge.edu.btu.calculator.service.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public int sum(int x, int y) {
        return x + y;
    }

    @Override
    public double sum(double x, double y) {
        double sum = x + y;
        return sum;
    }

    @Override
    public double divide(int x, int y) {
        try{
            return x/y;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            return 0;
        }
    }

    @Override
    public double divide(double x, double y) {
        try{
            return x/y;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            return 0;
        }
    }
}
