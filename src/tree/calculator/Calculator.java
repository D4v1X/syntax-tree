package tree.calculator;

import tree.nodes.Operation;
import tree.nodes.Type;

public abstract class Calculator {
     public abstract Type calculate (Operation operation, Type p0, Type p1);
}
