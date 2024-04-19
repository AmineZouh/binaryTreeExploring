package BinaryTree;

public class BinaryTree {

    TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    public BinaryTree(TreeNode node) {
        this.root = node;
    }

    public TreeNode getRoot() {
        return this.root;
    }

    public void insert(int v) {
        root = insertRec(root, v);
    }

    public TreeNode insertRec(TreeNode current, int value) {
        if (current == null) {
            return new TreeNode(value);
        }
        if (value < current.getValue()) {
            current.setLeft(insertRec(current.getLeft(), value));
        } else {
            current.setRight(insertRec(current.getRight(), value));
        }
        return current;
    }
}