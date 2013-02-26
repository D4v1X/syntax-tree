package evaluator.nodes;

import evaluator.nodes.Variable;
import static org.junit.Assert.*;
import org.junit.Test;

public class VariableTest {

    @Test
    public void testEvaluate() {
        Variable variable = new Variable(2.0);
        assertEquals(Double.class, variable.evaluate().getClass());
        assertEquals(2.0, (double) variable.evaluate(), 0.0);
    }

    @Test
    public void testSetVariable() {
        Variable variable = new Variable(2.0);
        assertEquals(Double.class, variable.evaluate().getClass());
        assertEquals(2.0, (double) variable.evaluate(), 0.0);
        double value = 3.0;
        variable.setVariable(value);
        assertEquals(Double.class, variable.evaluate().getClass());
        assertEquals(3.0, (double) variable.evaluate(), 0.0);

    }
}
