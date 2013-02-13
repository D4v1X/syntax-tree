package syntax_tree;

import tree.nodes.binaryoperators.AddNode;
import tree.nodes.binaryoperators.MultiplicationNode;
import tree.nodes.binaryoperators.SubtracNode;
import tree.nodes.Node;
import tree.nodes.ConstantNode;
import static java.lang.System.out;
import static org.junit.Assert.*;
import org.junit.Test;
import tree.Tree;

public class Syntax_treeTest {

    @Test
    public void testTree() {
        out.print("Tree: 1 + 2 * 3 = ");
        Tree tree = new Tree();
        Node uno = new ConstantNode(1);
        Node dos = new ConstantNode(2);
        Node tres = new ConstantNode(3);
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
        out.print("Tree: 1 + 2 - 3 = ");
        Tree tree = new Tree();
        Node uno = new ConstantNode(1);
        Node dos = new ConstantNode(2);
        Node tres = new ConstantNode(3);
        Node resta = new SubtracNode(dos, tres);
        Node sum = new AddNode(uno, resta);
        tree.setRoot(sum);
        out.println(tree.run());
        double expResult = 0;
        double result = tree.run();
        assertEquals(expResult, result, 0.0);
    }
    
}
