#include <stdio.h>

double danri(double money, int period, double rate) {
	return money + (money*rate)*period;
}

double bokri2(double money, int period, double rate) {
	int i;
	for (i = 0; i < period; i++) {
		money = money*(1+rate);
	}
	return money;
}

int main() {
	double money = 100;
	int period = 100;
	double rate = 0.066;
	double (*func) (double, int, double);
	
	// 단리
	func = danri;
	printf("단리 결과 : %f \n", func(money, period, rate));
	
	// 복리 
	func = bokri2;
	printf("복리 결과 : %f \n", func(money, period, rate));
	
	
	return 0;
}
