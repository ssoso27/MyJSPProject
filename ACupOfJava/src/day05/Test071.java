package day05;

public class Test071 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            double d = Math.random();
            int n = (int) (d * 100.0);
            System.out.println(n);
        }
    }
}
