import calc.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void addTest() {
        //given
        Calculator calculator = new Calculator();
        int x = 1;
        int y = 2;

        int expected = 3;
        //when
        int actual = calculator.add(x, y);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void subtractTest() {
        Calculator calculator = new Calculator();
        int x = 1;
        int y = 2;
        int expected = -1;
        int actual = calculator.subtract(x, y);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void multiplyTest() {
        Calculator calculator = new Calculator();
        int x = 2;
        int y = 2;
        int expected = 4;
        int actual = calculator.multiply(x, y);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void divideTest() {
        Calculator calculator = new Calculator();
        int x = 2;
        int y = 2;
        int expected = 1;
        int actual = calculator.divide(x, y);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void exponentTest() {
        Calculator calculator = new Calculator();
        int x = 2;
        int y = 2;
        int expected = 4;
        int actual = calculator.exponent(x, y);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void squareTest() {
        Calculator calculator = new Calculator();
        int x = 2;
        int expected = 4;
        int actual = calculator.square(x);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void squareRootTest() {
        Calculator calculator = new Calculator();
        int x = 2;
        int expected = 1;
        int actual = calculator.squareRoot(x);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sineTest() {
        Calculator calculator = new Calculator();
        double x = 20.0;
        double y = Math.toRadians(x);
        double expected = 5;
        double actual = calculator.sine(y);
        Assert.assertEquals(expected,actual, 5);
    }
}