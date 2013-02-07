/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodes.UnaryOperators;

import Nodes.UnaryOperationNode;

/**
 *
 * @author davidsantiagobarrera
 */
public class DecrementNode extends UnaryOperationNode{

    @Override
    public double evaluate() {
        return (getLeftNode().evaluate()-1);
    }
    
}
