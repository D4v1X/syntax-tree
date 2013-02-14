package tree.nodes;

public class ConstantValueNode extends Node {

    private final double constant;

    public ConstantValueNode(double constant) {
        this.constant = constant;
    }

    @Override
    public double evaluate() {
        return constant;
    }
}
