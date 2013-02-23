package tree.nodes;

import tree.Node;

public class ConstantValue<T> extends Node {

    private final T constant;

    public ConstantValue(T constant) {
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
