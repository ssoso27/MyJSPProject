package sohi;

public class StudyStringBuffer {
    /*
        - StringBuffer
            : 문자열을 추가하거나 변경 할 때 주로 사용하는 자료형.
     */

    static void studyAppend() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("hello");
        stringBuffer.append(" ");
        stringBuffer.append("jump to java");
        System.out.println(stringBuffer.toString());

        String temp = "";
        temp += "hello";
        temp += " ";
        temp += "jump to java";
        System.out.println(temp);
    }

    public static void main(String[] args) {
        studyAppend();
    }
}
