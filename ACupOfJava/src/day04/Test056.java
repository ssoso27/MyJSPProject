package day04;

interface ICalc {
    public int execute(int i);
}

class AddCalc implements ICalc {
    private int data = 0;

    AddCalc(int data) {
        this.data = data;
    }
    public int execute(int i) {
        return (i + data);
    }
}

interface PrintStars { }

class MinucCalc implements ICalc, PrintStars {
    private int data = 0;

    MinucCalc(int data) {
        this.data = data;
    }
    public int execute(int i) {
        return (data - i);
    }
}

public class Test056 {
    public static void main(String[] args) {
        ICalc[] ls = new ICalc[5];

        ls[0] = new AddCalc(0);
        ls[1] = new AddCalc(10);
        ls[2] = new MinucCalc(20);
        ls[3] = new AddCalc(30);
        ls[4] = new MinucCalc(40);

        int y = 10;
        for (int i = 0; i < ls.length; i++) {
            y = ls[i].execute(y);

            if (ls[i] instanceof PrintStars) {
                System.out.println("**");
            }
            System.out.println(y);
        }
    }
}
