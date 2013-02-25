package tree.nodes;

import static org.junit.Assert.*;
import org.junit.Test;
import tree.Node;
import tree.nodes.binary.BinaryOperation;
import tree.nodes.binary.BinaryOperator;

public class BinaryOperatorTest {
    
    @Test
    public void testAddDoubleDouble() {
        Node node = new BinaryOperator(BinaryOperation.add, new Constant<>(3.0), new Constant<>(5.0));
        assertEquals(Double.class, node.evaluate().getClass());
        assertEquals(8.0, (double) node.evaluate(), 0.001);
    }

    @Test
    public void testAddDoubleInteger() {
        Node token = new BinaryOperator(BinaryOperation.add, new Constant<>(3.0), new Constant<>(5));
        assertEquals(Double.class, token.evaluate().getClass());
        assertEquals(8.0, (double) token.evaluate(), 0.001);
    }

    @Test
    public void testAddIntegerDouble() {
        Node token = new BinaryOperator(BinaryOperation.add, new Constant<>(3), new Constant<>(5.0));
        assertEquals(Double.class, token.evaluate().getClass());
        assertEquals(8.0, (double) token.evaluate(), 0.001);
    }

    @Test
    public void testAddIntegerInteger() {
        Node token = new BinaryOperator(BinaryOperation.add, new Constant<>(3), new Constant<>(5));
        assertEquals(Integer.class, token.evaluate().getClass());
        assertEquals(8, (int) token.evaluate());
    }
}
