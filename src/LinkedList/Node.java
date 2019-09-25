package LinkedList;

public class Node {
    Object data;
    Node next;

    public Node(Object dataValue) {
        data =dataValue;
        next = null;
    }

    public Node(Object dataValue, Node nextValue) {
        data = dataValue;
        next = nextValue;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
