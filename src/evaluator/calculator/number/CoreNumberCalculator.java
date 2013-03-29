package evaluator.calculator.number;

import evaluator.calculators.Calculator;
import evaluator.calculators.annotations.Constants;
import evaluator.calculators.annotations.Operators;

public class CoreNumberCalculator extends Calculator implements NumberCalculator {

    @Constants("PI")
    static Double PI = Math.PI;
    
    @Constants("E")
    static Double E = Math.E;

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
}
