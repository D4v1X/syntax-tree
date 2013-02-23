package tree.nodes;

class VariableValueNode extends Node {

    private double variable;

    public VariableValueNode(double variable) {
        this.variable = variable;
    }

    @Override
    public Object evaluate() {
        return variable;
    }

    public void setVariable(double variable) {
        this.variable = variable;
    }
}
