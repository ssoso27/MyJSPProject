package sohi;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Score {
    String score = "";
    Score next = null;

    Score(String score, Score next) {
        this.score = score;
        this.next = next;
    }
}

class LinkedList<T extends Score> {
    private T head = null;
    private T tail = null;
    LinkedList() {
        this.head = (T) new Score("", null);
        this.tail = this.head;
    }

    public void add(String info) {
        this.tail.next = new Score(info, null);
        this.tail = (T) this.tail.next;
    }

    public List getList() {
        List<String> l = new ArrayList<>();
        for(T t = (T) head.next; t != null; t = (T) t.next) {
            l.add(t.score);
        }
        return l;
    }
}

class 성적관리_프로그램 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Score> list =  null;

        String str;
        while(true) {
            System.out.println("[ M E N U ]");
            System.out.println("1. 새 자료");
            System.out.println("2. 자료 입력");
            System.out.println("3. 파일로 저장");
            System.out.println("4. 불러오기");
            System.out.println("/quit. 나가기");
            System.out.print("> ");

            str = br.readLine();

            if(str.equals("1")) {
                list = new LinkedList<>();
            } else if(str.equals("2")) {
                if(list == null) {
                    System.out.println("새 자료를 만들어 주세요");
                    continue;
                }
                System.out.println("학번:점수 형식으로 입력하세요");
                System.out.print("> ");
                str = br.readLine();
                list.add(str);
            } else if(str.equals("3")) {
                if(list == null) {
                    System.out.println("새 자료를 만들어 주세요");
                    continue;
                }
                System.out.println("파일 이름을 입력하세요");
                System.out.print("> ");
                str = br.readLine();
                File f = new File(str);
                if(f.exists()) {
                    System.out.println("이미 파일이 존재합니다");
                } else {
                    List<String> l = list.getList();
                    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(str));
                    for(String s : l) {
                        out.writeUTF(s);
                    }
                    out.close();
                    System.out.println("저장이 완료되었습니다");
                }
            } else if(str.equals("4")) {
                System.out.println("불러올 파일 이름을 입력하세요");
                System.out.print("> ");
                str = br.readLine();
                File f = new File(str);
                if(!f.exists()) {
                    System.out.println("파일이 존재하지 않습니다");
                } else {
                    ObjectInputStream in = new ObjectInputStream(new FileInputStream(str));

                    try {
                        while (true) {
                            System.out.println(in.readUTF());
                        }
                    } catch (Exception e) {

                    }
                    in.close();
                }
            } else if(str.equals("/quit")) {
                break;
            } else {
                System.out.println("나가려면 /quit 을 치세요");
            }
        }

        br.close();
    }
}