package tree.nodes.unaryoperators;

import tree.Node;
import tree.nodes.UnaryOperationNode;

public class AbsoluteNode extends UnaryOperationNode {

    public AbsoluteNode(Node leftNode) {
        super(leftNode);
    }

    @Override
    public double evaluate() {
        return (getLeftNode().evaluate() < 0 ? -getLeftNode().evaluate() : getLeftNode().evaluate());
    }
}
