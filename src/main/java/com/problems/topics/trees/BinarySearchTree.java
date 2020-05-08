package com.problems.topics.trees;

public class BinarySearchTree
{
	public static void main(String[] args)
	{
		BinarySearchTree binaryTree = new BinarySearchTree();

	}

	TreeNode root;

	public BinarySearchTree()
	{
		root = null;
	}

	public BinarySearchTree(int data)
	{
		root = new TreeNode(data, null, null);
	}

	// 43, 10, 79, 90, 12, 54, 11, 9, 50
	// Insert 43 into the tree as the root of the tree.
	// Read the next element, if it is lesser than the root node element, insert it as the root of the left sub-tree.
	// Otherwise, insert it as the root of the right of the right sub-tree.
	public void insert(int data)
	{

	}

	// left -> root -> right
	public void inOrderTraverse(TreeNode node)
	{
		if(node == null)
		{// base case no more nodes to traverse
			return;
		}
		inOrderTraverse(node.getLeft());
		System.out.print(node.getData() + " -> ");
		inOrderTraverse(node.getRight());
	}

}
