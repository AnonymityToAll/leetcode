package binarytree;

import binarytree.model.TreeNode;

public class Balance {
    public boolean isBalanced1(TreeNode root) {
        if (root == null){
            return true;
        }
        return Math.abs(height(root.left)-height(root.right)) <= 1
                && isBalanced(root.left) && isBalanced(root.right);
    }

    public int height(TreeNode root){
        if (root == null){
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public boolean isBalanced(TreeNode root) {
        return heightRecur(root) != -1;
    }

    public int heightRecur(TreeNode root){
        if (root == null){
            return 0;
        }
        int leftH = heightRecur(root.left);
        if (leftH == -1){
            return -1;
        }
        int rightH = heightRecur(root.right);
        if (rightH == -1){
            return -1;
        }
        return Math.abs(leftH - rightH)<2 ? Math.max(leftH, rightH) + 1: -1;
    }
}
