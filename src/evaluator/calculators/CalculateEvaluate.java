package evaluator.calculators;

import evaluator.Type;
import evaluator.calculator.number.CoreNumberCalculator;
import evaluator.nodes.Operator;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CalculateEvaluate implements Evaluate {

    private static HashMap<String, Method> linkedTable;
    private static List<Class<? extends Calculator>> calculators = new ArrayList<>();

    static {
        calculators.addAll(Arrays.asList(CoreNumberCalculator.class));
    }

    static {
        linkedTable = new HashMap<>();
        for (Class calculator : calculators) {
            Method[] methods = calculator.getDeclaredMethods();
            for (Method method : methods) {
                linkedTable.put(getMethodSignature(method), method);
            }
        }
//        linkedTable.put("addDoubleDouble", null);
//        linkedTable.put("+", Operator.add);
//        linkedTable.put("-", Operator.subtract);
//        linkedTable.put("*", Operator.mul);
//        operatorMap.get("+",new Operator("+", OperatorType.BINARY));
    }

    @Override
    public Type calculate(Operator operator, Type arg0, Type arg1) {
        if (operator == null) {
            return null;
        }
        Method method = linkedTable.get(getsignature(operator, arg0, arg1));
//        for (Method method : allmethods) {
//            Operators anno = method.getAnnotation(Operators.class);
//            if (anno.value().equals(operator.getOperator())) {
//                // TODO Poco a poco xD
//            }
//        }
        try {
            return findType(method.invoke(method.getDeclaringClass().newInstance(), arg0.getValue(), arg1.getValue()));
        } catch (InstantiationException ex) {
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

    private static String getMethodSignature(Method method) {
        String signature = method.getName();
        Class<?>[] params = method.getParameterTypes();
        for (Class param : params) {
            signature = signature + param.getSimpleName();
        }
        return signature;
    }

    private String getsignature(Operator operator, Type arg0, Type arg1) {
        return (operator.getName() + arg0.getClass().getSimpleName() + arg1.getClass().getSimpleName());
    }
}
