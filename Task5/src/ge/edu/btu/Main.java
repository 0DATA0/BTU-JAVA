package ge.edu.btu;

public class Main {
    public static void main(String[] args) {
        CalculatorServiceImpl calculator = new CalculatorServiceImpl();
        System.out.println(calculator.sum(1,2));
    }
}
