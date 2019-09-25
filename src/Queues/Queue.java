package Queues;

import LinkedList.Node;

public class Queue {
    private Node front,rear;
    private static int counter;

    public void enqueue(Object value) {
        Node newNode = new Node(value);
        if(front == null) {
            front = rear = newNode;
        }
        else {
            rear.setNext(newNode);
            rear = newNode;
        }
        incrementCounter();
        return;
    }

    public Object peek() {
        if(this.isQueueEmpty()) {
            return null;
        }
        else {
            return front.getData();
        }
    }


    public Object dequeue() {
        if(this.isQueueEmpty()) {
            return null;
        }
        else {
            Node temp = front;
            if(front == rear) {
                rear = front.getNext();
            }
            front = front.getNext();
            decrementCounter();
            return temp.getData();
        }
    }

    public boolean isQueueEmpty() {
        if(front == null) {
            return true;
        }
        else {
            return false;
        }
    }

    public int getSize() {
        return getCounter();
    }

    private static void incrementCounter(){
        counter++;
        return;
    }

    private static void decrementCounter() {
        counter--;
        return;
    }
    private static int getCounter() {
        return counter;
    }

}
