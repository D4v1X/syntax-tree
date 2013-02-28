package evaluator.nodes;

public abstract class Operator {
    protected final String name;
    protected final char operator;
    protected final Boolean isBinary;

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
