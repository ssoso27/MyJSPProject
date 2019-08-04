package day06;

import java.io.*;

public class Test086 {
    public static void main(String[] args) throws Exception {
//        Writer out = new FileWriter("a.txt");
        Writer out = new OutputStreamWriter( new FileOutputStream("a.txt") );
        out.write("한");
        out.write("글");
        out.write("임");
        out.write("洪");
        out.close();

//        Reader in = new FileReader("a.txt");
        Reader in = new InputStreamReader( new FileInputStream("a.txt") );
        System.out.println( (char) in.read() );
        System.out.println( (char) in.read() );
        System.out.println( (char) in.read() );
        System.out.println( (char) in.read() );
        in.close();
    }
}
