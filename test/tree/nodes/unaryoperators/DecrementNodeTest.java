package tree.nodes.unaryoperators;

import static org.junit.Assert.*;
import org.junit.Test;
import tree.nodes.ConstantValue;

public class DecrementNodeTest {

    @Test
    public void testEvaluate() {
        System.out.println("DecrementNode: evaluate");
        ConstantValue uno = new ConstantValue(1.0);
        DecrementNode instance = new DecrementNode(uno);
        double expResult = 0.0;
        double result = instance.evaluate();
        assertEquals(expResult, result, 0.0);
    }
}
