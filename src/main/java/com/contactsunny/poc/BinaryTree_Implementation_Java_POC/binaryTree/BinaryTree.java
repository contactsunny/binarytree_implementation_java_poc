package com.contactsunny.poc.BinaryTree_Implementation_Java_POC.binaryTree;

public class BinaryTree<T> {
    
    private Node<T> rootNode;

    public Node<T> getRootNode() {
        return rootNode;
    }

    public void setRootNode(Node<T> rootNode) {
        this.rootNode = rootNode;
    }
    
    public static void traverseInOrder(Node node) {

        if (node.getLeft() != null) {
            traverseInOrder(node.getLeft());
        }

        System.out.print(node.getData() + " ");

        if (node.getRight() != null) {
            traverseInOrder(node.getRight());
        }
    }

    public static void traversePreOrder(Node node) {

        System.out.print(node.getData() + " ");

        if (node.getLeft() != null) {
            traversePreOrder(node.getLeft());
        }

        if (node.getRight() != null) {
            traversePreOrder(node.getRight());
        }
    }

    public static void traversePostOrder(Node node) {

        if (node.getLeft() != null) {
            traversePostOrder(node.getLeft());
        }

        if (node.getRight() != null) {
            traversePostOrder(node.getRight());
        }

        System.out.print(node.getData() + " ");
    }
}
