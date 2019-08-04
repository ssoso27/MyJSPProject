package day04;

public class Test046 {
    public static void main(String[] args) {
        int[] i = new int[] { 1, 2, 3, 4 };

        for (int j = 0; j < i.length; j++) {
            if (j == 1) continue;
            if (j == 3) break;
            System.out.println(i[j]);
        }
    }
}
