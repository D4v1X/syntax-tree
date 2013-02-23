package tree.nodes;

import static org.junit.Assert.*;
import org.junit.Test;

public class ConstantValueTest {

    @Test
    public void testEvaluate() {
        System.out.println("ConstantValueNode: evaluate Number Positive");
        ConstantValue instance = new ConstantValue(2.0);
        double expResult = 2.0;
        double result = instance.evaluate();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testEvaluateNumNegative() {
        System.out.println("ConstantValueNode: evaluate Number Negative");
        ConstantValue instance = new ConstantValue(-2.0);
        double expResult = -2.0;
        double result = instance.evaluate();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testEvaluateZero() {
        System.out.println("ConstantValueNode: evaluate Number Zero");
        ConstantValue instance = new ConstantValue(0.0);
        double expResult = 0.0;
        double result = instance.evaluate();
        assertEquals(expResult, result, 0.0);
    }
}
