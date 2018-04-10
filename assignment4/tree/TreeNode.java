package com.iit.edu.assignment4.tree;

public class TreeNode {
	TreeNode left;
    TreeNode right;
    int data;
	public TreeNode(TreeNode left, TreeNode right, int data) {
		super();
		this.left = left;
		this.right = right;
		this.data = data;
	}
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	public TreeNode getRight() {
		return right;
	}
	public void setRight(TreeNode right) {
		this.right = right;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
	
}
