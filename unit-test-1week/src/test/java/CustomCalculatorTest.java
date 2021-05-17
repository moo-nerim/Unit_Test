import org.junit.Test;

import static org.junit.Assert.*;

public class CustomCalculatorTest {

    private CustomCalculator customCalculator;

    // add test
    @Test
    public void addTest(){
      customCalculator = new CustomCalculator();
      int result = customCalculator.add(10,10);
//      테스트 코드 입력
      assertTrue(result == 20);
    }

    @Test
    public void subtractTest(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(10,3);
        assertTrue(result == 7);
    }

    @Test
    public void multiplyTest(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.multiply(10,2);
        assertTrue(result == 20);
    }

    @Test
    public void divideTest(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.divide(10,5);
        assertTrue(result == 2);
    }
}