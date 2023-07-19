package binarytree;

import binarytree.model.TreeNode;

public class ReverseTreeNode {
    public TreeNode invertTree(TreeNode root) {
        invertTreeC(root);;
        return root;
    }

    public void invertTreeC(TreeNode root) {
        if (root == null){
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTreeC(root.left);
        invertTreeC(root.right);
    }
}
