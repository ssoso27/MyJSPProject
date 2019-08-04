package day05;

import java.lang.reflect.Method;

public class Test066_3 {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("day05.temp.Test066A");
        Object obj = cls.newInstance();

        Method mtd;
        // 함수 이름으로 함수 찾기
        /// (1) 매개변수가 없는 경우
        //// void print()
        mtd = cls.getMethod("print");

        /// (2) 매개변수가 있는 경우
        //// void print2(inimport day05.temp.PrintStars;t)
        mtd = cls.getMethod("print2", int.class);
        System.out.println(mtd);

        Object r = mtd.invoke(obj, 20);
        System.out.println( ((Integer)r).intValue() );
    }
}
