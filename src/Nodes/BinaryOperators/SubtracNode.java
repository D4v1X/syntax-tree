/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodes.BinaryOperators;

import Nodes.BinaryOperationNode;
import Nodes.Node;

/**
 *
 * @author davidsantiagobarrera
 */
public class SubtracNode extends BinaryOperationNode{

    public SubtracNode(Node leftNode, Node rigthNode) {
        super(leftNode, rigthNode);
    }

    @Override
    public double evaluate() {
        return (getLeftNode().evaluate() - getRigthNode().evaluate());
    }
    
}
