package day01;

class meong {
    public static void main(String[] args) {
        System.out.println(solution("hello world"));
    }

    public static String solution(String s) {
        String answer = "";
        String[] arr = (s + ".").split(" ");
        for (String target: arr) {
            if (target.equals(".")) break;

            for (int i = 0; i < target.length(); i++) {
                if (i%2 == 0) answer += target.toUpperCase().charAt(i);
                else answer += target.toLowerCase().charAt(i);
            }
            answer += " ";
        }

        answer = answer.substring(0, answer.length()-1);

        return answer;
    }
}