package day06;

import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test077 {
    public static void main(String[] args) throws IOException {

        try {
            // FileOutputStream 은 OutputStream을 상속 받는다.
            OutputStream out = new FileOutputStream("a.dat");
        } catch (FileNotFoundException e) {
            System.out.println("exception");
        }
    }
}

// Test076 복습하기
/*
    javac -d . Test077.java
    java -classpath . temp.Test077
 */