package day05;

class A {

}

class B extends A {
    public void print() {
        System.out.println(100);
    }
}

public class Test061 {
    public static void main(String[] args) {
        A a = new A();

        if(a instanceof B) {
//            B b = (A) a; // a가 가리키는 인스턴스를 감싸는 B 인스턴스 영역이 존재해야만 가능
//            b.print();
        }
    }
}
