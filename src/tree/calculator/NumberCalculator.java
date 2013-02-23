package tree.calculator;

public class NumberCalculator extends Calculator {

    public Double add(Double arg0, Double arg1) {
        return arg0 + arg1;
    }

    public Double add(Double arg0, Integer arg1) {
        return arg0 + arg1;
    }

    public Double add(Integer arg0, Double arg1) {
        return arg0 + arg1;
    }

    public Integer add(Integer arg0, Integer arg1) {
        return arg0 + arg1;
    }
}
