#include <stdlib.h>
#include <stdio.h>

int apple_add(int i, int j) {
	return 100;	
}

typedef struct apple {
	int i;
	int (*add)(int, int);
} Apple; // 구조체 이름 지어줌 

// 인스턴스 생성과 유사한 동작을 하는 함수 
// 이렇게 해서 생성되고, 이것을 가리키는 포인터를 통해, 함수와 변수가 접근되어 질 수 있다. 
Apple* new_Apple(int j){
    Apple* n;
    
    n = (Apple*)malloc(sizeof(Apple));
    n->i = j;
    n->add = apple_add; // 함수 포인터에 함수 연결 
    
    return n;
}

int main() {
	Apple* t;
	
	t = new_Apple(100); 
	printf("%d \n", (t->i + t->add(10, 20)) );
	
	free(t);
	
	return 0;
}
