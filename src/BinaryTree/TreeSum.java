package BinaryTree;

import java.util.Stack;

public class TreeSum {

    public int treeSum(TreeNode root){
        int r = 0;
        if(root==null)
            return r;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.empty()){
            TreeNode current=stack.pop();
            r+=current.getValue();
            if(current.getLeft()!=null)stack.push(current.getLeft());
            if(current.getRight()!=null)stack.push(current.getRight());
        }
        return r;
    }
}
