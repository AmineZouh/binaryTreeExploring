package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
// there is no recursive version of breadthFirstTraversal, as recursion require a stack behind the hood
public class BreadthFirstTraversal {

    public List<Integer> breadFirstTraversalFunc(TreeNode node){
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> r = new ArrayList<>();
        if(node==null)
            return r;
        queue.add(node);
        while(!queue.isEmpty()){
            TreeNode current = queue.poll();
            r.add(current.getValue());
            if(current.getLeft()!=null) queue.add(current.getLeft());
            if(current.getRight()!=null) queue.add(current.getRight());
        }
        return r;
    }
}
