package tree.nodes.binaryoperators;

import static org.junit.Assert.*;
import org.junit.Test;
import tree.nodes.ConstantValue;

public class AddNodeTest {

    @Test
    public void testEvaluate() {
        System.out.println("addNode: evaluate");
        ConstantValue dos = new ConstantValue(2.0);
        ConstantValue tres = new ConstantValue(3.0);
        AddNode instance = new AddNode(dos, tres);
        double expResult = 5.0;
        double result = instance.evaluate();
        assertEquals(expResult, result, 0.0);
    }
}
