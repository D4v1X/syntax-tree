package evaluator.calculators;

import evaluator.Type;
import evaluator.nodes.Operator;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Set;
import org.reflections.Reflections;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;

public class CalculateEvaluate implements Evaluate {

    private static HashMap<String, Method> linkedTable;

    static {
        Reflections ref = new Reflections(new ConfigurationBuilder().setUrls(ClasspathHelper.forJavaClassPath()));
        addMethods(ref.getSubTypesOf(Calculator.class));
    }

    private static void addMethods(Set<Class<? extends Calculator>> classes) {
        for (Class<?> theClass : classes) {
            addMethods(theClass);
        }
    }

    private static void addMethods(Class<?> theClass) {
        linkedTable = new HashMap<>();
        for (Method method : theClass.getDeclaredMethods()) {
            linkedTable.put(getMethodSignature(method), method);
        }
    }

    private static String getMethodSignature(Method method) {
        String signature = method.getName();
        Class<?>[] params = method.getParameterTypes();
        for (Class param : params) {
            signature = signature + param.getSimpleName();
        }
        return signature;
    }

    @Override
    public Type calculate(Operator operator, Type arg0, Type arg1) {
        if (operator == null) {
            return null;
        }
        Method method = linkedTable.get(getsignature(operator, arg0, arg1));
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

    private String getsignature(Operator operator, Type arg0, Type arg1) {
        return (operator.getName() + arg0.getClass().getSimpleName() + arg1.getClass().getSimpleName());
    }
}
