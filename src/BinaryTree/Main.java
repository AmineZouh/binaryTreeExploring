package BinaryTree;

public class Main {
    public static void main(String args[]){
        int[] treeArray = {8, 6, 5, 7, 11, 12, 13, 10, 9};
        BreadthFirstTraversal breadthFirstTraversal = new BreadthFirstTraversal();
        DepthFirstTraversal depthFirstTraversal = new DepthFirstTraversal();
        FoundTarget foundTarget = new FoundTarget();
        TreeSum treeSum = new TreeSum();
        MaxSumPath maxSumPath = new MaxSumPath();
        BinaryTree tree = new BinaryTree();
        for(int node:treeArray){
            tree.insert(node);
        }
//        System.out.println("the iterative result is : "+depthFirstTraversal.depthFirstTraversalItertivelly(tree.getRoot()));
 //       System.out.println("the recursive result is : "+depthFirstTraversal.depthFirstTraversalRecursive(tree.getRoot()));
//        System.out.println("the iterative version of breadFirstTraversal result is : "+breadthFirstTraversal.breadFirstTraversalFunc(tree.getRoot()));
 //       System.out.println("the result of found target is : "+foundTarget.isPresentBreadthFirstTraversal(tree.getRoot(), 133));
//        System.out.println("the result of found target is : "+foundTarget.isPresentDepthFirstTraversal(tree.getRoot(), 13));
//        System.out.println("the result of tree sum is : "+treeSum.treeSum(tree.getRoot()));
        System.out.println("the result of max sum path is : "+maxSumPath.maxSumPath(tree.getRoot()));
    }
}
