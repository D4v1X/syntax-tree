package tree.nodes;

import tree.Node;

public class BinaryOperator extends Operator {

    private final Node leftChild, rightChild;

    public BinaryOperator(Node leftChild, Node rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    @Override
    public Object evaluate() {
        Object left = getLeftChild().evaluate();
        Object right = getRightChild().evaluate();
        //TODO Hacer la ejecucion y busqueda de la calculadora.
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
