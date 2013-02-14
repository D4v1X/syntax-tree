package tree.nodes.binaryoperators;

import static org.junit.Assert.*;
import org.junit.Test;
import tree.nodes.ConstantValueNode;

public class MultiplicationNodeTest {

    @Test
    public void testEvaluate() {
        System.out.println("MultiplicationNode: evaluate");
        ConstantValueNode dos = new ConstantValueNode(2.0);
        ConstantValueNode tres = new ConstantValueNode(3.0);
        MultiplicationNode instance = new MultiplicationNode(dos, tres);
        double expResult = 6.0;
        double result = instance.evaluate();
        assertEquals(expResult, result, 0.0);
    }
}
