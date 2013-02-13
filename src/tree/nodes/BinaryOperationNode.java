package tree.nodes;

import tree.nodes.Node;

public abstract class BinaryOperationNode extends OperationNode {

    private final Node leftNode, rigthNode;

    public BinaryOperationNode(Node leftNode, Node rigthNode) {
        this.leftNode = leftNode;
        this.rigthNode = rigthNode;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public Node getRigthNode() {
        return rigthNode;
    }
}
