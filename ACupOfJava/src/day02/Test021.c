#include <stdio.h>

int apple(int n1, int n2) {
	return 100;
}

int banana(int n1, int n2) {
	return 200;
}

int main() {
	int r;
	int (*fp)(int, int);
	
	fp = apple;
	r = fp(10, 20); // 100
	printf("%d \n", r);
	
	fp = banana;
	r = fp(10, 20);
	printf("%d \n", r); // 200
	
	return 0;
}
