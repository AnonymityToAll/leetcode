package binarytree;

import binarytree.model.TreeNode;

public class IsSyme {
    public boolean isSymmetric(TreeNode root) {
        if (root == null){
            return true;
        }
        return isSym(root.left, root.right);
    }

    public boolean isSym(TreeNode left, TreeNode right){
        if (left == null && right == null){
            return true;
        }
        if (left == null || right == null){
            return false;
        }
        if (left.val != right.val){
            return false;
        }
        return isSym(left.left, right.right) && isSym(left.right, right.left);
    }
}
