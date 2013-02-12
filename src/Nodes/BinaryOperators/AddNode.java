package Nodes.BinaryOperators;

import Nodes.BinaryOperationNode;
import Nodes.Node;

public class AddNode extends BinaryOperationNode {

    public AddNode(Node leftNode, Node rigthNode) {
        super(leftNode, rigthNode);
    }

    @Override
    public double evaluate() {
        return (getLeftNode().evaluate() + getRigthNode().evaluate());
    }
}
