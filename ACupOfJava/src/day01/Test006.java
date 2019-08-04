package day01;

public class Test006 {
	public static void main(String[] args) { 
		double j = 10.0;
		System.out.println(j);
		System.out.println(j + 5); // 5 int -> 5.0 double �ڵ� ����ȯ
		System.out.println( (int) j + 5 ); // j double -> int�� ���� ����ȯ
	}
}

/*
	byte < short < int < long < float < double
	���� Ÿ�� -> ū Ÿ���� �ڵ���ȯ ����,
	ū Ÿ�� -> ���� Ÿ���� ������ȯ �ʿ�.
	
	"�⺻������, ���� Ÿ�� �������� ���� ����."
*/