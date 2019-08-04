package day06;

import java.io.*;

public class Test081 {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("C:\\Users\\sohi8\\Desktop\\jdk-6u30-apidocs.zip");
        OutputStream out = new FileOutputStream("copy_docs.zip");

        int r = 0;
        byte[] buf = new byte[1024*8];

        while ( ( r = in.read( buf ) ) != -1) {
            out.write( buf, 0, r);
        }

        out.close();
        in.close();
    }
}
