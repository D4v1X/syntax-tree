package evaluator.nodes.binary;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import evaluator.Node;
import evaluator.Type;
import evaluator.calculators.Calculator;
import evaluator.calculator.number.CoreNumberCalculator;
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
        Calculator calc = findCalculator(left, right);
        return calc.calculate(operation, (Type)left, (Type)right);
        //return calculate(findCalculator(left, right), left, right);
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

    private Type calculate(Calculator calculator, Type left, Type right) {
        if (calculator == null) {
            return null;
        }
        try {
            Method method = calculator.getClass().getMethod(operation.getName(), left.getClass(), right.getClass());
            return (Type) method.invoke(calculator, left, right);
        } catch (NoSuchMethodException | SecurityException ex) {
            return null;
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            return null;
        }
    }
}
