package quest;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Quest08_C {
    public static void main(String[] args) throws IOException {
        String ip = InetAddress.getLocalHost().getHostAddress();
        int port = 8290;

        Socket skt = new Socket(ip, port);
        System.out.println("connect server");

        ObjectOutputStream toServer = new ObjectOutputStream( skt.getOutputStream() );
        ObjectInputStream fromServer = new ObjectInputStream( skt.getInputStream() );

        // 파일명 전송
        toServer.writeUTF("music.mp3");
        toServer.flush();

        // 파일 존재 여부 받기
        int code = fromServer.readInt();

        if ( code == 200 ) {
            System.out.println("file downloading...");

            // 파일 다운로드
            OutputStream out = new FileOutputStream(args[0]);
            byte[] buffer = new byte[8 * 1024];
            int r = 0;
            while ( (r = skt.getInputStream().read(buffer)) != -1 ) {
                out.write(buffer, 0, r);
            }

            System.out.println("download finish");

        } else if (code == 404) {
            System.out.println("download fail");
        } else {
            System.out.println("알 수 없는 코드 : "  + code);
        }

        skt.close();
    }
}
