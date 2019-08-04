#include <stdio.h>

// 苞力 1. 窜府 汗府
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
	printf("窜府 : %f \n", func(money, period, rate));
	
	func = bokri;
	printf("汗府 : %f \n", func(money, period, rate)); 
	
	return 0;
}
