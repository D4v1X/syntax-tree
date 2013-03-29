package syntax_tree;

import evaluator.Node;
import evaluator.nodes.Constant;
import evaluator.nodes.Operator;
import evaluator.nodes.binary.BinaryOperation;
import evaluator.types.Double;
import static java.lang.System.out;
import static org.junit.Assert.*;
import org.junit.Test;

public class Syntax_treeTest {

    @Test
    public void testTree() {
        Node uno = new Constant(new Double(1.0));
        Node dos = new Constant(new Double(2.0));
        Node tres = new Constant(new Double(3.0));
        Node multi = new BinaryOperation(Operator.mul, dos, tres);
        Node sum = new BinaryOperation(Operator.add, uno, multi);
        out.println(sum.parse() + "=" + sum.evaluate().getValue());
        assertEquals(7.0, (double) sum.evaluate().getValue(), 0.0);
    }

    @Test
    public void testTree2() {
        Node uno = new Constant(new Double(1.0));
        Node dos = new Constant(new Double(2.0));
        Node tres = new Constant(new Double(3.0));
        Node resta = new BinaryOperation(Operator.subtract, dos, tres);
        Node sum = new BinaryOperation(Operator.add, uno, resta);
        out.println(sum.parse() + "=" + sum.evaluate().getValue());
        assertEquals(0.0, (double) sum.evaluate().getValue(), 0.0);
    }
}
