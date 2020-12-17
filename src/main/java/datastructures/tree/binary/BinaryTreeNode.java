package datastructures.tree.binary;

public class BinaryTreeNode<T> {

    private T data;
    private BinaryTreeNode<T> parent;
    private BinaryTreeNode<T> leftChild;
    private BinaryTreeNode<T> rightChild;

    public BinaryTreeNode(T data, BinaryTreeNode<T> parent) {
        this.data = data;
        this.parent = parent;
        this.leftChild = null;
        this.rightChild = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BinaryTreeNode<T> getParent() {
        return parent;
    }

    public void setParent(BinaryTreeNode<T> parent) {
        this.parent = parent;
    }

    public BinaryTreeNode<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BinaryTreeNode<T> leftChild) {
        this.leftChild = leftChild;
    }

    public BinaryTreeNode<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(BinaryTreeNode<T> rightChild) {
        this.rightChild = rightChild;
    }
}