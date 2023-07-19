package prac;

import binarytree.DeepFind;
import binarytree.model.BinaryTree;

public class TestDeepFind {
    public static void main(String[] args) {
        BinaryTree tree1 = new BinaryTree(5);
        BinaryTree tree2 = new BinaryTree(4);
        BinaryTree tree3 = new BinaryTree(6);
        BinaryTree tree4 = new BinaryTree(1);
        BinaryTree tree5 = new BinaryTree(2);
        BinaryTree tree6 = new BinaryTree(7);
        BinaryTree tree7 = new BinaryTree(8);

        tree1.left = tree2;
        tree1.right = tree3;

        tree2.left = tree4;
        tree2.right = tree5;

        tree3.left = tree6;
        tree3.right = tree7;

        DeepFind deepFind = new DeepFind();
        System.out.println("before======");
        deepFind.before(tree1);
        System.out.println("beforeIter======");
        deepFind.beforeIter(tree1);
//        System.out.println("after======");
//        deepFind.after(tree1);
//        System.out.println("mid======");
//        deepFind.mid(tree1);
    }
}
