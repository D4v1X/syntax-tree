package syntax_tree;

import static java.lang.System.out;
import static org.junit.Assert.*;
import org.junit.Test;
import tree.Tree;
import tree.nodes.ConstantValueNode;
import tree.nodes.Node;
import tree.nodes.binaryoperators.AddNode;
import tree.nodes.binaryoperators.MultiplicationNode;
import tree.nodes.binaryoperators.SubtracNode;

public class Syntax_treeTest {

    @Test
    public void testTree() {
        out.print("Tree: 1 + 2 * 3 = ");
        Tree tree = new Tree();
        Node uno = new ConstantValueNode(1.0);
        Node dos = new ConstantValueNode(2.0);
        Node tres = new ConstantValueNode(3.0);
        Node multi = new MultiplicationNode(dos, tres);
        Node sum = new AddNode(uno, multi);
        tree.setRoot(sum);
        out.println(tree.run());
        double expResult = 7.0;
        double result = tree.run();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testTree2() {
        out.print("Tree: 1 + 2 - 3 = ");
        Tree tree = new Tree();
        Node uno = new ConstantValueNode(1);
        Node dos = new ConstantValueNode(2);
        Node tres = new ConstantValueNode(3);
        Node resta = new SubtracNode(dos, tres);
        Node sum = new AddNode(uno, resta);
        tree.setRoot(sum);
        out.println(tree.run());
        double expResult = 0;
        double result = tree.run();
        assertEquals(expResult, result, 0.0);
    }
    
}
