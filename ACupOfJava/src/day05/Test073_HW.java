package day05;

import java.util.ArrayList;
import java.util.List;

/*
    HW.collctionString(list)
        : list 내부의 값들을 다음과 같은 문자열로 출력한다.
        : "[]" // list.length == 0
        : "['apple']" // list.length == 1
        : "['apple', 'banana', 'orange', 'kiwi']" // list.length == 4
    단, if (list.length == 0) return "[]"; 이런거 하지 말기.
*/

public class Test073_HW {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<String>();

        ls.add("apple");
        ls.add("banana");
        ls.add("orange");
        ls.add("kiwi");

//        String l = HW.collectionString( ls );
//        System.out.println(l);
    }
}
