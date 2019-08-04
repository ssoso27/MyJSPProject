package day09;

class Toilet {
    public void bigWork(String by){
        synchronized ( this ) {
            System.out.println("STEP 1." + by);
            System.out.println("STEP 2." + by);
            System.out.println("STEP 3." + by);
            System.out.println("STEP 4." + by);
            System.out.println("STEP 5." + by);
        }
    }

    public synchronized void sleepWork ( String by ) {
        System.out.println("[SLEEP] STEP 1." + by);
        System.out.println("[SLEEP] STEP 2." + by);
        System.out.println("[SLEEP] STEP 3." + by);
    }
}

class A implements Runnable{
    private Toilet toilet = null;

    public A(Toilet toilet) {
        this.toilet = toilet;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100 ; i ++) {
            int time = (int) (Math.random() * 1000);

            if ( time % 2 == 0 ) {
                toilet.bigWork("Apple " + i);
            } else {
                toilet.sleepWork("Apple " + i);
            }

            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable{
    private Toilet toilet;

    public B(Toilet toilet) {
        this.toilet = toilet;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100 ; i ++) {
            int time = (int) (Math.random() * 1000);

            if ( time % 2 == 0 ) {
                toilet.bigWork("Banana " + i);
            } else {
                toilet.sleepWork("Banana " + i);
            }

            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Test094 {
    public static void main(String[] args) {
        Toilet toilet = new Toilet();
        new Thread(new A( toilet )).start();
        new Thread(new B( toilet )).start();

    }
}