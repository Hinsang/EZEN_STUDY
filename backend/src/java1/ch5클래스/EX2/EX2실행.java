package java1.ch5클래스.EX2;

public class EX2실행 {
	public static void main(String[] args) {
		// 1. 객체 선언 [ Car 클래스 ]
		Car myCar = new Car(); // 힙 메모리를 스택에 저장
			// 1.Car : 클래스명
			// 2.myCar : 객체명[임의]
			// 3.new : 객체 선언시 사용되는 키워드
			// 4.Car() : 객체 선언시 초기값 할당
		
		// 2. 필드 호출 [ 객체명, 필드명 ]
			// 1. .(점) 연산자를 이용한 멤버 호출
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);
		
		// 3. 필드값 변경 [ 객체명.필드명 = 새로운 값 ]
		myCar.speed = 60;
		System.out.println("수정된 현재속도 : " + myCar.speed);
	}
}
