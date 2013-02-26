package evaluator.nodes;

public abstract class Operator {
    protected final String name;
    protected final char operator;

    public Operator(String name, char operator) {
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
