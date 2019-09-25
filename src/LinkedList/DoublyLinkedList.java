package LinkedList;

public class DoublyLinkedList {
    private NodeD head;
    private NodeD tail;

    private static int counter;

    public DoublyLinkedList() {

    }

    public void addFirst(Object value) {
        NodeD newNode = new NodeD(null,value,head);
        if(head != null) {
            head.setPrev(newNode);
        }

        head = newNode;

        if(tail == null) {
            tail = head;
        }
        incrementCounter();
        return;
    }

    public void addLast(Object value) {
        NodeD newNode = new NodeD(tail,value,null);
        if(tail != null) {
            tail.setNext(newNode);
        }

        tail = newNode;
        if(head == null) {
            head = tail;
        }
        incrementCounter();
        return;
    }

    public Object get(int index) {
        NodeD temp = head;
        for(int i=0;i<counter && temp != null; ++i, temp=temp.getNext())
        {
            if(i == index) {
                break;
            }
        }
        if(temp != null) {
            return temp.getData();
        }
        else{
            return null;
        }
    }

    public boolean remove(int index) {
        NodeD temp = head;

        for(int i=0;i<counter && temp != null;i++) {
            if(i == index) {
                break;
            }
            temp = temp.getNext();
        }

        if(temp == null) {
            return false;
        }

        NodeD prev = temp.getPrev();
        NodeD next = temp.getNext();
        if(temp == head){
          head = next;
        }
        if(temp == null) {
            tail = prev;
        }

        if(prev != null) {
            prev.setNext(next);
        }
        if(next != null) {
            next.setPrev(prev);
        }


        decrementCounter();
        return true;
    }

    private void incrementCounter() {
        counter++;
    }

    private void decrementCounter() {
        counter--;
    }

    private static int getCounter() {
        return counter;
    }

    public int getSize() {
        return getCounter();
    }

    public void display() {
        NodeD temp = head;

        while(temp != null) {
            System.out.println(temp.getData().toString());
            temp = temp.getNext();
        }

        return;
    }

}
