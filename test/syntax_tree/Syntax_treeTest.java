package syntax_tree;

import static java.lang.System.out;
import static org.junit.Assert.*;
import org.junit.Test;
import evaluator.Node;
import evaluator.Tree;
import evaluator.nodes.binary.BinaryOperator;
import evaluator.nodes.binary.BinaryOperation;
import evaluator.nodes.Constant;

public class Syntax_treeTest {

    @Test
    public void testTree() {
        out.print("Tree: 1 + 2 * 3 = ");
        Tree tree = new Tree();
        Node uno = new Constant<>(1.0);
        Node dos = new Constant<>(2.0);
        Node tres = new Constant<>(3.0);
        Node multi = new BinaryOperation(BinaryOperator.mul, dos, tres);
        Node sum = new BinaryOperation(BinaryOperator.add, uno, multi);
        tree.setRoot(sum);
        out.println(tree.run());
        assertEquals(7.0, (double) tree.run(), 0.0);
    }

    @Test
    public void testTree2() {
        out.print("Tree: 1 + 2 - 3 = ");
        Tree tree = new Tree();
        Node uno = new Constant<>(1);
        Node dos = new Constant<>(2);
        Node tres = new Constant<>(3);
        Node resta = new BinaryOperation(BinaryOperator.subtract, dos, tres);
        Node sum = new BinaryOperation(BinaryOperator.add, uno, resta);
        tree.setRoot(sum);
        out.println(tree.run());
        assertEquals(0, (Integer)tree.run(), 0.0);
    }
}
