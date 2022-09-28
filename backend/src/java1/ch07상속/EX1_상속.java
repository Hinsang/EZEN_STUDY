package java1.ch07상속;

public class EX1_상속 {
	
	public static void main(String[] args) {
		
		// 객체 생성, 호출, 초기화
		DmbCellphone dmbCellphone
			= new DmbCellphone("자바폰", "검정", 10);
		
		// 객체가 상속받은 필드 호출
		System.out.println("모델:" + dmbCellphone.model);
		System.out.println("색상:" + dmbCellphone.color);
		
		// 본인 클래스
		System.out.println("색상:" + dmbCellphone.channel);
		
		// 객체가 상속받은 메소드 호출
		dmbCellphone.powerOn();
		dmbCellphone.bell();
		dmbCellphone.sendVoice("여보세요.");
		dmbCellphone.receiveVoice("안녕하세요.");
		dmbCellphone.sendVoice("아~~ 예 반갑습니다.");
		dmbCellphone.hangUp();
		
		// 본인 클래스
		dmbCellphone.turnOnDmb();
	}
	
}
