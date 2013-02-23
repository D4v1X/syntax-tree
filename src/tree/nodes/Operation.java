package tree.nodes;

public abstract class Operation {
    protected final String name;
    protected final char operator;

    public Operation(String name, char operator) {
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
