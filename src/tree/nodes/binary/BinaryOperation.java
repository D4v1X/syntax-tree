package tree.nodes.binary;

import tree.nodes.Operation;

public class BinaryOperation extends Operation {
    public static final BinaryOperation add = new BinaryOperation("add", '+');
    public static final BinaryOperation subtract = new BinaryOperation("subtract", '-');
    public static final BinaryOperation mul = new BinaryOperation("mul", '*');

    public BinaryOperation(String name, char operator) {
        super(name, operator);
    }
}
