package tree.nodes.values;

import static org.junit.Assert.*;
import org.junit.Test;

public class IntegerNodeTest {
    
 
    @Test
    public void testEvaluate() {
        System.out.println("IntegerNode: evaluate");
        IntegerNode instance = new IntegerNode(2);
        double expResult = 2;
        double result = instance.evaluate();
        assertEquals(expResult, result, 0.0);
    }
}
