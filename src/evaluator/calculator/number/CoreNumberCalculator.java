package evaluator.calculator.number;

import evaluator.Type;
import evaluator.calculators.Calculator;
import evaluator.nodes.Operator;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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

    @Override
    public Type calculate(Operator operation, Type arg0, Type arg1) {
        if (operation == null) {
            return null;
        }
        try {
            Method method = getClass().getMethod(operation.getName(), arg0.getClass(), arg1.getClass());
            return (Type) method.invoke(this, arg0, arg1);
        } catch (NoSuchMethodException | SecurityException ex) {
            return null;
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            return null;
        }
    }
}
