package tree.nodes.unaryoperators;

import static org.junit.Assert.*;
import org.junit.Test;
import tree.nodes.ConstantValueNode;

public class AbsoluteNodeTest {

    @Test
    public void testEvaluate() {
        System.out.println("AbsoluteNode: evaluate Negative");
        ConstantValueNode dos = new ConstantValueNode(-2.0);
        AbsoluteNode instance = new AbsoluteNode(dos);
        double expResult = 2.0;
        double result = instance.evaluate();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testEvaluate2() {
        System.out.println("AbsoluteNode: evaluate Positive");
        ConstantValueNode dos = new ConstantValueNode(2.0);
        AbsoluteNode instance = new AbsoluteNode(dos);
        double expResult = 2.0;
        double result = instance.evaluate();
        assertEquals(expResult, result, 0.0);
    }
}
