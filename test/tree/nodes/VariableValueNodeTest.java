package tree.nodes;

import static org.junit.Assert.*;
import org.junit.Test;

public class VariableValueNodeTest {

    @Test
    public void testEvaluate() {
        System.out.println("VariableValueNode: evaluate");
        VariableValueNode instance = new VariableValueNode(2);
        double expResult = 2;
        double result = instance.evaluate();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSetVariable() {
        System.out.println("VariableValueNode: setVariable");
        VariableValueNode instance = new VariableValueNode(2);
        double variable = 3;
        instance.setVariable(variable);
        double expResult = 3;
        double result = instance.evaluate();
        assertEquals(expResult, result, 0.0);
    }
}
