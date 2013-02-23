package tree.nodes.values;

public class IntegerNode extends ValueNode {

    private final Integer integer;

    public IntegerNode(Integer integer) {
        this.integer = integer;
    }

    @Override
    public Object evaluate() {
        return integer;
    }
}
