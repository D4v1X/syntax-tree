package tree.nodes;

import static org.junit.Assert.*;
import org.junit.Test;

public class ConstantValueNodeTest {

    @Test
    public void testEvaluate() {
        System.out.println("ConstantValueNode: evaluate Number Positive");
        ConstantValueNode instance = new ConstantValueNode(2.0);
        double expResult = 2.0;
        double result = instance.evaluate();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testEvaluateNumNegative() {
        System.out.println("ConstantValueNode: evaluate Number Negative");
        ConstantValueNode instance = new ConstantValueNode(-2.0);
        double expResult = -2.0;
        double result = instance.evaluate();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testEvaluateZero() {
        System.out.println("ConstantValueNode: evaluate Number Zero");
        ConstantValueNode instance = new ConstantValueNode(0.0);
        double expResult = 0.0;
        double result = instance.evaluate();
        assertEquals(expResult, result, 0.0);
    }
}
