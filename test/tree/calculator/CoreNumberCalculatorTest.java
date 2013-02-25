package tree.calculator;

import static org.junit.Assert.*;
import org.junit.Test;
import tree.nodes.binary.BinaryOperation;
import tree.nodes.types.DoubleType;

public class CoreNumberCalculatorTest {

    public NumberCalculator getCalculator() {
        return new CoreNumberCalculator();
    }

    public RangeNumberCalculator getCalculator(Double upperLimit, Double lowerLimit) {
        return new RangeNumberCalculator(getCalculator(), new Range(upperLimit, lowerLimit));
    }

    @Test
    public void addtest2() {
        assertEquals(4.0, (Double) getCalculator().calculate(BinaryOperation.add, new DoubleType(2.0), new DoubleType(2.0)).evaluate(), 0.0);
    }

    @Test
    public void addTest() {
        assertEquals(4.0, getCalculator().add(2.0, 2.0), 0.0);
    }
    @Test
    public void addwithoverflow() {
        try {
            getCalculator(9.0, null).add(10.0, 8.0);
            fail("Esta roto");
        } catch (OverflowException ex) {
            assertTrue(true);
        }
    }
}
