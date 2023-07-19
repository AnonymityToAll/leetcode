package binarytree;

import binarytree.model.BinaryTree;

import java.util.Stack;

/**
 * 深度优先搜索
 */
public class DeepFind {
    public void before(BinaryTree head){
        if (head == null){
            return;
        }
        System.out.println(head.val);
        before(head.left);
        before(head.right);
    }

    public void beforeIter(BinaryTree head){
        Stack<BinaryTree> stack = new Stack<>();
        stack.push(head);
        while (!stack.isEmpty()){
            BinaryTree pop = stack.pop();
            System.out.println(pop.val);
            if (pop.right != null){
                stack.push(pop.right);
            }
            if (pop.left != null){
                stack.push(pop.left);
            }
        }
    }

    public void after(BinaryTree head){
        if (head == null){
            return;
        }
        after(head.left);
        after(head.right);
        System.out.println(head.val);
    }

    public void mid(BinaryTree head){
        if (head == null){
            return;
        }
        mid(head.left);
        System.out.println(head.val);
        mid(head.right);
    }
}
