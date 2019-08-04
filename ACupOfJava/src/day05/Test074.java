package day05;

// 연료 고갈이라는 에러를 클래스로 명시함.
class FuelException extends Exception {}

public class Test074 {

    public void carDrive (int fuel) throws FuelException {
        if (fuel == 0) {
            throw new FuelException();
        }

        System.out.println("부릉부릉");
    }

    public static void main(String[] args) {
        Test074 t = new Test074();

        try {
            t.carDrive(0);
        } catch (FuelException e) {
            System.out.println("연료가 없다! 견인차를 불러라!");
        }
    }
}
