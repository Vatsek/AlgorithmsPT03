package org.example;

public class LinkedList {
    Node head;

    public class Node {
        int value;
        Node next;

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next" + next +
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

    /**
     * apiNote добавление элемента в начало
     * @param value значение node
     */
    public void addFirst(int value){
        Node newNode = new Node();
        newNode.value = value;
        if (head == null){
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;

        }
    }

    /**
     * apiNote Удаление первого элемента
     */
    public void remove(){
        if (head != null){
            head = head.next;
        }
    }

    /**
     * apiNote Проверка вхождения числа
     * @param value искомое число
     * @return boolean
     */
    public boolean contains(int value) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.value ==  value) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    /**
     * apiNote добавление элемента в конец
     * @param value добавляемое значение
     */
    public void addLast(int value) {

        Node node = new Node();
        node.value = value;
        if (head == null) {
            head = node;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = node;
        }
    }

    /**
     * apiNote удаление последнего элемента
     */
    public void removeLast() {
        if (head != null){
            Node currentNode = head;
            if (currentNode.next == null){
                head = null;
            }
            while (currentNode.next != null) {
                if (currentNode.next.next == null) {
                    // currentNode.next = null;
                    currentNode.next = null;
                    return;
                }
                currentNode = currentNode.next;
            }
        }
    }

    /**
     * apiNote реверс списка
     */
    public void revert() {
        if (head != null && head.next != null) {
            Node tmp = head;
            revert(head.next, head);
            tmp.next = null;
        }
    }
    private void revert(Node currentNode, Node previousNode) {
        if (currentNode.next == null) {
            head = currentNode;
        } else {
            revert(currentNode.next, currentNode);
        }
        currentNode.next = previousNode;
    }

    /**
     * apiNote выводит n-ое число с конца списка
     * @param n число с конца списка
     * @return значение
     */
    public Integer getValueFromTail(int n) {
        if (head == null) {
            return null;
        }
        Node first = head;
        Node second = head;
        int count = 1;
        while (first.next != null) {
            first = first.next;
            count++;
            if (count > n) {
                second = second.next;
            }
        }
        if (n > count || n == 0) {
            return null;
        } else {
            return second.value;
        }
    }
}
