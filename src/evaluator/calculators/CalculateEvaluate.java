package evaluator.calculators;

import evaluator.nodes.Operator;
import java.util.HashMap;

public class CalculateEvaluate {
    
    private static HashMap<String,Operator> operatorMap;
    static{
        operatorMap = new HashMap<>();
     //   operatorMap.get("+",new Operator("+", Binary));
     //   operatorMap.add("+",BinaryOperator.add);
    }
    
}
