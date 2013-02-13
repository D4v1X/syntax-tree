package tree.nodes.binaryoperators;

import tree.nodes.BinaryOperationNode;
import tree.nodes.Node;

public class AddNode extends BinaryOperationNode {

    public AddNode(Node leftNode, Node rigthNode) {
        super(leftNode, rigthNode);
    }

    @Override
    public double evaluate() {
        return (getLeftNode().evaluate() + getRigthNode().evaluate());
    }
}
