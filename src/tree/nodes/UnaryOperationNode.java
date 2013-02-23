package tree.nodes;

import tree.Node;

public abstract class UnaryOperationNode extends Operator {

    private final Node leftNode;

    public UnaryOperationNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getLeftNode() {
        return leftNode;
    }
}
