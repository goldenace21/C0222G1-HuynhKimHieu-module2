package _09_array_list.exercise.linked_list;

import java.util.LinkedList;

public class MyLinkedList<E> {
    private Node head;
    private Node tail;
    private int numNodes = 0;

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    public MyLinkedList() {
    }

    public void addFirst(E data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
        if (tail == null) {
            tail = head;
        }
    }

    public void addLast(E data) {
        if (tail == null) {
            head = tail = new Node(data);
        } else {
            tail.next = new Node(data);
            tail = tail.next;
        }
        numNodes++;
    }

    public void add(int index, E data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public E get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public int size() {
        return numNodes;
    }

    public E removeFirst() {
        if (numNodes == 0) {
            return null;
        }
        Node temp = head;
        head = head.next;
        numNodes--;
        if (numNodes == 1) {
            head = tail = null;
        }
        return (E) temp;
    }

    public E removeLast() {

        if (numNodes == 0) return null; // Nothing to remove
        else if (numNodes == 1) { // Only one element in the list
            Node temp = head;
            head = tail = null; // list becomes empty
            numNodes = 0;
            return (E) temp.data;
        } else {
            Node current = head;

            for (int i = 0; i < numNodes - 2; i++)
                current = current.next;

            Node temp = tail;
            tail = current;
            tail.next = null;
            numNodes--;
            return (E) temp.data;
        }

    }

    public E remove(int index) {
        if (index < 0 || index >= numNodes) {
            return null;
        } else if (index == 0) {
            return removeFirst();
        } else if (index == numNodes - 1) {
            return removeLast();
        } else {
            Node previous = head;

            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }

            Node current = previous.next;
            previous.next = current.next;
            numNodes--;
            return (E) current.data;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public int indexOf(E data) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.getData().equals(data)) {
                return index;
            }
            index++;
            temp = temp.next;
        }
        return -1;
    }

    public MyLinkedList<E> clone() {
        if (numNodes == 0) {
            return null;
        }
        MyLinkedList<E> newLL = new MyLinkedList<>();
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            newLL.addLast((E) temp.data);
            temp = temp.next;
        }
        return newLL;
    }

    public boolean contain(E data) {
        if (indexOf(data) != -1) {
            return true;
        }
        return false;
    }

    public E getFirst() {
        Node temp = head;
        if (head == null) {
            return null;
        }
        return (E) temp.data;
    }

    public E getLast() {
        Node temp = tail;
        if (tail == null) {
            return null;
        }
        return (E) temp.data;
    }

    public void clear() {
        Node temp = head;
        Node holder;
        for (int i = 0; temp != null; i++) {
            holder = temp.next;
            temp.next = null;
            temp = holder;
        }
        tail = head = temp;
        numNodes = 0;
    }
}
