package tree.nodes;

import static org.junit.Assert.*;
import org.junit.Test;

public class VariableValueTest {

    @Test
    public void testEvaluate() {
        VariableValue variable = new VariableValue(2.0);
        assertEquals(Double.class, variable.evaluate().getClass());
        assertEquals(2.0, (double) variable.evaluate(), 0.0);
    }

    @Test
    public void testSetVariable() {
        VariableValue variable = new VariableValue(2.0);
        assertEquals(Double.class, variable.evaluate().getClass());
        assertEquals(2.0, (double) variable.evaluate(), 0.0);
        double value = 3.0;
        variable.setVariable(value);
        assertEquals(Double.class, variable.evaluate().getClass());
        assertEquals(3.0, (double) variable.evaluate(), 0.0);

    }
}
