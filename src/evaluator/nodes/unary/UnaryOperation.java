package evaluator.nodes.unary;

import evaluator.Node;
import evaluator.Type;
import evaluator.nodes.Operation;

public class UnaryOperation extends Operation {

    private final UnaryOperator unaryOperation;
    private final Node child;

    public UnaryOperation(UnaryOperator unaryOperation, Node child) {
        this.unaryOperation = unaryOperation;
        this.child = child;
    }

    public Node getChild() {
        return child;
    }

    @Override
    public Type evaluate() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
