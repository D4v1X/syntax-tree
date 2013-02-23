package tree.nodes;

public class BinaryOperation {
    public static  final BinaryOperation add = new BinaryOperation("add", '+');
    
    private final String name;
    private final char operator;

    public BinaryOperation(String name, char operator) {
        this.name = name;
        this.operator = operator;
    }

    public String getName() {
        return name;
    }

    public char getOperator() {
        return operator;
    }
}
