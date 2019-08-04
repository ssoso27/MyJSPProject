package day05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test067_3 {
    public static void main(String[] args) {
        List<String> l = new LinkedList<String>();
        l.add("apple");
        l.add("banana");
        l.add("orange");
        l.add("kiwi");

        // 향상된 for 문장
        for (String t : l) {
            System.out.println(t);
        }
    }
}
