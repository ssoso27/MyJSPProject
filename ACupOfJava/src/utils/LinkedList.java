package utils;

public class LinkedList <T extends Object> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public LinkedList() {
        this.head = new Node<T>(null, null);
        this.tail = this.head;
        this.size = 0;
    }

    public void add (T data) {
        this.tail.next = new Node<T>(data, null);
        this.tail = this.tail.next;
        this.size++;
    }

    public void print() {
        for (Node n = head.next; n != null; n = n.next) {
            System.out.println(n.data);
        }
    }

    public Object[] toOArray() {
        Object[] array = new Object[this.size];

        int i = 0;
        for (Node n = head.next; n != null; n = n.next) {
            array[i++] = n.data;
        }

        return array;
    }
}