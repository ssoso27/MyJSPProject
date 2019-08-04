package day06;

import java.io.File;

public class Test089 {
    public static void main(String[] args) {
        File f = new File("HelloWord.class");
        boolean b = f.exists();
        System.out.println(b);

        if ( b ) {
            // 파일의 길이를 리턴한다. ( return type : long )
            System.out.println( f.length() );
        }
    }
}
