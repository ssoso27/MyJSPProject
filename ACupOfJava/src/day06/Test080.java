package day06;

import java.io.*;

public class Test080 {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("C:\\Users\\sohi8\\Documents\\ACupOfJava\\a.dat");
        OutputStream out = new FileOutputStream("C:\\Users\\sohi8\\Documents\\ACupOfJava\\b.dat");

        while ( true ) {
            int r = in.read();
            if (r == -1) {
                break;
            }
            out.write(r);
        }

        in.close();
        out.close();
    }
}
