package tree.nodes;

class VariableValue<T> extends Node {

    private T variable;

    public VariableValue(T variable) {
        this.variable = variable;
    }

    public T getVariable() {
        return variable;
    }

    public void setVariable(T variable) {
        this.variable = variable;
    }

    @Override
    public Object evaluate() {
        return getVariable();
    }

}
