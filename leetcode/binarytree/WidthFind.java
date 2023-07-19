package binarytree;

import binarytree.model.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class WidthFind {
    public void widthFind(BinaryTree head){
        Queue<BinaryTree> queue = new LinkedList<>();
        queue.add(head);
        while (!queue.isEmpty()){
            BinaryTree tree = queue.poll();
            System.out.println(tree.val);
            if (tree.left != null){
                queue.add(tree.left);
            }
            if (tree.right != null){
                queue.add(tree.right);
            }
        }
    }
}
