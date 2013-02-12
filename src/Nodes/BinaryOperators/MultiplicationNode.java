package Nodes.BinaryOperators;

import Nodes.BinaryOperationNode;
import Nodes.Node;

public class MultiplicationNode extends BinaryOperationNode {

    public MultiplicationNode(Node leftNode, Node rigthNode) {
        super(leftNode, rigthNode);
    }

    @Override
    public double evaluate() {
        return (getLeftNode().evaluate() * getRigthNode().evaluate());
    }
}
