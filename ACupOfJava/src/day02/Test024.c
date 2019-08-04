#include <stdlib.h>
#include <stdio.h>

struct apple {
	int i;
	int add;
};

int main() {
	struct apple* t; // 구조체 apple 형태의 기억공간을 가리키는 포인터 변수 t 
	
	// 구조체 apple 만큼의 크기의 기억공간을 할당받음  
	// 이 때, 할당 받은 기억공간은 이름이 없다. 포인터 t로만 접근이 가능.
	// 이 공간은 로컬변수가 아니고, 자동삭제가 안된다. 
	t = (struct apple*) malloc( sizeof(struct apple) ); 
	t->i = 100;
	t->add = 20;
	printf("%d \n", (t->i + t->add) );
	
	free(t); // malloc 으로 할당받은 기억공간(t가 가리키는 대상)을 날림  
	
	return 0;
}
