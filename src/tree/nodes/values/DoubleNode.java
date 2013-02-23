package tree.nodes.values;

public class DoubleNode extends ValueNode {

    private double valuedouble;

    public DoubleNode(double valuedouble) {
        this.valuedouble = valuedouble;
    }

    @Override
    public double evaluate() {
        return valuedouble;
    }
}
