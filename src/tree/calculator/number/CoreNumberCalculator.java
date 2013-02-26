package tree.calculator.number;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import tree.calculator.Calculator;
import tree.nodes.Operation;
import tree.nodes.Type;
import tree.nodes.binary.BinaryOperator;
import tree.nodes.types.DoubleType;

public class CoreNumberCalculator extends Calculator implements NumberCalculator {

    @Override
    public Double add(Double arg0, Double arg1) {
        return arg0 + arg1;
    }

    @Override
    public Double add(Double arg0, Integer arg1) {
        return arg0 + arg1;
    }

    @Override
    public Double add(Integer arg0, Double arg1) {
        return arg0 + arg1;
    }

    @Override
    public Integer add(Integer arg0, Integer arg1) {
        return arg0 + arg1;
    }

    @Override
    public Double subtract(Double arg0, Double arg1) {
        return arg0 - arg1;
    }

    @Override
    public Double subtract(Double arg0, Integer arg1) {
        return arg0 - arg1;
    }

    @Override
    public Double subtract(Integer arg0, Double arg1) {
        return arg0 - arg1;
    }

    @Override
    public Integer subtract(Integer arg0, Integer arg1) {
        return arg0 - arg1;
    }

    @Override
    public Double mul(Double arg0, Double arg1) {
        return arg0 * arg1;
    }

    @Override
    public Double mul(Double arg0, Integer arg1) {
        return arg0 * arg1;
    }

    @Override
    public Double mul(Integer arg0, Double arg1) {
        return arg0 * arg1;
    }

    @Override
    public Integer mul(Integer arg0, Integer arg1) {
        return arg0 * arg1;
    }

    public DoubleType add(DoubleType arg0, DoubleType arg1) {
        Double valuedouble = (Double) arg0.evaluate() + (Double) arg1.evaluate();
        return new DoubleType(valuedouble);
    }

    @Override
    public Type calculate(Operation operation, Type arg0, Type arg1) {
        if (operation == null) {
            return null;
        }
        try {
            Method method = getClass().getMethod(operation.getName(), arg0.getClass(), arg1.getClass());
            return (Type) method.invoke(this, arg0, arg1);
        } catch (NoSuchMethodException | SecurityException ex) {
            Logger.getLogger(BinaryOperator.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(BinaryOperator.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
