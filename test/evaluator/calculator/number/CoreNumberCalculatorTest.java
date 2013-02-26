package evaluator.calculator.number;

import evaluator.calculator.number.NumberCalculator;
import evaluator.calculator.number.Range;
import evaluator.calculator.number.CoreNumberCalculator;
import evaluator.calculator.number.RangeNumberCalculator;
import static org.junit.Assert.*;
import org.junit.Test;
import evaluator.nodes.binary.BinaryOperator;
import evaluator.types.Double;

public class CoreNumberCalculatorTest {

    public NumberCalculator getCalculator() {
        return new CoreNumberCalculator();
    }

    public RangeNumberCalculator getCalculator(Double upperLimit, Double lowerLimit) {
        return new RangeNumberCalculator(getCalculator(), new Range(upperLimit, lowerLimit));
    }

    @Test
    public void addtest2() {
        assertEquals(4.0, getCalculator().calculate(BinaryOperator.add, new Double(2.0), new Double(2.0)), 0.0);
    }

    @Test
    public void addTest() {
        assertEquals(4.0, getCalculator().add(2.0, 2.0), 0.0);
    }
}