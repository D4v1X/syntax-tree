/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodes;

/**
 *
 * @author davidsantiagobarrera
 */
public abstract class UnaryOperationNode extends OperationNode{
    
    private final Node leftNode;
    
    public UnaryOperationNode() {
        this.leftNode = null;
    }

    public Node getLeftNode() {
        return leftNode;
    }
    
}
