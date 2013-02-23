package tree.nodes.binaryoperators;

import static org.junit.Assert.*;
import org.junit.Test;
import tree.nodes.ConstantValue;

public class SubtracNodeTest {

    @Test
    public void testEvaluate() {
        System.out.println("SubtracNode: evaluate");
        ConstantValue dos = new ConstantValue(2.0);
        ConstantValue tres = new ConstantValue(3.0);
        SubtracNode instance = new SubtracNode(dos, tres);
        double expResult = -1.0;
        double result = instance.evaluate();
        assertEquals(expResult, result, 0.0);
    }
}
