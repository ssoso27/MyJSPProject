package day04;

public class Test059 {
    public static void main(String[] args) {
        StringBuffer l = new StringBuffer();
        for (int i = 0; i < 10000; i++) {
            l.append("apple");
        }
        System.out.println(l.toString());
    }
}
