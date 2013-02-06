/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodes;

import Nodes.Node;

/**
 *
 * @author davidsantiagobarrera
 */
public class NumberNode extends Node{
    private double Number;

    public NumberNode(Integer Number) {
        this.Number = Number;
    }

    @Override
    public double evaluate() {
        return Number;
    }
    
}
