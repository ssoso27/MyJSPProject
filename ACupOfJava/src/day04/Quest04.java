package day04;

class LinkedList <T extends Object> {
    private Node<T> head;
    private Node<T> tail;

    public LinkedList() {
        this.head = new Node<T>(null, null);
        this.tail = this.head;
    }

    public void add (T data) {
        this.tail.next = new Node<T>(data, null);
        this.tail = this.tail.next;
    }

    public void print() {
        for (Node n = head.next; n != null; n = n.next) {
            System.out.println(n.data);
        }
    }
}

public class Quest04 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();

        ll.add("첫");
        ll.add("둘");
        ll.add("셋");

        ll.print();
    }
}
