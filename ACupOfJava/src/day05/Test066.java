package day05;

public class Test066 {
    public static void main(String[] args) throws Exception {
        // 클래스를 찾아내서 해당 클래스를 메모리에 강제로 로딩 시킨다.
        // 로딩시키는 클래스의 static initializer가 동작한다.
        Class<?> cls = Class.forName("day05.temp.Test066A");
        Object obj = cls.newInstance();

        /*
            Class: 로딩된 클래스의 관리자 역할을 한다.
            cls.newInstance(): cls가 관리하는 temp.Test066A의 인스턴스를 생성한다.
            obj.getClass.getName(0 : obj가 가리키는 인스턴스를 생성시킨 클래스 명

            import 없이도 다른 패키지의ㅣ  클래스를 인스턴스를 생성할 수 있따.
         */

        System.out.println(obj.getClass().getName());
    }
}
