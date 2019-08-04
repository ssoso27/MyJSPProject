package day04;

class MyString {

    public static int indexOf(char[] str, char[] pattern) {
        int idx = -1;

        for (int i = 0; i < str.length; i++) {
            if (str[i] == pattern[0]) {
                if (pattern.length == 1) {
                    idx = i;
                    break;
                }

                for (int j = 1; j < pattern.length; j++) {
                    if (str[i + j] != pattern[j]) break;
                    if (j == pattern.length - 1) idx = i;
                }
            }

            if (idx != -1) break;
        }

        return idx;
    }
}

public class Quest05 {
    public static void main(String[] args) {
        int idx = MyString.indexOf("HelloWorld".toCharArray(), "HelloWorlddddd".toCharArray());

        System.out.println(idx);
    }
}
