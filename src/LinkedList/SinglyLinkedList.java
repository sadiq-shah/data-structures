package LinkedList;

public class SinglyLinkedList {
    private static int counter;
    private Node head;

    public SinglyLinkedList() {

    }

    public void addLast(Object value) {
        Node newNode = new Node(value);

        if(head == null) {
            head = newNode;
            incrementCounter();
            return;
        }

        Node current = head;
        while(current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(newNode);
        incrementCounter();
        return;
    }

    public void addFirst(Object value) {
        Node newNode = new Node(value,head);
        head = newNode;
        incrementCounter();
        return;
    }

    public Object get(int index) {
        Node temp = head;
        if(index < 0) {
            return null;
        }
        for(int i=0;i<counter && temp != null;++i) {
            if(i == index) {
                break;
            }
            temp = temp.getNext();
        }
        return temp.getData();
    }

    public boolean remove(int index) {
        Node temp = head;
        Node prev = null;
        if(index < 0) {
            return false;
        }
        for(int i=0;i<counter && temp != null;++i) {
            if( i == index) {
                break;
            }
            prev = temp;
            temp = temp.getNext();
        }
        if(temp == null) {
            return false;
        }
        prev.setNext(temp.getNext());
        decrementCounter();
        return true;
    }

    private static int getCounter() {
        return counter;
    }

    private static void incrementCounter() {
        counter++;
    }

    private static void decrementCounter() {
        counter--;
    }

    public int getSize() {
        return getCounter();
    }

    public void display() {
        Node temp = head;
        if(head == null) {
            System.out.println("The list is empty.");
        }

        while(temp != null) {
            System.out.println(temp.getData().toString());
            temp = temp.getNext();
        }
        return;
    }


    public void reverseDisplay() {
         reverseNodeDisplay(head);
         return;
    }

    private void reverseNodeDisplay(Node temp) {
        if(temp != null) {
            reverseNodeDisplay(temp.getNext());
            System.out.println(temp.getData().toString());
        }
        return;
    }

    public Object search(Object k) {
        Node temp = head;
        while(temp != null) {
            if(temp.getData() == k) {
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }

    public void getMiddleNode() {
        Node oneStep = head;
        Node twoStep = head;
        boolean isOdd = false;
        while(twoStep != null) {
            if(twoStep.getNext() != null) {
                twoStep = twoStep.getNext().getNext();
            }
            else {
                isOdd = true;
                break;
            }
            if(twoStep != null) {
                oneStep = oneStep.getNext();
            }

        }
        if(isOdd) {
            System.out.println(oneStep.getData().toString());
        }
        else {
            System.out.println(oneStep.getData().toString());
            System.out.println(oneStep.getNext().getData().toString());
        }

    }
}
