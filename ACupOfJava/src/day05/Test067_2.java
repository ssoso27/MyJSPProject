package day05;

import day05.temp.PrintStars;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Test067_2 {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("day05.temp.Test067"); // 이거 찾아야하니까 -classpath 줘야함
        Object obj = cls.newInstance();

        Method mtd = cls.getMethod("print");
        System.out.println( mtd );

        // PrintStars import 필요
        Annotation anot = mtd.getAnnotation( PrintStars.class );
        System.out.println( anot );

        if ( anot != null ) {
            System.out.println("**");
        }

        System.out.println( mtd.invoke(obj) );
    }
}

// javac Test067_2.java // 패키지 없으니까 그냥 컴파일
// java -classpath C:\A\;. Test067_2 // 실행할 떄는 사용된 클래스 찾아야함