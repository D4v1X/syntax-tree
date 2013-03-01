package evaluator.calculator.number;

import evaluator.Type;
import evaluator.calculators.Calculator;
import evaluator.calculators.annotations.Operators;
import evaluator.nodes.Operator;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CoreNumberCalculator extends Calculator implements NumberCalculator {

    @Override
    @Operators("+")
    public Double add(Double arg0, Double arg1) {
        return arg0 + arg1;
    }
    
    @Override
    @Operators("+")
    public Double add(Double arg0, Integer arg1) {
        return arg0 + arg1;
    }

    @Override
    @Operators("+")
    public Double add(Integer arg0, Double arg1) {
        return arg0 + arg1;
    }

    @Override
    @Operators("+")
    public Integer add(Integer arg0, Integer arg1) {
        return arg0 + arg1;
    }

    @Override
    @Operators("-")
    public Double subtract(Double arg0, Double arg1) {
        return arg0 - arg1;
    }

    @Override
    @Operators("-")
    public Double subtract(Double arg0, Integer arg1) {
        return arg0 - arg1;
    }

    @Override
    @Operators("-")
    public Double subtract(Integer arg0, Double arg1) {
        return arg0 - arg1;
    }

    @Override
    @Operators("-")
    public Integer subtract(Integer arg0, Integer arg1) {
        return arg0 - arg1;
    }

    @Override
    @Operators("*")
    public Double mul(Double arg0, Double arg1) {
        return arg0 * arg1;
    }

    @Override
    @Operators("*")
    public Double mul(Double arg0, Integer arg1) {
        return arg0 * arg1;
    }

    @Override
    @Operators("*")
    public Double mul(Integer arg0, Double arg1) {
        return arg0 * arg1;
    }

    @Override
    @Operators("*")
    public Integer mul(Integer arg0, Integer arg1) {
        return arg0 * arg1;
    }

    @Override
    public Type calculate(Operator operator, Type arg0, Type arg1) {
        if (operator == null) {
            return null;
        }
        try {
            Method method = getClass().getMethod(operator.getName(), arg0.getValue().getClass(), arg1.getValue().getClass());
            return findType(method.invoke(this, arg0.getValue(), arg1.getValue()));
        } catch (NoSuchMethodException | SecurityException ex) {
            return null;
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            return null;
        }
    }

    private Type findType(Object object) {
        if (object instanceof Integer) {
            return new evaluator.types.Integer((Integer) object);
        }
        if (object instanceof Double) {
            return new evaluator.types.Double((Double) object);
        }
        return null;
    }
}
