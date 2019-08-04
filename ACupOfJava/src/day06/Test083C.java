package day06;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Test083C {
    public static void main(String[] args) throws Exception {
        Socket skt = new Socket("192.168.2.44", 1134);

        // 데이터 전송
//        OutputStream out = skt.getOutputStream();
//        out.write( 65 );
//        out.flush();
//        out.close();

        // 데이터 수신 및 저장
        InputStream in = skt.getInputStream();
        OutputStream fileOut = new FileOutputStream("file.dat");
        int r = 0;
        while( (r = in.read()) != -1 ) {
            fileOut.write(r);
        }
        in.close();
        fileOut.close();

        skt.close();
    }
}
