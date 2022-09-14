package java1.ch5클래스.EX10;

public class Car {
	
	int gas; // gas 수량을 저장하는 int형 필드[변수]
	
	// 1. 반환값x 매개변수 1개
	void setGas( int gas ) {
		this.gas = gas;
		return;
	}
	
	// 2. 반환값 boolean 매개변수x
	boolean isLeftGas() {
		if( gas == 0 ) {
			System.out.println("gas가 없습니다.");
			return false; // 가스 없다는 의미 // 함수 종료
		} else {
			System.out.println("gas가 있습니다.");
			return true; // 가스가 있따는 의미 // 함수 종료
		} // else end
	} // m end
	
	// 3. 반환값 x 매개변수 x
	void run() {
		while(true) {
			
			if( gas > 0 ) { // 만일 gas변수가 0보다 크면
				System.out.println("달립니다.[gas잔량:"+gas+"]");
				gas -= 1; // 가스 1 감소
			} else {
				System.out.println("달립니다.[gas잔량:"+gas+"]");
				return; // 함수종료 // 무한루프 종료
			}
			
		}
		// while 이후에 코드가 존재하지 않기때문에 return 문과 break문은 같다.
	}
	
}
