package tree.nodes.unaryoperators;

import tree.nodes.Node;
import tree.nodes.UnaryOperationNode;

public class IncrementNode extends UnaryOperationNode {

    public IncrementNode(Node leftNode) {
        super(leftNode);
    }

    @Override
    public double evaluate() {
        return (getLeftNode().evaluate() + 1);
    }
}
