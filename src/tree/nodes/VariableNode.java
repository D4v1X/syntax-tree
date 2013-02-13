/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tree.nodes;

/**
 *
 * @author davidsantiagobarrera
 */
public class VariableNode extends Node {

    private double variable;

    public VariableNode(double variable) {
        this.variable = variable;
    }

    @Override
    public double evaluate() {
        return variable;
    }

    public double getVariable() {
        return variable;
    }

    public void setVariable(double variable) {
        this.variable = variable;
    }
}
