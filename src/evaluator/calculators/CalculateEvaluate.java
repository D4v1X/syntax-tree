package evaluator.calculators;

import evaluator.Type;
import evaluator.calculator.number.CoreNumberCalculator;
import evaluator.calculators.annotations.Operators;
import evaluator.nodes.Operator;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

public class CalculateEvaluate implements Evaluate {

    private static HashMap<String, Operator> operatorMap;

    static {
        operatorMap = new HashMap<>();
        operatorMap.put("+", Operator.add);
        operatorMap.put("-", Operator.subtract);
        operatorMap.put("*", Operator.mul);
//        operatorMap.get("+",new Operator("+", OperatorType.BINARY));
    }

    public static Operator getOperator(String value) {
        return operatorMap.get(value);
    }

    public Type calculate(Operator operator, Type arg0, Type arg1) {
        Calculator calculator = findCalculator(arg0, arg1);
//        Method[] OperatorMethods;
//        Class[] allClass = calculator.getClass().getClasses();
//        if (allmethods == null) {
//            return null;
//        }
//        for (Method method : allmethods) {
//            Operators anno = method.getAnnotation(Operators.class);
//            if (anno.value().equals(operator.getOperator())) {
//                // TODO Poco a poco xD
//            }
//        }
        if (operator == null || calculator == null) {
            return null;
        }
        try {
            Method method = calculator.getClass().getMethod(operator.getName(), arg0.getValue().getClass(), arg1.getValue().getClass());
            return findType(method.invoke(calculator, arg0.getValue(), arg1.getValue()));
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

    private Calculator findCalculator(Type arg0, Type arg1) {
        if (arg0 == null || arg1 == null) {
            return null;
        }
        if ((arg0.getValue() instanceof Double) && (arg1.getValue() instanceof Double)) {
            return new CoreNumberCalculator();
        }
        if ((arg0.getValue() instanceof Integer) && (arg1.getValue() instanceof Double)) {
            return new CoreNumberCalculator();
        }
        if ((arg0.getValue() instanceof Double) && (arg1.getValue() instanceof Integer)) {
            return new CoreNumberCalculator();
        }
        if ((arg0.getValue() instanceof Integer) && (arg1.getValue() instanceof Integer)) {
            return new CoreNumberCalculator();
        }
        return null;
    }
}
