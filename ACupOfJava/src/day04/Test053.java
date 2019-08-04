package day04;

class Node <T extends Object> {
    T data = null;
    Node<T> next = null; // *지정된 타입으로 만들어진 Node만 가리켜야함!!!!!!*

    Node(T i, Node<T> n) {
        this.data = i;
        this.next = n;
    }
}

public class Test053 {
    public static void main(String[] args) {
        Node<String> head = new Node<String>(null, null);
        Node<String> tail = head;

        tail.next = new Node<String>("apple", null);
        tail = tail.next;

        tail.next = new Node<String>("banana", null);
        tail = tail.next;

        tail.next = new Node<String>("orange", null);
        tail = tail.next;

        for (Node n = head.next; n != null; n = n.next) {
            System.out.println(n.data);
        }
    }
}
