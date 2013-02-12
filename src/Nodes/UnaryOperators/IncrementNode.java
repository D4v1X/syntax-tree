package Nodes.UnaryOperators;

import Nodes.Node;
import Nodes.UnaryOperationNode;

public class IncrementNode extends UnaryOperationNode {

    public IncrementNode(Node leftNode) {
        super(leftNode);
    }

    @Override
    public double evaluate() {
        return (getLeftNode().evaluate() + 1);
    }
}
