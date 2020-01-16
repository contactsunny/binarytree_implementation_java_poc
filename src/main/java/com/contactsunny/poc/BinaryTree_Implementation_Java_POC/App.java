package com.contactsunny.poc.BinaryTree_Implementation_Java_POC;

import com.contactsunny.poc.BinaryTree_Implementation_Java_POC.binaryTree.BinaryTree;
import com.contactsunny.poc.BinaryTree_Implementation_Java_POC.binaryTree.Node;

public class App {

    public static void main(String[] args) {

        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        Node<Integer> rootNode = new Node<>(1);
        binaryTree.setRootNode(rootNode);

        binaryTree.getRootNode().setLeft(new Node<>(2));
        binaryTree.getRootNode().setRight(new Node<>(3));

        binaryTree.getRootNode().getLeft().setLeft(new Node<>(4));
        binaryTree.getRootNode().getLeft().setRight(new Node<>(5));

        binaryTree.getRootNode().getRight().setLeft(new Node<>(6));
        binaryTree.getRootNode().getRight().setRight(new Node<>(7));

        System.out.println("Pre order traversing:");
        BinaryTree.traversePreOrder(binaryTree.getRootNode());
        System.out.println();

        System.out.println("In order traversing:");
        BinaryTree.traverseInOrder(binaryTree.getRootNode());
        System.out.println();

        System.out.println("Post order traversing:");
        BinaryTree.traversePostOrder(binaryTree.getRootNode());
        System.out.println();
    }
}
