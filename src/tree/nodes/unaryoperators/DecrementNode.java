package tree.nodes.unaryoperators;

import tree.nodes.Node;
import tree.nodes.UnaryOperationNode;

public class DecrementNode extends UnaryOperationNode {

    public DecrementNode(Node leftNode) {
        super(leftNode);
    }

    @Override
    public double evaluate() {
        return (getLeftNode().evaluate() - 1);
    }
}
