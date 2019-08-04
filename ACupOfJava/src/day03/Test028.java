package day03;

class Apple3 {
    int data = 0;

    void print() {
        System.out.println( this.data );
    }
}

public class Test028 {
    public static void main(String[] args) {
        Apple3 t = new Apple3();
        t.data = 10;
        t.print();

        Apple3 l = new Apple3();
        l.data = 20;
        l.print();
    }
}