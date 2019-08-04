package day05;

/*
    HW.randomArray( n, max );
        : 서로 중복되지 않는 n 개의 랜덤 정수를 return. (단, 0 <= x < max )
    2가지 이상의 다른 방법으로 구현하되, 1가지 방법은 Collection 금지.
 */

import java.util.*;

class HW {
    public static int[] randomArray(int n, int max) {
        int[] arr = new int[n];
        arr[0] = (int) (Math.random() * max);

        for (int i = 1; i < arr.length; i++) {
            boolean isExist = true;
            int num = -1;
            // 중복이 아닐때 까지
            while (isExist) {
                isExist = false;
                num = (int) (Math.random() * n);
                // 다 돌면서 중복체크
                for (int j = 0; j < i; j++) {
                    // 중복체크
                    if (arr[j] == num) isExist = true;
                }
            }
            arr[i] = num;
        }

        return arr;
    }

    public static int[] randomArray2(int n, int max) {
        int[] result = new int[n];
        Set<Integer> numbers = new TreeSet<Integer>();

        while (numbers.size() < n) {
            int num = (int) (Math.random() * max);
            numbers.add(num);
        }

        int count = 0;
        for (Integer i : numbers) {
            result[count++] = i;
        }

        return result;
    }

    public static String collectionString(List<String> list) {
        StringBuffer sb = new StringBuffer("[");
        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            String str = it.next();
            sb.append("'");
            sb.append(str);
            sb.append("'");
            if (it.hasNext()) sb.append(",");
        }

        sb.append("]");
        return sb.toString();
    }
}

public class Test072_HW {
    public static void main(String[] args) {
        int[] rl = HW.randomArray2( 10, 100 );
        for (int i = 0; i < rl.length ; i++) {
            System.out.println( rl[i] );
        }

        List<String> ls = new ArrayList<String>();

        ls.add("apple");
        ls.add("banana");
        ls.add("orange");
        ls.add("kiwi");

        String l = HW.collectionString( ls );
        System.out.println(l);
    }
}
