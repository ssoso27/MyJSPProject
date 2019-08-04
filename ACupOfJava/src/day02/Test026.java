package day02;

class Apple2 {
    int i = 0;
    int add(int i, int j) { return 100; }

    /*
        생성자 함수.
        함수라고 보기에는 조금 어렵다. 포인터로 호출할 수 없다.
        인스턴스 생성 시점에 호출되고, 주 용도는 변수 초기화다.
     */
    Apple2(int j) {
        i = j;
    }
}

public class Test026 {
    public static void main(String[] args) {
        Apple2 apple2 = new Apple2(100);
        System.out.println(apple2.i + apple2.add(10, 20));
    }
}
