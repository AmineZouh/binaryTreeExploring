package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class FoundTarget {

    public boolean isPresentBreadthFirstTraversal(TreeNode root, int target){
        if(root.getValue()==target)
            return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode current = queue.poll();
            if(current.getValue()==target)
                return true;
            if(current.getLeft()!=null) queue.add(current.getLeft());
            if(current.getRight()!=null) queue.add(current.getRight());
        }
        return false;
    }

    public boolean isPresentDepthFirstTraversal(TreeNode root, int target){
        if(root==null)
            return false;
        if(root.getValue()==target)
            return true;
        return isPresentDepthFirstTraversal(root.getLeft(), target) || isPresentDepthFirstTraversal(root.getRight(), target);
    }
}
