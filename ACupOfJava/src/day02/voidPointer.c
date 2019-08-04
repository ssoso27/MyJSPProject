#include <stdio.h>

/*
	[void ������] 
	: void * ptr;
	: � �������� �ּ� ���� ���� �� �ִ�. (�Լ��� ����) 
	
	: ����Ű�� ��� ���� type ������ ���� 
		-> ������ ���� �Ұ���. �� ���� �� ���� �Ұ�. 
	: �ּ� ������ �ǹ̸� �ΰ�, type�� ���߿� ������ �� ������. 
*/

void SoSimpleFunc(void) {
	printf("I'm so simple");
}

int main(void) {
	int num = 20;
	void *ptr;
	
	ptr = &num; // ���� num�� �ּ� �� ���� 
	printf("%p \n", ptr);
	
	ptr = SoSimpleFunc; // �Լ� SoSimpleFunc�� �ּ� �� ���� 
	printf("%p \n", ptr);
	
	return 0;
}
