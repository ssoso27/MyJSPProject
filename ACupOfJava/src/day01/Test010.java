package day01;

public class Test010 {
	public static void main(String[] args) {
		double money = 100;
		double total = 0;
		double rate = 0.066;
		int period = 100;
		
		for (int i = 0; i < period; i++) {
			total += money;
			total = total * (1 + rate);
		}
		System.out.println(total);
		
		total = 0;
		for (int i = 0; i < period; i++) {
			money = money * (1 + rate);
			total += money;
		}
		System.out.println(total);
	}
}	
