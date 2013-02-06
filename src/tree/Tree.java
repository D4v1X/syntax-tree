/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

import Nodes.Node;

/**
 *
 * @author davidsantiagobarrera
 */
public class Tree {
    private Node root;

    public Tree() {
        this.root = null;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
    
    public double run(){
        return root.evaluate();
    }
}
