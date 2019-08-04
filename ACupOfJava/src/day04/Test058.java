package day04;

public class Test058 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("apple");
        sb.append("banana");

        System.out.println(sb.toString());

        String str = "apple" + "banana";
        // 컴파일러가 new StringBuffer().append("apple").append("banana").toString();
        // + 할 때 마다 new StringBuffer() 동작 -> 효율ㄴㄴ
    }
}
