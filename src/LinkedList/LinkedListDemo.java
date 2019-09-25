package LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast(3);
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(4);
        list.addFirst(7);
        list.remove(list.getSize() - 1);
        Object a = list.get(2);
        System.out.println(a.toString());
        list.display();

        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.reverseDisplay();
        list1.addLast(2);
        list1.addLast(3);
        list1.addLast(4);
        list1.addLast(5);
        list1.reverseDisplay();
    }

}
