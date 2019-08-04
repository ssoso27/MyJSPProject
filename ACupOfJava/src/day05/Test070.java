package day05;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test070 {
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<String, String>();
        map.put("apple", "사과");
        map.put("banana", "바나나");
        map.put("orange", "오렌지");
        map.put("kiwi", "키위");
        map.put("apple", "사과2");

        System.out.println( map.toString() );
        System.out.println( map.get("kiwi") );

        Set<String> keys = map.keySet();
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String l =  it.next();
            String v = map.get(l);
            System.out.println(l + ", " + v);
        }
    }
}
