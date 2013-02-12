package Nodes.BinaryOperators;

import Nodes.BinaryOperationNode;
import Nodes.Node;

public class SubtracNode extends BinaryOperationNode {

    public SubtracNode(Node leftNode, Node rigthNode) {
        super(leftNode, rigthNode);
    }

    @Override
    public double evaluate() {
        return (getLeftNode().evaluate() - getRigthNode().evaluate());
    }
}
