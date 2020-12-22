import ge.edu.btu.CalculatorServiceImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorServiceTest {
    @Test
    public void sumTest(){
        CalculatorServiceImpl calculator = new CalculatorServiceImpl();
        assertEquals(3, calculator.sum(1,2));
    }
    @Test
    public void multiplyTest(){
        CalculatorServiceImpl calculator = new CalculatorServiceImpl();
        assertEquals(2, calculator.multiply(1,2));
    }
}
