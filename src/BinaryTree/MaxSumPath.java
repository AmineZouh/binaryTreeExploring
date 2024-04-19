package BinaryTree;

public class MaxSumPath {

    public int maxSumPath(TreeNode root){
        int max = 0;
        if(root==null)
            return max;
        max+= root.getValue();
        return max+Math.max(maxSumPath(root.getLeft()), maxSumPath(root.getRight()));
    }

}
