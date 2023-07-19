package binarytree;

import binarytree.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    private List<String> resList = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null){
            return new ArrayList<>();
        }
        recur(root, "");
        return resList;
    }
    private void recur(TreeNode root, String road){
        if (root == null){
            return;
        }
        if (root.left == null && root.right == null){
            resList.add(road);
            road = "";
            return;
        }
        road += root.val;
        recur(root.left, road);
        recur(root.right, road);
    }
}
