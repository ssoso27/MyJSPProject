package day03;

interface IGreet {
    public String greet();
}

abstract class GreetDeco implements IGreet {
    protected IGreet ig = null;

    GreetDeco(IGreet i) {  // 여기서 merci 를 받음
        this.ig = i;  // 멤버변수 초기화해줌
    }
}

class StarDeco extends GreetDeco {
    // IGreet ig;

    StarDeco(IGreet i) { // merci
        super(i); // 부모한테 merci 던져줌
    }

    @Override
    public String greet() {
        return "*" + ig.greet() + "*"; // ig = merci
        // *   merci      *
    }
}

class MerciGreet implements IGreet {
    public String greet() {
        return "merci";
    }
}

public class Test039 {
    public static void main(String[] args) {
        IGreet merci = new MerciGreet();

        IGreet starDeco = new StarDeco(merci); // ig = merci

        IGreet star2 = new StarDeco(starDeco);

        IGreet ig = new StarDeco ( new StarDeco( new MerciGreet() ) );

        System.out.println(starDeco.greet());




//        IGreet i = new StarDeco( new StarDeco( new 느낌표Deco( new HelloGreet() ) ) );
//        System.out.println(i.greet());
    }
}
