package day04;

public class Test047 {
    public static void main(String[] args) {
        int[] i = new int[] {4, 9, 6, 5};

        int max = i[0];
        for (int j = 0; j < i.length; j++) {
            if (max < i[j]) max = i[j];
        }

        System.out.println(max);
    }
}
