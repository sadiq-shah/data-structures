package Trees;

public class Node {
    Object data;
    Node left;
    Node right;

    public Node(Object data) {
        this.data = data;
        return;
    }

    public Node(Node left, Object data, Node right) {
        this.data = data;
        this.left = left;
        this. right = right;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
