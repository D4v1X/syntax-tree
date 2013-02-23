/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tree.nodes.unaryoperators;

import org.junit.Test;
import static org.junit.Assert.*;
import tree.nodes.ConstantValue;

/**
 *
 * @author davidsantiagobarrera
 */
public class IncrementNodeTest {

    @Test
    public void testEvaluate() {
        System.out.println("IncrementNode: evaluate");
        ConstantValue uno = new ConstantValue(1.0);
        IncrementNode instance = new IncrementNode(uno);
        double expResult = 2.0;
        double result = instance.evaluate();
        assertEquals(expResult, result, 0.0);
    }
}
