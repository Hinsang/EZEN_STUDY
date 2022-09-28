package java1.ch07상속;

public class Computer extends Calculator {
	
	int 자식변수;
	
	@Override
	double areaCircle( double r ) {
		System.out.println("컴퓨터 객체의 원 넓이함수 실행");
		부모변수++;
		return Math.PI * r * r;
	}
	
}
