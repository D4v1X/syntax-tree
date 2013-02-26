package evaluator.calculators;

import evaluator.nodes.Operator;
import evaluator.Type;

public abstract class Calculator {
     public abstract Type calculate (Operator operation, Type p0, Type p1);
}
