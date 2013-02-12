package syntax_tree;

import Nodes.BinaryOperators.AddNode;
import Nodes.BinaryOperators.MultiplicationNode;
import Nodes.Node;
import Nodes.NumberNode;
import static java.lang.System.out;
import static org.junit.Assert.*;
import org.junit.Test;
import tree.Tree;

public class Syntax_treeTest {

    @Test
    public void testTree() {
        out.print("Tree: 1 + 2 * 3 = ");
        Tree tree = new Tree();
        Node uno = new NumberNode(1);
        Node dos = new NumberNode(2);
        Node tres = new NumberNode(3);
        Node multi = new MultiplicationNode(dos, tres);
        Node sum = new AddNode(uno, multi);
        tree.setRoot(sum);
        out.println(tree.run());
        double expResult = 7;
        double result = tree.run();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testTree2() {
        out.print("Tree: 1 + 2 * 3 = ");
        Tree tree = new Tree();
        Node uno = new NumberNode(1);
        Node dos = new NumberNode(2);
        Node tres = new NumberNode(3);
        Node multi = new MultiplicationNode(dos, tres);
        Node sum = new AddNode(uno, multi);
        tree.setRoot(sum);
        out.println(tree.run());
        double expResult = 7;
        double result = tree.run();
        assertEquals(expResult, result, 0.0);
    }
}
