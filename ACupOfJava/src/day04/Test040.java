package day04;

class Temp {
    public void print() {}
    public void print(int i) {}
    public void print(double i) {}
    public void print(int i, int j) {}
}

public class Test040 {
    public static void main(String[] args) {
        Temp t = new Temp();
        t.print();

        // float j = 3.14; // 이게 왜 안되는지 정리
        float i = (float) 3.14;
    }
}
