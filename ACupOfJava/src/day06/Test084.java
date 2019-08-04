package day06;

import java.io.*;
/*
    java.io 패키지는 데코레이터 패턴으로 구현됨 (HelloGreet 같은거래)
*/


public class Test084 {
    public static void main(String[] args) throws IOException {
        OutputStream out = new BufferedOutputStream( new FileOutputStream("buffer_copy.zip") );
        InputStream in = new BufferedInputStream( new FileInputStream("C:\\Users\\sohi8\\Desktop\\jdk-6u30-apidocs.zip") );

        // 1바이트 씩 복사하는 코드
        int r = 0;
        while( (r = in.read()) != -1 ) {
            out.write(r);
        }

        in.close();
        out.close();
    }
}
