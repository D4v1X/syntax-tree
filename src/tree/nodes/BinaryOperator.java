package tree.nodes;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import tree.Node;
import tree.calculator.Calculator;
import tree.calculator.NumberCalculator;

public class BinaryOperator extends Operator {

    private final BinaryOperation operation;
    private final Node leftChild, rightChild;

    public BinaryOperator(BinaryOperation operation, Node leftChild, Node rightChild) {
        this.operation = operation;
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
        return calculate(findCalculator(left, right), left, right);
    }

    private Calculator findCalculator(Object left, Object right) {
        if (left == null || right == null) {
            return null;
        }
        if ((left instanceof Double) && (right instanceof Double)) {
            return new NumberCalculator();
        }
        if ((left instanceof Integer) && (right instanceof Double)) {
            return new NumberCalculator();
        }
        if ((left instanceof Double) && (right instanceof Integer)) {
            return new NumberCalculator();
        }
        if ((left instanceof Integer) && (right instanceof Integer)) {
            return new NumberCalculator();
        }
        return null;
    }

    private Object calculate(Calculator calculator, Object left, Object right) {
        if (calculator == null) {
            return null;
        }
        try {
            Method method = calculator.getClass().getMethod(operation.getName(), left.getClass(), right.getClass());
            return method.invoke(calculator, left, right);
        } catch (NoSuchMethodException | SecurityException ex) {
            Logger.getLogger(BinaryOperator.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(BinaryOperator.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
