package day04;

class Temp10 {
    private Object data = null;

    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
}

class Temp20 {
    private String data = null;

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
}

public class Test050 {
    public static void main(String[] args) {
        Temp10 t = new Temp10();
        Temp20 t2 = new Temp20();

        t.setData("HelloWorld");
        t2.setData("HelloWorld");

        String l = (String) t.getData();
        String l2 = t2.getData();

        System.out.println(l == l2);
    }
}
