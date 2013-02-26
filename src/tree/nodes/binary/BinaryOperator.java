package tree.nodes.binary;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import tree.Node;
import tree.calculator.Calculator;
import tree.calculator.number.CoreNumberCalculator;
import tree.nodes.Operator;

public class BinaryOperator extends Operator {

    private final BinaryOperation operation;
    private final Node leftChild, rightChild;

    public BinaryOperator(BinaryOperation operation, Node leftChild, Node rightChild) {
        this.operation = operation;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public BinaryOperation getOperation() {
        return operation;
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
        //Calculator calc = findCalculator(left, right);
        //return calc.calculate(operation, (Type)left, (Type)right);
        return calculate(findCalculator(left, right), left, right);
    }

    private Calculator findCalculator(Object left, Object right) {
        if (left == null || right == null) {
            return null;
        }
        if ((left instanceof Double) && (right instanceof Double)) {
            return new CoreNumberCalculator();
        }
        if ((left instanceof Integer) && (right instanceof Double)) {
            return new CoreNumberCalculator();
        }
        if ((left instanceof Double) && (right instanceof Integer)) {
            return new CoreNumberCalculator();
        }
        if ((left instanceof Integer) && (right instanceof Integer)) {
            return new CoreNumberCalculator();
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
            return null;
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            return null;
        }
    }
}
