package utils;

public class Node <T extends Object> {
    T data = null;
    Node<T> next = null; // *지정된 타입으로 만들어진 Node만 가리켜야함!!!!!!*

    Node(T i, Node<T> n) {
        this.data = i;
        this.next = n;
    }
}