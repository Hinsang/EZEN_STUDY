package java1.ch5클래스.EX5;

public class Car {
	
	// 목적 : 반복적인 코드 , 식별용 [ 내부필드와 매개변수의 변수명이 동일할 때 ]
	// this.필드명 : 현재 클래스의 필드 호출
	// this( ) : 현재 클래스의 생성자 호출
	// this.메소드명 : 현재 클래스의 메소드 호출
	
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자
		// 오버로딩 : 동일한 이름으로 선언 [ 매개변수 따라 구별 ]
		// 생성자에서 사용되는 매개변수명은 필드명과 동일하게 작성 [ this.필드명 ]
		// 1. 빈생성자 : 매개변수 가 없는 생성자[기본생성자]
	
	// 매개변수 개수에 따라서 자동으로 따라옴 (오버로딩)
	Car() {
		
	}
	Car(String model) {
		this.model = model;
	}
	Car(String model, String color) {
		this( model, color, 5000); // 생성자 호출
	}
	Car(String model, String color, int maxSpeed) {
		
	}
}
