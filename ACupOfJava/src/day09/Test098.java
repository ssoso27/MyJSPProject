package day09;

class AA implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("AA running");
        }
    }
}

class BB implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("BB running");
        }
    }
}


class CC implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("CC running");
        }
    }
}

public class Test098 {
    public static void main(String[] args) {
        Thread[] threads = new Thread[3];

        threads[0] = new Thread( new AA() );
        threads[1] = new Thread( new BB() );
        threads[2] = new Thread( new CC() );

        threads[0].start();
        threads[1].start();
        threads[2].start();

        try {
            // 이 thread 가 끝나기 전에는 밑으로 내려가지 않는다.
            threads[0].join();
            threads[1].join();
            threads[2].join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("최종정리");
    }

    public static void main_old(String[] args) {
        new Thread( new AA() ).start();
        new Thread( new BB() ).start();
        new Thread( new CC() ).start();

        System.out.println("최종정리");
    }
}
