package tree;

public class Tree {

    private Node root;

    public Tree() {
        this.root = null;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Object run() {
        return root.evaluate();
    }
}
