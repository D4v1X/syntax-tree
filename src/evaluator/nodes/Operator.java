package evaluator.nodes;

public class Operator {

    public static final Operator add = new Operator("add", '+', OperatorType.BINARY);
    public static final Operator subtract = new Operator("subtract", '-', OperatorType.BINARY);
    public static final Operator mul = new Operator("mul", '*', OperatorType.BINARY);
    
    private final String name;
    private final char operator;
    private final OperatorType operatorType;

    //OperatorType.Binary
    
    public Operator(String name, char operator, OperatorType operatorType) {
        this.name = name;
        this.operator = operator;
        this.operatorType = operatorType;
    }

    public String getName() {
        return name;
    }

    public String getOperator() {
        return Character.toString(operator);
    }

    public OperatorType getoperatorType() {
        return operatorType;
    }
}
