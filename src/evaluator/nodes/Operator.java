package evaluator.nodes;

public class Operator {

    public static final Operator add = new Operator("add", '+', true);
    public static final Operator subtract = new Operator("subtract", '-', true);
    public static final Operator mul = new Operator("mul", '*', true);
    
    private final String name;
    private final char operator;
    private final Boolean isBinary;

    //OperatorType.Binary
    
    public Operator(String name, char operator, Boolean isBinary) {
        this.name = name;
        this.operator = operator;
        this.isBinary = isBinary;
    }

    public String getName() {
        return name;
    }

    public String getOperator() {
        return Character.toString(operator);
    }

    public Boolean getIsBinary() {
        return isBinary;
    }
}
