#include <stdio.h>

// 함수 선언
// [유일한 리턴 타입] [이름] ( 0..* 변수선언 - 매개변수 ) { ... } 
int add(int i, int j) {
	int t; // 로컬변수. 함수가 호출된 시점에 메모리 할당 받음 
	t = i + j;
	return t;
}

int main() {
	int r;
	// 호출 순서: = 의 오른편. 즉, 함수 호출이 먼저.
	r = add(10, 20); // 호출 시, 매개변수 값 명시. (선언xxxx) 
	printf("%d \n", r);
	
	return 0;
}
