package com.contactsunny.poc.binarytree_implementation_java_poc.binarytree;

public class Node<T> {

    private T data;
    private Node<T> left;
    private Node<T> right;

    public Node() {}

    public Node(T value) { this.data = value; }

    public T getData() {
        return data;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }
}
