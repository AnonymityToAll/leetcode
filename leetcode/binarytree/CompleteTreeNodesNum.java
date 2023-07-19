package binarytree;

import binarytree.model.TreeNode;

public class CompleteTreeNodesNum {
    private int count = 0;
    public int countNodes1(TreeNode root) {
        recurAllNode(root);
        return count;
    }

    public void recurAllNode(TreeNode root){
        if (root == null){
            return;
        }
        count++;
        recurAllNode(root.right);
        recurAllNode(root.left);
    }

    public int countNodes2(TreeNode root) {
        return countNode(root);
    }

    public int countNode(TreeNode root){
        if (root == null){
            return 0;
        }
        TreeNode left = root;
        int leftLen = 0;
        while (left != null){
            left = left.left;
            leftLen++;
        }
        TreeNode right = root;
        int rightLen = 0;
        while (right != null){
            right = right.right;
            rightLen++;
        }
        if (leftLen == rightLen){
            return (int)Math.pow(2, leftLen)-1;
        }
        return countNode(root.left) + countNode(right.right) + 1;

    }

    public int countNodes(TreeNode root) {
        if (root == null){
            return 0;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}
