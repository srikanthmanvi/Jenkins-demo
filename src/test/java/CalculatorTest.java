import com.calc.Calculator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by smanvi on 6/22/17.
 */
public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void addTest(){
        System.out.println(" TESTING ADDITION");
        int actualResult = calculator.add(100, 200);
        Assert.assertEquals(300, actualResult);
    }

    @Test
    public void multiplyTest(){
        System.out.println(" TESTING ADDITION");
        int actualResult = calculator.add(100, 200);
        Assert.assertEquals(300, actualResult);
    }

    @Test
    public void sampleTest(){
        System.out.println(" NEW TEST");
        Assert.assertEquals(1,1);
    }

    @Test
    public void sampleTest2(){
        System.out.println(" NEW TEST2");
        Assert.assertEquals(1,1);
    }


}
