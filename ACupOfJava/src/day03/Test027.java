package day03;

class A {
    int apple = 10;
}

// 클래스 B는 클래스 A를 상속하여 만들어졌음을 명시함.
/// A에서 선언한 멤버변수, 멤버함수를 내려받겠다.
class B extends A {
    int add (int i, int j) { return 100; }
}

public class Test027 {
    public static void main(String[] args) {
        B t = new B();
        System.out.println(t.apple);
    }
}
