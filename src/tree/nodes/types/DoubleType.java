package tree.nodes.types;

import tree.nodes.Type;

public class DoubleType extends Type {

    private double valuedouble;

    public DoubleType(double valuedouble) {
        this.valuedouble = valuedouble;
    }

    @Override
    public Object evaluate() {
        return valuedouble;
    }
}
