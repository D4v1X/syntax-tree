package tree.nodes;

public class BinaryOperation {
    public static  final BinaryOperation add = new BinaryOperation("add", '+');
    public static  final BinaryOperation subtract = new BinaryOperation("subtract", '-');
    public static  final BinaryOperation mul = new BinaryOperation("mul", '*');
    
    private final String name;
    private final char operator;

    public BinaryOperation(String name, char operator) {
        this.name = name;
        this.operator = operator;
    }

    public String getName() {
        return name;
    }

    public String getOperator() {
        return Character.toString(operator);
    }
}
