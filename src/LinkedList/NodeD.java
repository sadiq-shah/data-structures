package LinkedList;

public class NodeD {
    Object data;
    NodeD next;
    NodeD prev;

    public NodeD(Object value) {
        this.data = value;
    }

    public NodeD(NodeD prev, Object value, NodeD next) {
        this.data = value;
        this.prev = prev;
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object value) {
        this.data = value;
    }

    public NodeD getNext() {
        return next;
    }

    public void setNext(NodeD next) {
        this.next = next;
    }

    public NodeD getPrev() {
        return prev;
    }

    public void setPrev(NodeD prev) {
        this.prev = prev;
    }

}
