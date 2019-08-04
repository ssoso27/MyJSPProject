package day04;

class A {
    int i = 100;
}

class B extends A {
    int i = 200; // 부모의 i와는 다름
    void print() { System.out.println("B print"); }
}

public class Test041 {
    public static void main(String[] args) {
        A ab = new B();
        System.out.println(ab.i); // 100
//        ab.print(); // error!

        // ab 포인터가 가리키는 인스턴스를 감싸는 B 클래스 인스턴스를 a가 가리킨다.
        B a = (B) ab;
        System.out.println(a.i); // 200
        a.print();
    }
}
