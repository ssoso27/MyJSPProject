package day03;

abstract class Bank {
    public abstract double calc(double money, int years, double rate);

    public void print() {
        double r = calc(100, 100, 0.066);
        System.out.println(r);
    }
}

class BokriBank extends Bank {
    public double calc(double money, int years, double rate) {
        return 59665.1234 * subCalc();
    }

    private int subCalc() { return 0; }
}

class DanriBank extends Bank {
    public double calc(double money, int years, double rate) {
        return 760.0000 + money();
    }

    private int money() { return 100; }
}

public class Test036 {
    public static void main(String[] args) {
        Bank vk = new BokriBank();
        vk.print();
    }
}
