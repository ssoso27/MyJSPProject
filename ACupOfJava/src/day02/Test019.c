#include <stdio.h>

float bokri(float money, int period, float rate) {
	int i;
	for (i = 0; i < period; i++) {
		money = money*(1+rate);
	}
	return money;
}

int main() {
	float r;
	r = bokri(100.0, 100, 0.066);
	printf("%f \n", r);
	return 0;
}
