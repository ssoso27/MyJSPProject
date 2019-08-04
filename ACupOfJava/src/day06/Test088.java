package day06;

import utils.LinkedList;

import java.io.*;

class Score {
    private String hakbun;
    private int point;

    public Score(String hakbun, int point) {
        this.hakbun = hakbun;
        this.point = point;
    }

    public String getHakbun() {
        return hakbun;
    }

    public void setHakbun(String hakbun) {
        this.hakbun = hakbun;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return hakbun + "번 학생 : " + point + "점";
    }
}

public class Test088 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        LinkedList<Score> l = null;

        while ( true ) {
            System.out.println();
            System.out.println("[ M E N U ]");
            System.out.println("1. 새 자료");
            System.out.println("2. 자료 입력"); // "10101,100"; // 10101 학생의 점수는 100점
            System.out.println("3. 파일로 저장"); // "score.dat"; // 저장파일명
            System.out.println("4. 파일에서 불러오기"); // "score.dat"; // 파일명

            String choice = br.readLine();
            if (choice.equals("1")) {
                l = new LinkedList<Score>();
                System.out.println("새 자료 생성 완료");
            } else if (choice.equals("2")) {
                if (l == null) {
                    System.out.println("새 자료를 먼저 생성해주세요.");
                    continue;
                }
                System.out.println("입력할 정보를 학번,점수 형식으로 입력하세요.");

                String[] str = br.readLine().split(",");
                Score score = new Score(str[0], Integer.parseInt(str[1]));
                System.out.println(score.toString());
                l.add(score);
            } else if (choice.equals("3")) {
                if (l == null) {
                    System.out.println("새 자료를 먼저 생성해주세요.");
                    continue;
                }
                System.out.println("저장할 파일 명을 입력하세요.");
                String fileName = br.readLine();
                Writer out = new OutputStreamWriter( new FileOutputStream(fileName) );

                for (Object object: l.toOArray()) {
                    Score score = (Score) object;
                    System.out.println(score.toString());
                    out.write(score.toString() + ", ");
                }
                out.close();
                System.out.println(fileName + " 저장 완료");

            } else if (choice.equals("4")) {
                System.out.println("불러올 파일 명을 입력하세요.");
                String fileName = br.readLine();
                System.out.println(fileName + " 를 불러옵니다.");

                Reader in = new InputStreamReader( new FileInputStream(fileName) );
//                ObjectInputStream in = new ObjectInputStream( new FileInputStream(fileName) ); // error

                int r = 0;
                while ( (r = in.read()) != -1 ) {
                    System.out.print( (char) r );
                }
                in.close();

            } else if (choice.equals("quit")) break;
        }

        br.close();
    }
}
