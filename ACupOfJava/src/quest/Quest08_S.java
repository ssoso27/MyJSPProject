package quest;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

class FileTransferThread implements Runnable {
    private Socket skt;

    public FileTransferThread(Socket skt) {
        this.skt = skt;
    }

    @Override
    public void run() {
        try {
            ObjectInputStream fromClient = new ObjectInputStream( skt.getInputStream() );
            ObjectOutputStream toClient = new ObjectOutputStream( skt.getOutputStream() );

            // 파일명 받기
            String fileName = fromClient.readUTF();

            // 파일 존재 여부 판별
            File file = new File(fileName);
            if (file.exists()) {
                System.out.println(200);
                toClient.writeInt(200);
                toClient.flush();

                // 파일 전송
                System.out.println("transfer " + fileName);

                InputStream in = new FileInputStream(fileName);
                byte[] buffer = new byte[8 * 1024];
                int r = 0;
                while ( (r = in.read(buffer)) != -1 ) {
                    skt.getOutputStream().write(buffer, 0, r);
                    skt.getOutputStream().flush();
                }

                System.out.println("transfer finish");
            } else {
                System.out.println(404);
                toClient.writeInt(404);
                toClient.flush();
            }

            skt.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class Quest08_S {
    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 8290;
        ServerSocket svr = new ServerSocket(port);
        Thread[] threads = new Thread[3];

        System.out.println("running server...");

        for (int i = 0; i < 3; i++) {
            Socket skt = svr.accept();
            System.out.println("connect " + skt.getInetAddress());

            threads[i] = new Thread( new FileTransferThread( skt ) );
            threads[i].start();
        }

        for (Thread thread: threads) {
            thread.join();
        }

        System.out.println("server end");

        svr.close();
    }
}
