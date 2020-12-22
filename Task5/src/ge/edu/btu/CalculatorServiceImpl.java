package ge.edu.btu;

public class CalculatorServiceImpl implements CalculatorService{

    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }
}
