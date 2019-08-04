package day04;

public class Test055 {
    public static void main(String[] args) {
        Integer i = 100;
        Object t = 200;
        System.out.println(i.getClass().getName());
        System.out.println(t.getClass().getName());

        int j = i; // int j = i.intValue();
        System.out.println(j); // 100
    }
}
