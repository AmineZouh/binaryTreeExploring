package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LowestCommunAncestor {

    public static int lowestCommunAncestor(int[] treeArray, int v1, int v2){
        BinaryTree tree = new BinaryTree();
        for(int i: treeArray){
            tree.insert(i);
        }
        List<Integer> v1Ancestores = getNodeAncestors(tree, v1);
        List<Integer> v2Ancestores = getNodeAncestors(tree, v2);
//        System.out.println("v1 : "+v1+" Ancestores size is : "+v1Ancestores);
//        System.out.println("v2 : "+v2+" Ancestores size is : "+v2Ancestores);
        if(v1Ancestores.contains(v2))
            return v2;
        if(v2Ancestores.contains(v1))
            return v1;
        int v1AncestoresListSize = v1Ancestores.size();
        int v2AncestoresListSize = v2Ancestores.size();
        if(v1AncestoresListSize==v2AncestoresListSize)
            return v1Ancestores.get(v1Ancestores.size()-2);
        else if(v1AncestoresListSize<v2AncestoresListSize){
            int ind = 0;
            while(ind<v1AncestoresListSize && v1Ancestores.get(ind)==v2Ancestores.get(ind))
                ind++;
            return v1Ancestores.get(ind-1);
        }
        int ind = 0;
        while(ind<v2AncestoresListSize && v2Ancestores.get(ind)==v1Ancestores.get(ind))
            ind++;
        return v2Ancestores.get(ind-1);
    }

    static List<Integer> getNodeAncestors(BinaryTree tree, int v){
        List<Integer> r = new ArrayList<>();
        if(tree.getRoot()==null || tree.getRoot().getValue()==v){
            return r;
        }
        int rootValue = tree.getRoot().getValue();
        r.add(rootValue);
        if(v<rootValue){
            BinaryTree leftTree = new BinaryTree(tree.getRoot().getLeft());
            r.addAll(getNodeAncestors(leftTree, v));
        }
        else if(v>rootValue){
            BinaryTree rightTree = new BinaryTree(tree.getRoot().getRight());
            r.addAll(getNodeAncestors(rightTree, v));
        }
        return r;
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
        scanner.nextLine();
        int v1 = scanner.nextInt();
        int v2 = scanner.nextInt();
        int r = lowestCommunAncestor(treeArray, v1, v2);
        System.out.println("the result of lowest commun ancestor is : "+r);
    }
}
