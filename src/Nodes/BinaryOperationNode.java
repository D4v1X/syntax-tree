/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodes;

/**
 *
 * @author davidsantiagobarrera
 */
public abstract class BinaryOperationNode extends OperationNode{
    private Node leftNode, rigthNode;

    public BinaryOperationNode(Node leftNode, Node rigthNode) {
        this.leftNode = leftNode;
        this.rigthNode = rigthNode;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public Node getRigthNode() {
        return rigthNode;
    }
    
}
