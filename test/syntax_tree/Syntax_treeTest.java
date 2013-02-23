package syntax_tree;

import static java.lang.System.out;
import static org.junit.Assert.*;
import org.junit.Test;
import tree.Node;
import tree.Tree;
import tree.nodes.binary.BinaryOperation;
import tree.nodes.binary.BinaryOperator;
import tree.nodes.ConstantValue;

public class Syntax_treeTest {

    @Test
    public void testTree() {
        out.print("Tree: 1 + 2 * 3 = ");
        Tree tree = new Tree();
        Node uno = new ConstantValue<>(1.0);
        Node dos = new ConstantValue<>(2.0);
        Node tres = new ConstantValue<>(3.0);
        Node multi = new BinaryOperator(BinaryOperation.mul, dos, tres);
        Node sum = new BinaryOperator(BinaryOperation.add, uno, multi);
        tree.setRoot(sum);
        out.println(tree.run());
        assertEquals(7.0, (double) tree.run(), 0.0);
    }

    @Test
    public void testTree2() {
        out.print("Tree: 1 + 2 - 3 = ");
        Tree tree = new Tree();
        Node uno = new ConstantValue<>(1);
        Node dos = new ConstantValue<>(2);
        Node tres = new ConstantValue<>(3);
        Node resta = new BinaryOperator(BinaryOperation.subtract, dos, tres);
        Node sum = new BinaryOperator(BinaryOperation.add, uno, resta);
        tree.setRoot(sum);
        out.println(tree.run());
        assertEquals(0, (Integer)tree.run(), 0.0);
    }
}
