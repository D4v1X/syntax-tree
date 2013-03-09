package evaluator.nodes;

import evaluator.Type;
import evaluator.types.String;

public class ConstantName extends Constant {

    private String name;

    public ConstantName(Type value) {
        super(value);
    }

    public ConstantName(java.lang.String name, Type value) {
        super(value);
        this.name = new String(name);
    }

    @Override
    public Type getValue() {
        return name;
    }
}
