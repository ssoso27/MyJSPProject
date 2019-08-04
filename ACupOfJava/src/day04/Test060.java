package day04;

public class Test060 {
    public static void main(String[] args) {
        String l = "HelloWorld";

        // 문자열 안의 부분 문자열 리턴
        System.out.println(l.substring(2, 5)); // "llo"

        // 문자열 안의 부분 문자열의 위치를 리턴
        System.out.println(l.indexOf("or")); // 6

        // 없는 문자열을 찾을 때는 -1 리턴
        System.out.println(l.indexOf("sohee")); // -1

        // 시작되는 단어 비교
        System.out.println(l.startsWith("Hell")); // true

        // 끝나는 단어 비교
        System.out.println(l.endsWith("ld")); // true

        // 자료형의 배열을 리턴
        char[] ch = l.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
    }
}
