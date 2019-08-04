package day06;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test079 {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("a.dat");

        int a = in.read();
        int b = in.read();
        int c = in.read();
        int d = in.read();

        in.close();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
