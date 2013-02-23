package tree.nodes;

import tree.Node;

class Variable<T> extends Node {

    private T variable;

    public Variable(T variable) {
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
