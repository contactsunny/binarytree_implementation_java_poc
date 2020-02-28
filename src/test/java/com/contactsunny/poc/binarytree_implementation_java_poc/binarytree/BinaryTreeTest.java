package com.contactsunny.poc.binarytree_implementation_java_poc.binarytree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryTreeTest {

    private BinaryTree<Integer> binaryTree;
    private static final String PRE_ORDER_TRAVERSAL_EXPECTED_OUTPUT = "1 2 4 5 3 6 7 ";
    private static final String IN_ORDER_TRAVERSAL_EXPECTED_OUTPUT = "4 2 5 1 6 3 7 ";
    private static final String POST_ORDER_TRAVERSAL_EXPECTED_OUTPUT = "4 5 2 6 7 3 1 ";

    @Before
    public void beforeEach() {
        binaryTree = new BinaryTree<>();

        Node<Integer> rootNode = new Node<>(1);
        binaryTree.setRootNode(rootNode);

        binaryTree.getRootNode().setLeft(new Node<>(2));
        binaryTree.getRootNode().setRight(new Node<>(3));

        binaryTree.getRootNode().getLeft().setLeft(new Node<>(4));
        binaryTree.getRootNode().getLeft().setRight(new Node<>(5));

        binaryTree.getRootNode().getRight().setLeft(new Node<>(6));
        binaryTree.getRootNode().getRight().setRight(new Node<>(7));
    }

    @Test
    public void testTraverseInOrderReturnsExpectedOutput() {
        String actualInOrderTraversalOutput = BinaryTree.traverseInOrder(binaryTree.getRootNode(), null);
        assertEquals(IN_ORDER_TRAVERSAL_EXPECTED_OUTPUT, actualInOrderTraversalOutput);
    }

    @Test
    public void testTraversePreOrderReturnsExpectedOutput() {
        String actualInOrderTraversalOutput = BinaryTree.traversePreOrder(binaryTree.getRootNode(), null);
        assertEquals(PRE_ORDER_TRAVERSAL_EXPECTED_OUTPUT, actualInOrderTraversalOutput);
    }

    @Test
    public void testTraversePostOrderReturnsExpectedOutput() {
        String actualInOrderTraversalOutput = BinaryTree.traversePostOrder(binaryTree.getRootNode(), null);
        assertEquals(POST_ORDER_TRAVERSAL_EXPECTED_OUTPUT, actualInOrderTraversalOutput);
    }
}
