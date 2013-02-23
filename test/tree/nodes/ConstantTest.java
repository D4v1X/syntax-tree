package tree.nodes;

import static org.junit.Assert.*;
import org.junit.Test;

public class ConstantTest {

    @Test
    public void testEvaluate() {
        Constant constant = new Constant<>(2.0);
        assertEquals(Double.class, constant.evaluate().getClass());
        assertEquals(2.0, (double) constant.evaluate(), 0.0);
    }

    @Test
    public void testEvaluateNumNegative() {
        Constant constant = new Constant(-2.0);
        assertEquals(Double.class, constant.evaluate().getClass());
        assertEquals(-2.0, (double) constant.evaluate(), 0.0);
    }

    @Test
    public void testEvaluateZero() {
        Constant constant = new Constant(0.0);
        assertEquals(Double.class, constant.evaluate().getClass());
        assertEquals(0.0, (double) constant.evaluate(), 0.0);
    }
}
