package tree.nodes.binaryoperators;

import tree.nodes.BinaryOperationNode;
import tree.nodes.Node;

public class SubtracNode extends BinaryOperationNode {

    public SubtracNode(Node leftNode, Node rigthNode) {
        super(leftNode, rigthNode);
    }

    @Override
    public double evaluate() {
        return (getLeftNode().evaluate() - getRigthNode().evaluate());
    }
}
