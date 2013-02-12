package Nodes.BinaryOperators;

import Nodes.NumberNode;
import static org.junit.Assert.*;
import org.junit.Test;

public class AddNodeTest {

    @Test
    public void testEvaluate() {
        System.out.println("evaluate addNode");
        NumberNode dos = new NumberNode(2);
        NumberNode tres = new NumberNode(3);
        AddNode instance = new AddNode(dos, tres);
        double expResult = 5;
        double result = instance.evaluate();
        assertEquals(expResult, result, 0.0);
    }
}
