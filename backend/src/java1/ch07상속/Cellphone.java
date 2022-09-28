package java1.ch07상속;

// 상위[부모]클래스로 사용할 목적
public class Cellphone {
	// 필드
	String model;
	String color;
	
	// 생성자 [ 기본생성자(깡통생성자 생략) ]
		// 만일 빈생성자가 아닌 다른 생성자를 선언했으면 기본생성자는 자동선언이 안된다.
		// 다른 객체에서 super()로 호출하는데 기본생성자가 없으면 에러가나므로 기본생성자를 기본으로 만들어 놓는다.
	
	// 메소드
	void powerOn() { System.out.println("전원을 켭니다."); }
	void powerOff() { System.out.println("전원을 끕니다."); }
	void bell() { System.out.println("벨이 울립니다."); }
	void sendVoice(String message) { System.out.println("자기 : " + message); }
	void receiveVoice(String message) { System.out.println("상대방 : " + message ); }
	void hangUp() { System.out.println("전화를 끊습니다."); }
}
