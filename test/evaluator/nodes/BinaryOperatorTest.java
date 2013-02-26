package evaluator.nodes;

import evaluator.nodes.Constant;
import static org.junit.Assert.*;
import org.junit.Test;
import evaluator.Node;
import evaluator.nodes.binary.BinaryOperator;
import evaluator.nodes.binary.BinaryOperation;

public class BinaryOperatorTest {
    
    @Test
    public void testAddDoubleDouble() {
        Node node = new BinaryOperation(BinaryOperator.add, new Constant<>(3.0), new Constant<>(5.0));
        assertEquals(Double.class, node.evaluate().getClass());
        assertEquals(8.0, (double) node.evaluate(), 0.001);
    }

    @Test
    public void testAddDoubleInteger() {
        Node token = new BinaryOperation(BinaryOperator.add, new Constant<>(3.0), new Constant<>(5));
        assertEquals(Double.class, token.evaluate().getClass());
        assertEquals(8.0, (double) token.evaluate(), 0.001);
    }

    @Test
    public void testAddIntegerDouble() {
        Node token = new BinaryOperation(BinaryOperator.add, new Constant<>(3), new Constant<>(5.0));
        assertEquals(Double.class, token.evaluate().getClass());
        assertEquals(8.0, (double) token.evaluate(), 0.001);
    }

    @Test
    public void testAddIntegerInteger() {
        Node token = new BinaryOperation(BinaryOperator.add, new Constant<>(3), new Constant<>(5));
        assertEquals(Integer.class, token.evaluate().getClass());
        assertEquals(8, (int) token.evaluate());
    }
}
