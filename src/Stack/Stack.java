package Stack;

import LinkedList.Node;

public class Stack {
    Node top;
    private static int counter;

    public Stack() {

    }
    public void push(Object value){
        Node newNode = new Node(value);
        if(top == null) {
            top = newNode;
        }
        else {
            newNode.setNext(top);
            top = newNode;
        }
        incrementCounter();
        return;
    }

    public Object pop(){
        if(this.isEmpty()) {
            return null;
        }
        Node temp = top;
        top = top.getNext();
        decrementCounter();
        return temp.getData();
    }

    public boolean isEmpty(){
        if(top == null) {
            return true;
        }
        else {
            return false;
        }
    }

    public int getSize() {
        return this.getCounter();
    }

    private int getCounter() {
        return counter;
    }

    public Object peek() {
        if(this.isEmpty()) {
            return null;
        }
        else {
            return top.getData();
        }
    }


    private void incrementCounter() {
        counter++;
        return;
    }

    private void decrementCounter() {
        counter--;
        return;
    }
}
