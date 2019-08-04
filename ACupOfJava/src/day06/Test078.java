package day06;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test078 {
    public static void main(String[] args) throws IOException {
        OutputStream out = new FileOutputStream("a.dat");
        out.write(65);
        out.write(66);
        out.write(67);
        out.close();
    }
}
