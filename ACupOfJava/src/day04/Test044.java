package day04;

import day04.temp.IGreet;
import day04.temp.HelloGreet;

public class Test044 {
    public static void main(String[] args) throws Exception {
        // 클래스를 가져다가 강제로 로딩
        Class<?> cls = Class.forName("day04.temp.HelloGreet");
        // main에서 받은 args를 가지고, 원하는 클래스 로딩
//        Class<?> cls = Class.forName("day04.temp." + args[0] + "Greet");
        IGreet ig = (IGreet) cls.newInstance();
        System.out.println(ig.greet());
    }
}
