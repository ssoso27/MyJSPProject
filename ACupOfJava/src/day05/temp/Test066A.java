package day05.temp;

public class Test066A {
    // static initializer.
    // class loaing 시점에 호출됨.
    static {

    }

    public int print() { return 200; }
    public int print2(int i) { return 300 + i; }

    public static int print3() {
        return 100;
    }

    protected void protectedM() {}
    private void privateM() {}
}
