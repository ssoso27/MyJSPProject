#include <stdio.h>
#include <stdlib.h>

// ���� 2. Java �䳻����
typedef struct human {
	int age;
	char *name;
	void (*say) (int);
	int (*add) (int, int);
} Human; 

void sayBirthday(int birthday) {
	printf("�� ����������� %d �Դϴ�. \n", birthday);
}

int addNumber(int n1, int n2) {
	return n1 + n2;
}

Human* new_Human(int age, char *name) {
	Human *anyone;
	anyone = malloc( sizeof(Human) );
	
	anyone->age = age;
	anyone->name = name;
	anyone->say = sayBirthday;
	anyone->add = addNumber;
	
	return anyone;
} 

int main() {
	Human *sohee;
	sohee = new_Human(24, "SOHEE");
	
	printf("%d \n", sohee->age);
	printf("%s \n", sohee->name);
	sohee->say(960829);
	printf("%d \n", sohee->add(3, 5));
	
	free(sohee);
}
