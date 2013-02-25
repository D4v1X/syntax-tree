package tree.calculator;

import tree.nodes.Operation;
import tree.nodes.Type;

public class RangeNumberCalculator implements NumberCalculator {

    private final NumberCalculator calculator;
    private final Range range;

    public RangeNumberCalculator(NumberCalculator calculator, Range range) {
        this.calculator = calculator;
        this.range = range;
    }

    public Range getRange() {
        return range;
    }

    public Double getUpperLimit() {
        return range.getUpperLimit();
    }

    public Double getLowerLimit() {
        return range.getLowerLimit();
    }

    private Double validate(Double arg0) {
        return arg0;
    }

    @Override
    public Double add(Double arg0, Double arg1) {
        return calculator.add(arg0, arg1);
    }

    @Override
    public Double add(Double arg0, Integer arg1) {
        return calculator.add(arg0, arg1);
    }

    @Override
    public Double add(Integer arg0, Double arg1) {
        return calculator.add(arg0, arg1);
    }

    @Override
    public Integer add(Integer arg0, Integer arg1) {
        return calculator.add(arg0, arg1);
    }

    @Override
    public Double subtract(Double arg0, Double arg1) {
        return calculator.subtract(arg0, arg1);
    }

    @Override
    public Double subtract(Double arg0, Integer arg1) {
        return calculator.subtract(arg0, arg1);
    }

    @Override
    public Double subtract(Integer arg0, Double arg1) {
        return calculator.subtract(arg0, arg1);
    }

    @Override
    public Integer subtract(Integer arg0, Integer arg1) {
        return calculator.subtract(arg0, arg1);
    }

    @Override
    public Double mul(Double arg0, Double arg1) {
        return calculator.mul(arg0, arg1);
    }

    @Override
    public Double mul(Double arg0, Integer arg1) {
        return calculator.mul(arg0, arg1);
    }

    @Override
    public Double mul(Integer arg0, Double arg1) {
        return calculator.mul(arg0, arg1);
    }

    @Override
    public Integer mul(Integer arg0, Integer arg1) {
        return calculator.mul(arg0, arg1);
    }

    @Override
    public Type calculate(Operation operation, Type p0, Type p1) {
        return calculator.calculate(operation, p0, p1);
    }
}