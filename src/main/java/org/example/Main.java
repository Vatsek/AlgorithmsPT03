package org.example;

public class Main {
    public static void main(String[] args) {

        DoubleList doubleList = new DoubleList();
        doubleList.addFirst(4);
        doubleList.addFirst(3);
        doubleList.addFirst(2);
        doubleList.addFirst(1);
        doubleList.printList();
        doubleList.reverse();
        doubleList.printList();

        System.out.println();

        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.addLast(5);
        linkedList.addLast(6);
        linkedList.addLast(7);
        linkedList.printList();
        System.out.println("linkedList.getValueFromTail(3) = " + linkedList.getValueFromTail(3));
    }
}