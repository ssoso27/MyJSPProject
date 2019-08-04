package day03;

class X {
    private int 마약 = 0;
    protected int 모나리자 = 0;
    public int 별장 = 0;
}

class Y extends X {
    void print() {
//        System.out.println( 마약 ); // private -> 자손 클래스에서 접근 불가
    }
}

public class Test033 {
    public static void main(String[] args) {
        X look = new X();
//        System.out.println(look.마약); // private -> 외부에서 접근 불가
    }
}
