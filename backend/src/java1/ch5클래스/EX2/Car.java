package java1.ch5클래스.EX2;

public class Car {
	// 멤버
	// 1. 필드 : 데이터를 저장하는 곳
		// 1. 기본자료형의 변수 , 객체 , 배열 , 인터페이스 등
		// 2. 초기화 : 선언과 동시에 처음값 대입
			/*
			 	초기화 생략시 기본초기화 적용
			 	정수형 : 0
			 	실수형 : 0.0
			 	논리 : false
			 	참조[객체/배열/인터페이스]
			*/
	String company = new String("현대자동차"); // 객체
	String model = new String("그랜저");
	String color = new String("검정");
	int maxSpeed = 350;						// 변수
	int speed;								// 변수 : 0
	
	// 2. 생성자
	// 3. 메소드
}
