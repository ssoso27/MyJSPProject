#include <stdio.h>

int add(int i, int j) {
	int t; 
	t = i + j;
	return t;
}

int main() {
	int r;
	int (*fp) (int, int); // �̷��� ���� �Լ��� ����Ű�� �Լ� ������ 
	fp = add;
	
	r = fp(10, 20); // fp�� ����Ű�� �Լ� add�� ȣ�� 
	printf("%d \n", r);
	
	return 0;
}
