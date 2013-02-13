package tree.nodes.binaryoperators;

import tree.nodes.binaryoperators.SubtracNode;
import tree.nodes.ConstantNode;
import static org.junit.Assert.*;
import org.junit.Test;

public class SubtracNodeTest {

    @Test
    public void testEvaluate() {
        System.out.println("evaluate SubtracNode");
        ConstantNode dos = new ConstantNode(2);
        ConstantNode tres = new ConstantNode(3);
        SubtracNode instance = new SubtracNode(dos, tres);
        double expResult = -1;
        double result = instance.evaluate();
        assertEquals(expResult, result, 0.0);
    }
}
