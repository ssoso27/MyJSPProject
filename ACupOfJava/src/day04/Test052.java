package day04;

class Yap <T extends Object> {
    private T data = null;
    public T getData() { return this.data; }
    public void setData(T data) { this.data = data; }
}

public class Test052 {
    public static void main(String[] args) {
        Yap<String> t = new Yap<String>();
        t.setData("HelloWorld");
        String l = t.getData();
    }
}
