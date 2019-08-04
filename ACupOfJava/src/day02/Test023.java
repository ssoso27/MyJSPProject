package day02;

class Apple { // 클래스는 일종의 설계도다.
    int i;
    int add (int i, int j) { return 100; }
}

public class Test023 {
    public static void main(String[] args) {
        Apple t; // 참조형 변수 (클래스의 이름으로 선언된 변수. 실제론 다 포인터)
        t = new Apple(); // 클래스의 인스턴스 생성 (by. new)
        // 참조형 변수 t는, Apple의 인스턴스를 가리키는 포인터 역할.

        t.i = 100; // t가 가리키는 인스턴스의 값 i를 가져옴. (t != 인스턴스)
        System.out.println(t.add(10, 20));
    }
}
