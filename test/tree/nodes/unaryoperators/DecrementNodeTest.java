package tree.nodes.unaryoperators;

import static org.junit.Assert.*;
import org.junit.Test;
import tree.nodes.ConstantValueNode;

public class DecrementNodeTest {

    @Test
    public void testEvaluate() {
        System.out.println("DecrementNode: evaluate");
        ConstantValueNode uno = new ConstantValueNode(1.0);
        DecrementNode instance = new DecrementNode(uno);
        double expResult = 0.0;
        double result = instance.evaluate();
        assertEquals(expResult, result, 0.0);
    }
}
