package java1.ch07상속;

// 하위[자식]클래스로 사용할 목적
public class DmbCellphone extends Cellphone {
	// 필드
	int channel;
	
	// 생성자
	DmbCellphone(String model, String color, int channel) {
		// super(); // 부모의 기본생성자 호출
		this.model = model;	// 부모클래스의 필드
		this.color = color;	// 부모클래스의 필드
		this.channel = channel; // 본인클래스의 필드
	}
	
	// 메소드
	void turnOnDmb() {
		System.out.println("채널 : " + 
					channel+"번 DBM 방송 수신을 시작합니다.");
	}
}
