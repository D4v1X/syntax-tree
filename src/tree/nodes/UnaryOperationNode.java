package tree.nodes;

import tree.nodes.OperationNode;
import tree.nodes.Node;

public abstract class UnaryOperationNode extends OperationNode {

    private final Node leftNode;

    public UnaryOperationNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getLeftNode() {
        return leftNode;
    }
}
