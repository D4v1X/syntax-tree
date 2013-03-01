package evaluator.nodes.binary;

import evaluator.Node;
import evaluator.Type;
import evaluator.calculator.number.CoreNumberCalculator;
import evaluator.calculators.Calculator;
import evaluator.nodes.Operation;

public class BinaryOperation extends Operation {

    private final BinaryOperator operation;
    private final Node leftChild, rightChild;

    public BinaryOperation(BinaryOperator operation, Node leftChild, Node rightChild) {
        this.operation = operation;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public BinaryOperator getOperation() {
        return operation;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    @Override
    public Type evaluate() {
        Type left = getLeftChild().evaluate();
        Type right = getRightChild().evaluate();
        return calculate(findCalculator(left, right), left, right);
    }

    private Calculator findCalculator(Type left, Type right) {
        if (left == null || right == null) {
            return null;
        }
        if ((left.getValue() instanceof Double) && (right.getValue() instanceof Double)) {
            return new CoreNumberCalculator();
        }
        if ((left.getValue() instanceof Integer) && (right.getValue() instanceof Double)) {
            return new CoreNumberCalculator();
        }
        if ((left.getValue() instanceof Double) && (right.getValue() instanceof Integer)) {
            return new CoreNumberCalculator();
        }
        if ((left.getValue() instanceof Integer) && (right.getValue() instanceof Integer)) {
            return new CoreNumberCalculator();
        }
        return null;
    }

    private Type calculate(Calculator calculator, Type left, Type right) {
        if (calculator == null) {
            return null;
        }
        return calculator.calculate(operation, left, right);
    }
}