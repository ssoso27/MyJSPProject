package day06;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test083S {
    public static void main(String[] args) throws Exception {
        ServerSocket svr = new ServerSocket(1134);

        System.out.println("before accept()");
        Socket skt = svr.accept();
        System.out.println("after accept()");

        // 데이터 수신
//        InputStream in = skt.getInputStream();
//        int r = in.read();
//        in.close();
//        System.out.println(r);

        // 데이터 전송
        InputStream in = new FileInputStream("a.txt");
        OutputStream out = skt.getOutputStream();

        int r = 0;
        while ( (r = in.read()) != -1 ) {
            out.write( r );
            out.flush();
        }
        out.close();
        in.close();

        skt.close();
        svr.close();
    }
}
