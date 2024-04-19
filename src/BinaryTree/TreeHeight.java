package BinaryTree;

import java.util.Scanner;

public class TreeHeight {

        public static int getHeight(int[] array){
            if(array.length==1)
                return 0;
            BinaryTree tree = new BinaryTree();
            for(int i:array){
                tree.insert(i);
            }
            return getHeight(tree.getRoot());
        }

        public static int getHeight(TreeNode bt){
            if(bt.getLeft()==null && bt.getRight()==null)
                return 0;
            else if(bt.getLeft()==null && bt.getRight()!=null)
                return 1+getHeight(bt.getRight());
            else if(bt.getLeft()!=null && bt.getRight()==null)
                return 1+getHeight(bt.getLeft());
            return 1+Math.max(getHeight(bt.getLeft()), getHeight(bt.getRight()));
        }

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            scanner.nextLine();
            int[] treeArray = new int[n];
            for(int i=0; i<n; i++){
                treeArray[i] = scanner.nextInt();
            }
            int r = getHeight(treeArray);
            System.out.println(r);
        }
}
