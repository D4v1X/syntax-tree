package tree.nodes.binaryoperators;

import static org.junit.Assert.*;
import org.junit.Test;
import tree.nodes.ConstantValueNode;

public class SubtracNodeTest {

    @Test
    public void testEvaluate() {
        System.out.println("SubtracNode: evaluate");
        ConstantValueNode dos = new ConstantValueNode(2.0);
        ConstantValueNode tres = new ConstantValueNode(3.0);
        SubtracNode instance = new SubtracNode(dos, tres);
        double expResult = -1.0;
        double result = instance.evaluate();
        assertEquals(expResult, result, 0.0);
    }
}
