package evaluator.nodes;

import evaluator.symbols.Precedencia;
import evaluator.symbols.Symbol;

public class Operator extends Symbol {

    public static final Operator add = new Operator("add", '+', OperatorType.BINARY, Precedencia.sum);
    public static final Operator subtract = new Operator("subtract", '-', OperatorType.BINARY, Precedencia.subtraction);
    public static final Operator mul = new Operator("mul", '*', OperatorType.BINARY, Precedencia.multiplication);
    
    private String name;
    private final char operator;
    private final OperatorType operatorType;

    public Operator(char operator, OperatorType operatorType, Precedencia precedencia) {
        super(precedencia);
        this.operator = operator;
        this.operatorType = operatorType;
    }

    public Operator(String name, char operator, OperatorType operatorType, Precedencia precedencia) {
        this(operator, operatorType, precedencia);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getOperator() {
        return Character.toString(operator);
    }

    public OperatorType getoperatorType() {
        return operatorType;
    }
}
