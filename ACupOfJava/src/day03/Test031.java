package day03;

class A2 {
    int i = 100;
    void print() {
        System.out.println("A print");
    }
}

class B2 extends A2 {
    int i = 200;
    void print() {
        System.out.println("B print");
    }
    void print2() {
        System.out.println("B print");
    }
}

public class Test031 {
    public static void main(String[] args) {
        A2 ab = new B2();
        ab.print();
        System.out.println(ab.i);
    }
}
