package tree.nodes.binaryoperators;

import tree.nodes.binaryoperators.DivisionNode;
import tree.nodes.ConstantNode;
import static org.junit.Assert.*;
import org.junit.Test;

public class DivisionNodeTest {

    @Test
    public void testEvaluate() {
        System.out.println("evaluate Division");
        ConstantNode cuatro = new ConstantNode(4);
        ConstantNode dos = new ConstantNode(2);
        DivisionNode instance = new DivisionNode(cuatro, dos);
        double expResult = 2;
        double result = instance.evaluate();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testEvaluateByZero() {
        System.out.println("evaluate Division by Zero");
        ConstantNode cuatro = new ConstantNode(4);
        ConstantNode zero = new ConstantNode(0);
        DivisionNode instance = new DivisionNode(cuatro, zero);
        try {
            double result = instance.evaluate();
            fail("Division by Zero");
        } catch (RuntimeException ex) {
            assertTrue(true);
        }
    }
}
