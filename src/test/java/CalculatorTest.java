import org.junit.Assert;
import org.junit.Test;

/**
 * Created by smanvi on 6/22/17.
 */
public class CalculatorTest {

    Calculator calculator = new Calculator();
    @Test
    public void addTest(){
        int actualResult = calculator.add(100, 200);
        Assert.assertEquals(300, actualResult);
    }
}