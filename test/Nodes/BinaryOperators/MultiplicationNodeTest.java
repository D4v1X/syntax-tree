package Nodes.BinaryOperators;

import Nodes.NumberNode;
import static org.junit.Assert.*;
import org.junit.Test;

public class MultiplicationNodeTest {

    @Test
    public void testEvaluate() {
        System.out.println("evaluate MultiplicationNode");
        NumberNode dos = new NumberNode(2);
        NumberNode tres = new NumberNode(3);
        MultiplicationNode instance = new MultiplicationNode(dos, tres);
        double expResult = 6;
        double result = instance.evaluate();
        assertEquals(expResult, result, 0.0);
    }
}
