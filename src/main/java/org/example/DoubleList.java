package org.example;

public class DoubleList {
    Node head;
    Node tail;

    public class Node {
        int value;
        Node next;
        Node previous;

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }

    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public void addFirst(int value) {
        Node node = new Node();
        node.value = value;

        if (head == null) {
            head = node;
            tail = node;
        } else {
            head.previous = node;
            node.next = head;
            head = node;
        }
    }

    public void remove() {
        if (head != null && head.next != null) {
            head = head.next;
            head.previous = null;
        } else {
            head = null;
            tail = null;
        }
    }

    /**
     * @param value предаваемое значение
     * @return
     * @apiNote проверка, есть ли элемент
     */
    public boolean contains(int value) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == value) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public void addLast(int value) {
        Node node = new Node();
        node.value = value;
        if (tail != null) {
            tail.next = node;
            node.previous = tail;
            tail = node;
        } else {
            tail = node;
            head = node;
        }
    }

    public void removeLast() {
        if (tail != null && tail.previous != null) {
            tail.previous.next = null;
            tail = tail.previous;
        } else {
            head = null;
            tail = null;
        }
    }

//    public void reverse() {
//        Node currentNode = head;
//        while (currentNode != null) {
//            Node next = currentNode.next;
//            Node previous = currentNode.previous;
//            currentNode.next = previous;
//            currentNode.previous = next;
//            currentNode = next;
//            if (previous == null) {
//                tail = currentNode;
//            }
//            if (next == null) {
//                head = currentNode;
//            }
//            currentNode = next;
//
//        }
//    }
    public void reverse() {
        Node node = head;

        Node tmp = head;
        head = tail;
        tail = tmp;

        while (node.next != null) {
            tmp = node.next;
            node.next = node.previous;
            node.previous = tmp;
            node = node.previous;
        }


    }
}