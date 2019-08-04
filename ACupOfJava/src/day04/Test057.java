package day04;

class MyTemp {
    int data = 0;

    MyTemp add (int i) {
        data = data + i;
        return this;
    }
}

public class Test057 {
    public static void main(String[] args) {
        MyTemp t = new MyTemp();
        t.add(10).add(10).add(10).add(10);
        System.out.println(t.data); // 40
    }
}
