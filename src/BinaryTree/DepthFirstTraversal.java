package BinaryTree;

import java.util.*;

public class DepthFirstTraversal {


    public static List<Integer> depthFirstTraversalIterativelly(TreeNode root) {
        List<Integer> r = new ArrayList<>();
        if(root==null)
            return r;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.empty()){
            TreeNode current = stack.pop();
            r.add(current.getValue());
            if(current.getLeft()!=null)stack.push(current.getLeft());
            if(current.getRight()!=null)stack.push(current.getRight());
        }
        return r;
    }

    public static List<Integer> depthFirstTraversalRecursive(TreeNode root) {
        List<Integer> r = new ArrayList<>();
        if(root==null)
            return r;
        r.add(root.getValue());
        r.addAll(depthFirstTraversalRecursive(root.getLeft()));
        r.addAll(depthFirstTraversalRecursive(root.getRight()));
        return r;
    }


}
