package tree.nodes;

import tree.nodes.ConstantNode;
import static org.junit.Assert.*;
import org.junit.Test;

public class ConstantNodeTest {

    @Test
    public void testEvaluate() {
        System.out.println("evaluate Number Positive");
        ConstantNode instance = new ConstantNode(2);
        double expResult = 2;
        double result = instance.evaluate();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testEvaluateNumNegative() {
        System.out.println("evaluate Number Negative");
        ConstantNode instance = new ConstantNode(-2);
        double expResult = -2;
        double result = instance.evaluate();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testEvaluateZero() {
        System.out.println("evaluate Number Zero");
        ConstantNode instance = new ConstantNode(0);
        double expResult = 0;
        double result = instance.evaluate();
        assertEquals(expResult, result, 0.0);
    }
}
