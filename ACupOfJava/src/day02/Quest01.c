#include <stdio.h>

// ���� 1. �ܸ� ����
float danri(float money, int period, float rate) {
	return money + (money * rate) * period;
}

float bokri(float money, int period, float rate) {
	int i;
	for (i = 0; i < period; i++) {
		money = money + (money * rate);
	}
	return money;
}
 
int main() {
	float money = 100;
	int period = 100;
	float rate = 0.066;
	float (*func) (float, int, float);

	func = danri;
	printf("�ܸ� : %f \n", func(money, period, rate));
	
	func = bokri;
	printf("���� : %f \n", func(money, period, rate)); 
	
	return 0;
}
