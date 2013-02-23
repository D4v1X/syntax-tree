package tree.nodes.values;

import tree.nodes.Value;

public class Double extends Value {

    private double valuedouble;

    public Double(double valuedouble) {
        this.valuedouble = valuedouble;
    }

    @Override
    public Object evaluate() {
        return valuedouble;
    }
}
