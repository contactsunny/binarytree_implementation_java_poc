package com.contactsunny.poc.binarytree_implementation_java_poc.binarytree;

public class BinaryTree<T> {
    
    private Node<T> rootNode;

    public Node<T> getRootNode() {
        return rootNode;
    }

    public void setRootNode(Node<T> rootNode) {
        this.rootNode = rootNode;
    }
    
    public static String traverseInOrder(Node node, StringBuilder stringBuilder) {

        if (stringBuilder == null) {
            stringBuilder = new StringBuilder();
        }

        if (node.getLeft() != null) {
            traverseInOrder(node.getLeft(), stringBuilder);
        }

        stringBuilder.append(node.getData()).append(" ");

        if (node.getRight() != null) {
            traverseInOrder(node.getRight(), stringBuilder);
        }

        return stringBuilder.toString();
    }

    public static String traversePreOrder(Node node, StringBuilder stringBuilder) {

        if (stringBuilder == null) {
            stringBuilder = new StringBuilder();
        }

        stringBuilder.append(node.getData()).append(" ");

        if (node.getLeft() != null) {
            traversePreOrder(node.getLeft(), stringBuilder);
        }

        if (node.getRight() != null) {
            traversePreOrder(node.getRight(), stringBuilder);
        }

        return stringBuilder.toString();
    }

    public static String traversePostOrder(Node node, StringBuilder stringBuilder) {

        if (stringBuilder == null) {
            stringBuilder = new StringBuilder();
        }

        if (node.getLeft() != null) {
            traversePostOrder(node.getLeft(), stringBuilder);
        }

        if (node.getRight() != null) {
            traversePostOrder(node.getRight(), stringBuilder);
        }

        stringBuilder.append(node.getData()).append(" ");

        return stringBuilder.toString();
    }
}
