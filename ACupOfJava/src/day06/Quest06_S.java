package day06;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Quest06_S {
    public static void main(String[] args) throws IOException {
        int port = 8290;
        // 소켓 연결
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("before");
        Socket socket = serverSocket.accept();
        System.out.println("after");
        ObjectInputStream request = new ObjectInputStream( socket.getInputStream() );
        ObjectOutputStream response = new ObjectOutputStream( socket.getOutputStream() );

        // 파일 이름 받기
        String fileName = request.readUTF();
        System.out.println("fileName : " + fileName);

        // 파일 다운로드 가능 여부 전달
        File file = new File( fileName );
        if ( file.exists() ) {
            System.out.println(fileName + " is exist");
            response.writeInt(200);
            response.flush();

            // 파일 전송
            response.writeLong( file.length() );
            response.flush();
            BufferedInputStream in = new BufferedInputStream( new FileInputStream( fileName ) );
            BufferedOutputStream out = new BufferedOutputStream( socket.getOutputStream() );

            int r = 0;
            byte[] buffer = new byte[8 * 1024];
            while ( (r = in.read(buffer)) != -1 ) {
                out.write(buffer, 0, r);
            }

            System.out.println("done");

        } else {
            System.out.println(fileName + " is non-exist");
            response.writeInt(404);
            response.flush();
        }

        response.close();
        request.close();
        socket.close();
        serverSocket.close();
    }
}
