package day05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test069 {
    public static void main(String[] args) throws Exception {
        Set<String> ls = new HashSet<String>();
        ls.add("apple"); ls.add("banana"); ls.add("orange"); ls.add("kiwi"); ls.add("apple");

        Iterator<String> it = ls.iterator();
        while (it.hasNext()) {
            String l =  it.next();

            if ( l.indexOf("an") != -1 ) {
                it.remove();
            }

            System.out.println( l );
        }
    }
}
