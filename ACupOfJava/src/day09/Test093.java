package day09;

class CustomThreaded implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello world " + i);
        }
    }
}

public class Test093 {
    public static void main(String[] args) {
        Runnable rb = new CustomThreaded();
        rb.run(); // 단순한 함수 호출

        Thread th = new Thread( rb );
        th.start();
    }
}
