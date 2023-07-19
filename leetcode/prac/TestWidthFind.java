package prac;

import binarytree.WidthFind;
import binarytree.model.BinaryTree;

public class TestWidthFind {
    public static void main(String[] args) {
        WidthFind widthFind = new WidthFind();
        widthFind.widthFind(BinaryTree.init());
    }
}
