package day01;

public class Test009 {
	public static void main(String[] args) {
		double money = 100.0;
		double rate = 6.6;
		
		for (int i = 0; i < 5; i++) money = money + (money * rate / 100);
		
		System.out.println(money);
	}
}