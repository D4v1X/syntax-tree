package tree.nodes.binaryoperators;

import tree.nodes.binaryoperators.MultiplicationNode;
import tree.nodes.ConstantNode;
import static org.junit.Assert.*;
import org.junit.Test;

public class MultiplicationNodeTest {

    @Test
    public void testEvaluate() {
        System.out.println("evaluate MultiplicationNode");
        ConstantNode dos = new ConstantNode(2);
        ConstantNode tres = new ConstantNode(3);
        MultiplicationNode instance = new MultiplicationNode(dos, tres);
        double expResult = 6;
        double result = instance.evaluate();
        assertEquals(expResult, result, 0.0);
    }
}
