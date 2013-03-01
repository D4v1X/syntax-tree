package evaluator.calculator.number;

import evaluator.Type;
import evaluator.nodes.Operator;

public interface NumberCalculator {

    public Double add(Double arg0, Double arg1);

    public Double add(Double arg0, Integer arg1);

    public Double add(Integer arg0, Double arg1);

    public Integer add(Integer arg0, Integer arg1);

    public Double subtract(Double arg0, Double arg1);

    public Double subtract(Double arg0, Integer arg1);

    public Double subtract(Integer arg0, Double arg1);

    public Integer subtract(Integer arg0, Integer arg1);

    public Double mul(Double arg0, Double arg1);

    public Double mul(Double arg0, Integer arg1);

    public Double mul(Integer arg0, Double arg1);

    public Integer mul(Integer arg0, Integer arg1);
    
    public Type calculate (Operator operation, Type p0, Type p1);
}