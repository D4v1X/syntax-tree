package evaluator.calculator.number;

import static org.junit.Assert.*;
import org.junit.Test;

public class CoreNumberCalculatorTest {

    public NumberCalculator getCalculator() {
        return new CoreNumberCalculator();
    }

    @Test
    public void addTestDoubleDouble() {
        assertEquals(4.0, getCalculator().add(2.0, 2.0), 0.0);
    }

    @Test
    public void addTestDoubleInteger() {
        assertEquals(4.0, getCalculator().add(2.0, 2), 0.0);
    }

    @Test
    public void addTestIntegerDouble() {
        assertEquals(4.0, getCalculator().add(2, 2.0), 0.0);
    }

    @Test
    public void addTestIntegerInteger() {
        assertEquals(4, getCalculator().add(2, 2), 0);
    }

    @Test
    public void mulTestDoubleDouble() {
        assertEquals(4.0, getCalculator().mul(2.0, 2.0), 0.0);
    }

    @Test
    public void mulTestDoubleInteger() {
        assertEquals(4.0, getCalculator().mul(2.0, 2), 0.0);
    }

    @Test
    public void mulTestIntegerDouble() {
        assertEquals(4.0, getCalculator().mul(2, 2.0), 0.0);
    }

    @Test
    public void mulTestIntegerInteger() {
        assertEquals(4, getCalculator().mul(2, 2), 0);
    }

    @Test
    public void subtractTestDoubleDouble() {
        assertEquals(0.0, getCalculator().subtract(2.0, 2.0), 0.0);
    }

    @Test
    public void subtractTestDoubleInteger() {
        assertEquals(0.0, getCalculator().subtract(2.0, 2), 0.0);
    }

    @Test
    public void subtractTestIntegerDouble() {
        assertEquals(0.0, getCalculator().subtract(2, 2.0), 0.0);
    }

    @Test
    public void subtractTestIntegerInteger() {
        assertEquals(0, getCalculator().subtract(2, 2), 0);
    }
}