package tree.nodes.values;

import tree.nodes.Value;

public class Integer extends Value {

    private final Integer integer;

    public Integer(Integer integer) {
        this.integer = integer;
    }

    @Override
    public Object evaluate() {
        return integer;
    }
}
