package tree.nodes;

import static org.junit.Assert.*;
import org.junit.Test;

public class ConstantValueTest {

    @Test
    public void testEvaluate() {
        ConstantValue constant = new ConstantValue<>(2.0);
        assertEquals(Double.class, constant.evaluate().getClass());
        assertEquals(2.0, (double) constant.evaluate(), 0.0);
    }

    @Test
    public void testEvaluateNumNegative() {
        ConstantValue constant = new ConstantValue(-2.0);
        assertEquals(Double.class, constant.evaluate().getClass());
        assertEquals(-2.0, (double) constant.evaluate(), 0.0);
    }

    @Test
    public void testEvaluateZero() {
        ConstantValue constant = new ConstantValue(0.0);
        assertEquals(Double.class, constant.evaluate().getClass());
        assertEquals(0.0, (double) constant.evaluate(), 0.0);
    }
}
