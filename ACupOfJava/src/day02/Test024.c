#include <stdlib.h>
#include <stdio.h>

struct apple {
	int i;
	int add;
};

int main() {
	struct apple* t; // ����ü apple ������ �������� ����Ű�� ������ ���� t 
	
	// ����ü apple ��ŭ�� ũ���� �������� �Ҵ����  
	// �� ��, �Ҵ� ���� �������� �̸��� ����. ������ t�θ� ������ ����.
	// �� ������ ���ú����� �ƴϰ�, �ڵ������� �ȵȴ�. 
	t = (struct apple*) malloc( sizeof(struct apple) ); 
	t->i = 100;
	t->add = 20;
	printf("%d \n", (t->i + t->add) );
	
	free(t); // malloc ���� �Ҵ���� ������(t�� ����Ű�� ���)�� ����  
	
	return 0;
}
