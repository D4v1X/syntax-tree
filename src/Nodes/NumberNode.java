package Nodes;

public class NumberNode extends Node {

    private final double Number;

    public NumberNode(Integer Number) {
        this.Number = Number;
    }

    @Override
    public double evaluate() {
        return Number;
    }
}
