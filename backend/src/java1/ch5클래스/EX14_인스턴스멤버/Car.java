package java1.ch5클래스.EX14_인스턴스멤버;

public class Car {	// 클래스 선언
	// 클래스의 멤버구성
	// 1. 필드
	String model;	// 인스턴스멤버
	int speed;		// 인스턴스멤버
	// 2. 생성자 : 클래스명과 동일하다.
		// 객체 선언시 객체필드의 초기값 설정
		// 클래스명 객체명 = new 생성자();
	Car(String model){
		// 생성자명( 인수 ) { 필드초기화 }
		this.model = model;
			// this 키워드 : 자신 (나)
				// this.필드명 : 현재 클래스의 필드 호출
				// this.메소드명 : 현재 클래스의 메소드 호출
				// this()	: 현재 클래스의 생성자 호출
	}
	// 3. 메소드
	void setSpeed( int spped ) {
		this.speed = speed;
		
	}
	
	void run() {
		for(int i = 10 ; i<=50 ; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "가달립니다.(시속 : " + this.speed+"km/h");
		}
	}
	
}
