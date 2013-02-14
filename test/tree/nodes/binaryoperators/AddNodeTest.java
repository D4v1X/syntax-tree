package tree.nodes.binaryoperators;

import static org.junit.Assert.*;
import org.junit.Test;
import tree.nodes.ConstantValueNode;

public class AddNodeTest {

    @Test
    public void testEvaluate() {
        System.out.println("addNode: evaluate");
        ConstantValueNode dos = new ConstantValueNode(2.0);
        ConstantValueNode tres = new ConstantValueNode(3.0);
        AddNode instance = new AddNode(dos, tres);
        double expResult = 5.0;
        double result = instance.evaluate();
        assertEquals(expResult, result, 0.0);
    }
}
