package Nodes.BinaryOperators;

import Nodes.NumberNode;
import static org.junit.Assert.*;
import org.junit.Test;

public class SubtracNodeTest {

    @Test
    public void testEvaluate() {
        System.out.println("evaluate SubtracNode");
        NumberNode dos = new NumberNode(2);
        NumberNode tres = new NumberNode(3);
        SubtracNode instance = new SubtracNode(dos, tres);
        double expResult = -1;
        double result = instance.evaluate();
        assertEquals(expResult, result, 0.0);
    }
}
