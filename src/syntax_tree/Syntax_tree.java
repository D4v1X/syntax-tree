/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package syntax_tree;

//
import Nodes.BinaryOperators.AddNode;
import Nodes.BinaryOperators.MultiplicationNode;
import Nodes.Node;
import Nodes.NumberNode;
import static java.lang.System.out;
import tree.Tree;

/**
 *
 * @author davidsantiagobarrera
 */
public class Syntax_tree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tree tree = new Tree();
        Node leaf1 = new NumberNode(1);
        Node leaf2 = new NumberNode(2);
        Node leaf3 = new NumberNode(3);
        Node multi = new MultiplicationNode(leaf2, leaf3);
        Node sum = new AddNode(leaf1, multi);
        tree.setRoot(sum);
        out.println(tree.run());
    }
}
