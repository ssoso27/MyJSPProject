package day06;

import java.io.*;
import java.net.Socket;

/*
1. "music.mp3" 입력
2. writeUTF() -> readUTF()
3. 해당 파일이 있는지 조사
   1. 있으면 -> 200 writeInt()
   2. 없으면 -> 404 writeInt()
4. readInt()
   1. 404 -> 종료
   2. 200 -> 파일 다운로드
*/

public class Quest06_C {
    public static void main(String[] args) throws IOException {
        // 소켓 연결
        String ip = "192.168.2.44";
        int port = 8290;
        Socket socket = new Socket(ip, port);
        ObjectOutputStream request = new ObjectOutputStream( socket.getOutputStream() );
        ObjectInputStream response = new ObjectInputStream( socket.getInputStream() );

        // 파일 이름 보내기
        String fileName = "music.mp3";
        String downloadFileName = "mymusic.mp3";
        request.writeUTF(fileName);
        request.flush();

        // 파일 다운로드 가능 여부 확인
        int code = response.readInt();
        if ( code == 200 ) {
            // 파일 다운로드
            System.out.println(fileName + " 파일을 다운로드 합니다.");
            long fileSize = response.readLong();
            System.out.println(fileSize);
            BufferedInputStream in = new BufferedInputStream( socket.getInputStream() );
            BufferedOutputStream out = new BufferedOutputStream( new FileOutputStream(downloadFileName) );

            int r = 0;
            long downloadSize = 0;
            byte[] buffer = new byte[8 * 1024];
            while ( (r = in.read(buffer)) != -1 ) {
                out.write(buffer, 0, r);
                downloadSize = downloadSize + (8 * 1024);
                int percent = (int) (((double) downloadSize / fileSize) * 100);
                System.out.println(downloadSize + " / " + fileSize + " (" + percent + "%)");
            }

            System.out.println("다운로드 완료");

        } else if ( code == 404 ) {
            System.out.println(fileName + " 파일이 존재하지 않습니다.");
        } else {
            System.out.println("알 수 없는 code : " + code );
        }

        response.close();
        request.close();
        socket.close();

    }
}
