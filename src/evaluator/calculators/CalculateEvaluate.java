package evaluator.calculators;

import evaluator.nodes.Operator;
import java.util.HashMap;

public class CalculateEvaluate {
    
    private static HashMap<String,Operator> operatorMap;
    static{
        operatorMap = new HashMap<>();
        operatorMap.put("+", Operator.add);
        operatorMap.put("-", Operator.subtract);
        operatorMap.put("*", Operator.mul);
     //   operatorMap.get("+",new Operator("+", Binary));
    }

    public static Operator getOperator(String value) {
        return operatorMap.get(value);
    }
}
