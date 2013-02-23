package tree.nodes;

import static org.junit.Assert.*;
import org.junit.Test;

public class VariableValueTest {

    @Test
    public void testEvaluate() {
        System.out.println("VariableValueNode: evaluate");
        VariableValue instance = new VariableValue(2);
        double expResult = 2;
        double result = instance.evaluate();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSetVariable() {
        System.out.println("VariableValueNode: setVariable");
        VariableValue instance = new VariableValue(2);
        double variable = 3;
        instance.setVariable(variable);
        double expResult = 3;
        double result = instance.evaluate();
        assertEquals(expResult, result, 0.0);
    }
}
