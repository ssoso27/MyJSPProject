package day03;

class Node {
    int data = 0;
    Node next = null;

    Node (int i, Node n) {
        this.data = i;
        this.next = n;
    }
}

class LinkedList {
    Node head;
    Node tail;

    public LinkedList() {
        this.head = new Node(0, null);
        this.tail = this.head;
    }

    void add(int i) {
        this.tail.next = new Node(i, null);
        this.tail = this.tail.next;
    }

    void print() {
        for (Node n = head.next; n != null; n = n.next) {
            System.out.println(n.data);
        }
    }
}

public class Test029 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(10);
        l.add(20);
        l.print();
    }
}
