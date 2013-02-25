package tree.nodes.types;

import tree.nodes.Type;

public class Integer extends Type {

    private final Integer integer;

    public Integer(Integer integer) {
        this.integer = integer;
    }

    @Override
    public Object evaluate() {
        return integer;
    }
}
