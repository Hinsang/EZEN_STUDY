package java1.ch5클래스.EX16_싱글톤;

public class Singleton {

	private static Singleton s1 = new Singleton();
	
	// 싱글톤 : 객체 1개만 선언 가능한 클래스
	
	private Singleton() {
		
	}
	
	static Singleton getInstance() {
		return s1;
	}
	
}
