package day04;

class Temp3 {
    private int data = 0;

    public int getData() { return this.data; }
    public void setData(int data) { this.data = data; }
}

public class Test048 {
    public static void main(String[] args) {
        Temp3 t = new Temp3();

        t.setData(6);
        System.out.println(t.getData());
    }
}
