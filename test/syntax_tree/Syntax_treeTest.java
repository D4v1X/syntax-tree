package syntax_tree;

import evaluator.Node;
import evaluator.Tree;
import evaluator.nodes.Constant;
import evaluator.nodes.binary.BinaryOperation;
import evaluator.nodes.binary.BinaryOperator;
import evaluator.types.Double;
import static java.lang.System.out;
import static org.junit.Assert.*;
import org.junit.Test;

public class Syntax_treeTest {

    @Test
    public void testTree() {
        out.print("Tree: 1 + 2 * 3 = ");
        Tree tree = new Tree();
        Node uno = new Constant(new Double(1.0));
        Node dos = new Constant(new Double(2.0));
        Node tres = new Constant(new Double(3.0));
        Node multi = new BinaryOperation(BinaryOperator.mul, dos, tres);
        Node sum = new BinaryOperation(BinaryOperator.add, uno, multi);
        tree.setRoot(sum);
        out.println(tree.run().getValue());
        assertEquals(7.0, (double) tree.run().getValue(), 0.0);
    }

    @Test
    public void testTree2() {
        out.print("Tree: 1 + 2 - 3 = ");
        Tree tree = new Tree();
        Node uno = new Constant(new Double(1.0));
        Node dos = new Constant(new Double(2.0));
        Node tres = new Constant(new Double(3.0));
        Node resta = new BinaryOperation(BinaryOperator.subtract, dos, tres);
        Node sum = new BinaryOperation(BinaryOperator.add, uno, resta);
        tree.setRoot(sum);
        out.println(tree.run().getValue());
        assertEquals(0.0, (double)tree.run().getValue(), 0.0);
    }
}
