package evaluator.calculators;

import evaluator.Type;
import evaluator.nodes.Operator;

public abstract class Calculator {
     public abstract Type calculate (Operator operation, Type p0, Type p1);
}
