package tree.nodes.unary;

import tree.Node;
import tree.nodes.Operator;

public class UnaryOperator extends Operator {

    private final Node child;

    public UnaryOperator(Node child) {
        this.child = child;
    }

    public Node getChild() {
        return child;
    }

    @Override
    public Object evaluate() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
