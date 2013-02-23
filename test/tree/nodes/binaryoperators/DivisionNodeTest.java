package tree.nodes.binaryoperators;

import tree.nodes.binaryoperators.DivisionNode;
import tree.nodes.ConstantValue;
import static org.junit.Assert.*;
import org.junit.Test;

public class DivisionNodeTest {

    @Test
    public void testEvaluate() {
        System.out.println("DivisionNode: evaluate");
        ConstantValue cuatro = new ConstantValue(4.0);
        ConstantValue dos = new ConstantValue(2.0);
        DivisionNode instance = new DivisionNode(cuatro, dos);
        double expResult = 2.0;
        double result = instance.evaluate();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testEvaluateByZero() {
        System.out.println("DivisionNode: Division by Zero");
        ConstantValue cuatro = new ConstantValue(4.0);
        ConstantValue zero = new ConstantValue(0.0);
        DivisionNode instance = new DivisionNode(cuatro, zero);
        double expResult = Double.POSITIVE_INFINITY;
        double result = instance.evaluate();
        assertEquals(expResult, result, 0.0);
    }
}
