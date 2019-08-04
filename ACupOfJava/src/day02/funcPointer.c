#include <stdio.h>

/*
	[함수포인터]
	: returnType (*name) ( parmas...)
		ex) int (*cmp) (int n1, int 2n) 
*/

/*
	배열의 이름이 배열의 시작 주소 값을 의미하듯,
	함수의 이름도 함수가 저장된 메모리 공간의 주소 값을 의미한다.
	
	또한 배열과 함수의 이름은 그 형태가 상수이고,
	그 주소 값 저장을 위한 포인터 변수를 별도로 선언할 수 있다. 
*/

/*
	int SoSimple(int n1, int n2) {...}
	
	int (*fptr) (int, int); // 함수 포인터 선언 
	fptr = SoSimple; 
	fptr(3, 4); // 포인터 변수 
	SoSimple(3, 4); // 함수 (상수) 
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
	
	printf("입장순서 1 - OlderFirst \n");
	first = WhoIsFirst(age1, age2, OlderFirst); // OlderFirst 함수를 매개변수로 던짐 
	printf("%d세와 %d세 중 %d세가 먼저 입장! \n\n", age1, age2, first);
	
	
	printf("입장순서 2 - YoungerFirst \n");
	first = WhoIsFirst(age1, age2, YoungerFirst);
	printf("%d세와 %d세 중 %d세가 먼저 입장! \n\n", age1, age2, first);
	
	return 0;
}
