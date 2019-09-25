package LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(3);
        list.addLast(4);
        list.remove(-1);
        System.out.println(list.getSize());
        list.display();
    }

}
