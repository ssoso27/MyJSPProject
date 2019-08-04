package day03;

class AA {
    void print() {
        System.out.println("A print");
    }
}

class BB extends AA {
    void print() {
        super.print();
        System.out.println("B print");
    }
}

public class Test030 {
    public static void main(String[] args) {
        BB bb = new BB();
        bb.print();

        AA aa = new AA();
        aa.print();
    }
}
