package tree.calculator.number;

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
}