package Nodes.BinaryOperators;

import Nodes.BinaryOperationNode;
import Nodes.Node;

public class ModulusNode extends BinaryOperationNode {

    public ModulusNode(Node leftNode, Node rigthNode) {
        super(leftNode, rigthNode);
    }

    @Override
    public double evaluate() {
        return (getLeftNode().evaluate() % getRigthNode().evaluate());
    }
}
