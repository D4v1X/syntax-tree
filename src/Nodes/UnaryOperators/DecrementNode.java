package Nodes.UnaryOperators;

import Nodes.Node;
import Nodes.UnaryOperationNode;

public class DecrementNode extends UnaryOperationNode {

    public DecrementNode(Node leftNode) {
        super(leftNode);
    }

    @Override
    public double evaluate() {
        return (getLeftNode().evaluate() - 1);
    }
}
