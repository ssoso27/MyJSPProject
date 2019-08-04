#include <stdio.h>

/*
	[�Լ�������]
	: returnType (*name) ( parmas...)
		ex) int (*cmp) (int n1, int 2n) 
*/

/*
	�迭�� �̸��� �迭�� ���� �ּ� ���� �ǹ��ϵ�,
	�Լ��� �̸��� �Լ��� ����� �޸� ������ �ּ� ���� �ǹ��Ѵ�.
	
	���� �迭�� �Լ��� �̸��� �� ���°� ����̰�,
	�� �ּ� �� ������ ���� ������ ������ ������ ������ �� �ִ�. 
*/

/*
	int SoSimple(int n1, int n2) {...}
	
	int (*fptr) (int, int); // �Լ� ������ ���� 
	fptr = SoSimple; 
	fptr(3, 4); // ������ ���� 
	SoSimple(3, 4); // �Լ� (���) 
*/
int WhoIsFirst(int age1, int age2, int (*cmp)(int n1, int n2)) {
	printf("who is first?");
	return cmp(age1, age2);
}

int OlderFirst(int age1, int age2) {
	printf("older first!");
	if (age1 > age2) return age1;
	else if (age1 < age2) return age2;
	else return 0;
}

int YoungerFirst(int age1, int age2) {
	printf("younger first!");
	if (age1 < age2) return age1;
	else if (age1 > age2) return age2;
	else return 0;
}

int main(void) {
	int age1 = 20;
	int age2 = 30;
	int first;
	
	printf("������� 1 - OlderFirst \n");
	first = WhoIsFirst(age1, age2, OlderFirst); // OlderFirst �Լ��� �Ű������� ���� 
	printf("%d���� %d�� �� %d���� ���� ����! \n\n", age1, age2, first);
	
	
	printf("������� 2 - YoungerFirst \n");
	first = WhoIsFirst(age1, age2, YoungerFirst);
	printf("%d���� %d�� �� %d���� ���� ����! \n\n", age1, age2, first);
	
	return 0;
}
