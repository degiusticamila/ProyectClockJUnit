import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void additionTest(){
        int result = calculator.addition(3,2);
        assertEquals(5,result);
    }
    @Test
    public void additionWithNegativaNumberTest(){
        int result = calculator.addition(-4, -1);
        assertEquals(-5, result);
    }
    @Test
    public void substractionTest(){
        int result = calculator.substraction(3,2);
        assertEquals(1,result);
    }

    @Test
    public void divideWithYDifferentThanZeroTest(){
        int result = calculator.divide(6,3);
        assertEquals(2,result);
    }

    @Test
    public void divideWithYZeroTest(){
        int result = calculator.divide(6,0);
        assertEquals(0,result);
    }

    @Test
    public void multiplyTest(){
        int result = calculator.multiply(2,3);
        assertEquals(6,result);
    }

    @Test
    public void esParTest(){
        boolean result = calculator.esPar(4);
        assertTrue(result);
    }
    @Test
    public void esParConNoParTest(){
        boolean result = calculator.esPar(5);
        assertFalse(result);
    }
}
