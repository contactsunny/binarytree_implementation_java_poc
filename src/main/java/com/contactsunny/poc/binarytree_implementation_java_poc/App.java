package com.contactsunny.poc.binarytree_implementation_java_poc;

import com.contactsunny.poc.binarytree_implementation_java_poc.binarytree.BinaryTree;
import com.contactsunny.poc.binarytree_implementation_java_poc.binarytree.Node;

import java.util.logging.Logger;

public class App {
    
    private static final Logger logger = Logger.getLogger(String.valueOf(App.class));

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

        logger.info("Pre order traversing:");
        String preOrderTraversingOutput = BinaryTree.traversePreOrder(binaryTree.getRootNode(), null);
        logger.info(preOrderTraversingOutput);

        logger.info("In order traversing:");
        String inOrderTraversingOutput = BinaryTree.traverseInOrder(binaryTree.getRootNode(), null);
        logger.info(inOrderTraversingOutput);

        logger.info("Post order traversing:");
        String postOrderTraversingOutput = BinaryTree.traversePostOrder(binaryTree.getRootNode(), null);
        logger.info(postOrderTraversingOutput);
    }
}
