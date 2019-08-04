#include <stdio.h>

/*
	[void 포인터] 
	: void * ptr;
	: 어떤 변수든지 주소 값을 담을 수 있다. (함수도 가능) 
	
	: 가리키는 대상에 대한 type 정보가 없음 
		-> 포인터 연산 불가능. 값 연산 및 참조 불가. 
	: 주소 값에만 의미를 두고, type은 나중에 결정할 때 유용함. 
*/

void SoSimpleFunc(void) {
	printf("I'm so simple");
}

int main(void) {
	int num = 20;
	void *ptr;
	
	ptr = &num; // 변수 num의 주소 값 저장 
	printf("%p \n", ptr);
	
	ptr = SoSimpleFunc; // 함수 SoSimpleFunc의 주소 값 저장 
	printf("%p \n", ptr);
	
	return 0;
}
