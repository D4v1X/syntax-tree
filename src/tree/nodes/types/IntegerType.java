package tree.nodes.types;

import tree.nodes.Type;

public class IntegerType extends Type {

    private final IntegerType integer;

    public IntegerType(IntegerType integer) {
        this.integer = integer;
    }

    @Override
    public Object evaluate() {
        return integer;
    }
}
