#include <stdio.h>

int add(int i, int j) {
	int t; 
	t = i + j;
	return t;
}

int main() {
	int r;
	int (*fp) (int, int); // 이렇게 생긴 함수를 가리키는 함수 포인터 
	fp = add;
	
	r = fp(10, 20); // fp가 가리키는 함수 add를 호출 
	printf("%d \n", r);
	
	return 0;
}
