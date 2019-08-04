#include <stdlib.h>
#include <stdio.h>

int apple_add(int i, int j) {
	return 100;	
}

typedef struct apple {
	int i;
	int (*add)(int, int);
} Apple; // ����ü �̸� ������ 

// �ν��Ͻ� ������ ������ ������ �ϴ� �Լ� 
// �̷��� �ؼ� �����ǰ�, �̰��� ����Ű�� �����͸� ����, �Լ��� ������ ���ٵǾ� �� �� �ִ�. 
Apple* new_Apple(int j){
    Apple* n;
    
    n = (Apple*)malloc(sizeof(Apple));
    n->i = j;
    n->add = apple_add; // �Լ� �����Ϳ� �Լ� ���� 
    
    return n;
}

int main() {
	Apple* t;
	
	t = new_Apple(100); 
	printf("%d \n", (t->i + t->add(10, 20)) );
	
	free(t);
	
	return 0;
}
