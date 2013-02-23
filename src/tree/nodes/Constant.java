package tree.nodes;

import tree.Node;

public class Constant<T> extends Node {

    private final T constant;

    public Constant(T constant) {
        this.constant = constant;
    }

    public T getConstant() {
        return constant;
    }

    @Override
    public Object evaluate() {
        return getConstant();
    }
}
