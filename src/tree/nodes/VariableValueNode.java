/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tree.nodes;

/**
 *
 * @author davidsantiagobarrera
 */
public class VariableValueNode extends Node {

    private double variable;

    public VariableValueNode(double variable) {
        this.variable = variable;
    }

    @Override
    public double evaluate() {
        return variable;
    }

    public void setVariable(double variable) {
        this.variable = variable;
    }
}
