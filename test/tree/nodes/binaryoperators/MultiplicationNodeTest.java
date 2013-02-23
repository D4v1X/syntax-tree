package tree.nodes.binaryoperators;

import static org.junit.Assert.*;
import org.junit.Test;
import tree.nodes.ConstantValue;

public class MultiplicationNodeTest {

    @Test
    public void testEvaluate() {
        System.out.println("MultiplicationNode: evaluate");
        ConstantValue dos = new ConstantValue(2.0);
        ConstantValue tres = new ConstantValue(3.0);
        MultiplicationNode instance = new MultiplicationNode(dos, tres);
        double expResult = 6.0;
        double result = instance.evaluate();
        assertEquals(expResult, result, 0.0);
    }
}
