package binarytree;

import binarytree.model.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MinDepth {
    public int minDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        if (root.left == null && root.right == null){
            return 1;
        }else if (root.left == null){
            return minDepth(root.right) + 1;
        }else if (root.right == null){
            return minDepth(root.left) + 1;
        }
        return Math.min(minDepth(root.left), minDepth(root.right))+1;
    }
}
