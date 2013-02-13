package tree.nodes;

public class ConstantNode extends Node {

    private final double constant;

    public ConstantNode(Integer constant) {
        this.constant = constant;
    }

    @Override
    public double evaluate() {
        return constant;
    }
}
