package java1.ch5클래스.EX14_인스턴스멤버;

public class EX14실행 {
	
	public static void main(String[] args) {
		
		// 1. 객체 선언
		// 클래스명 객체명 = new 생성자
		Car myCar = new Car("포르쉐");
		Car yourCar = new Car("벤츠");
		
		// 2. 객체의 (인스턴스) 멤버 호출
		myCar.run();	// 서로 다른 run 메소드 호출
		yourCar.run();
		
	}
	
}
