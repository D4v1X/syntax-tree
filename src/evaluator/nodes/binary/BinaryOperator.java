package evaluator.nodes.binary;

import evaluator.nodes.Operator;

public class BinaryOperator extends Operator {
    public static final BinaryOperator add = new BinaryOperator("add", '+');
    public static final BinaryOperator subtract = new BinaryOperator("subtract", '-');
    public static final BinaryOperator mul = new BinaryOperator("mul", '*');

    public BinaryOperator(String name, char operator) {
        super(name, operator);
    }
}
