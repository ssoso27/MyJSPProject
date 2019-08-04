package sohi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudyHashMap {
    public static void main(String[] args) {
    /*
      - Map
        : ("Key", value)로 이루어진 interface.
        : key값은 중복 불가, value는 중복 및 null 가능.
        : HashMap, LinkedHashMap, TreeMap 등이 있음.

      - HashMap
        : Map을 구현한다.
        : Key와 value를 묶어 하나의 entry로 저장한다.

      - 멀티쓰레드에서
        : HashTable을 쓴다.
        : 동시에 HashMap을 건드려 Key-value 값을 사용하면 문제가 될 수 있다.
    */
        Map<String, String> testMap = new HashMap<String, String>();

        // put -> key, value 넣어줌
        testMap.put("1번 강아지 이름", "댕댕이");
        testMap.put("2번 강아지 이름", "해피");
        testMap.put("3번 강아지 이름", "피죤투");

        for (int i = 1; i < testMap.size(); i++ ){
            // get -> 해당 key의 value 꺼냄
            System.out.println(testMap.get((i+"번 강아지 이름")));
        }

        // entrySet -> "key=value" 형태로 Set에 저장하여 반환
        Set set = testMap.entrySet();
        System.out.println("set values are " + set);

        // HashMap에 넣은 key와 value를 Set에 넣고, Iterator에 값으로 Set 정보를 담아 준다.
        // Iteraor itr = testMap.entrySet().iterator(); 와 같다.
        Set<Map.Entry<String, String>> set2 = testMap.entrySet();
        Iterator<Map.Entry<String, String>> itr = set2.iterator();

        while (itr.hasNext()) {
            Map.Entry<String, String> e = itr.next();
            System.out.println("key: " + e.getKey() + ", value: " + e.getValue());
        }
    }
}