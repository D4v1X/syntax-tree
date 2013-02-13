package tree.nodes.binaryoperators;

import tree.nodes.binaryoperators.AddNode;
import tree.nodes.ConstantNode;
import static org.junit.Assert.*;
import org.junit.Test;

public class AddNodeTest {

    @Test
    public void testEvaluate() {
        System.out.println("evaluate addNode");
        ConstantNode dos = new ConstantNode(2);
        ConstantNode tres = new ConstantNode(3);
        AddNode instance = new AddNode(dos, tres);
        double expResult = 5;
        double result = instance.evaluate();
        assertEquals(expResult, result, 0.0);
    }
}
