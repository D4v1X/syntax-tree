package evaluator.calculator.number;

import evaluator.nodes.binary.BinaryOperator;
import static org.junit.Assert.*;
import org.junit.Test;

public class CoreNumberCalculatorTest {

    public NumberCalculator getCalculator() {
        return new CoreNumberCalculator();
    }

    public RangeNumberCalculator getCalculator(Double upperLimit, Double lowerLimit) {
        return new RangeNumberCalculator(getCalculator(), new Range(upperLimit, lowerLimit));
    }

//    @Test
//    public void addtest2() {
//        assertEquals(4.0, (Double)getCalculator().calculate(BinaryOperator.add, new Double(2.0), new Double(2.0)), 0.0);
//    }

    @Test
    public void addTest() {
        assertEquals(4.0, getCalculator().add(2.0, 2.0), 0.0);
    }
}