package Nodes;

import static org.junit.Assert.*;
import org.junit.Test;

public class NumberNodeTest {

    @Test
    public void testEvaluate() {
        System.out.println("evaluate Number Positive");
        NumberNode instance = new NumberNode(2);
        double expResult = 2;
        double result = instance.evaluate();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testEvaluateNumNegative() {
        System.out.println("evaluate Number Negative");
        NumberNode instance = new NumberNode(-2);
        double expResult = -2;
        double result = instance.evaluate();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testEvaluateZero() {
        System.out.println("evaluate Number Zero");
        NumberNode instance = new NumberNode(0);
        double expResult = 0;
        double result = instance.evaluate();
        assertEquals(expResult, result, 0.0);
    }
}
