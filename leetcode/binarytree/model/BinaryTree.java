package binarytree.model;


public class BinaryTree {
    public BinaryTree left;
    public BinaryTree right;
    public int val;

    public BinaryTree(int val) {
        this.val = val;
    }

    public static BinaryTree init(){
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
        return tree1;
    }
}


