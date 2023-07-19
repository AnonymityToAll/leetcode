package binarytree;

import binarytree.model.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaxDepth {
    public int maxDepth1(TreeNode root) {
        if (root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int ans = 0;
        while (!queue.isEmpty()){
            int size = queue.size();
            while (size > 0){
                TreeNode element = queue.poll();
                if (element.left != null){
                    queue.offer(element.left);
                }
                if (element.right != null){
                    queue.offer(element.right);
                }
                size--;
            }
            ans++;
        }
        return ans;
    }
}
