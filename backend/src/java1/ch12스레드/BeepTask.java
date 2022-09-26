package java1.ch12스레드;

import java.awt.Toolkit;

public class BeepTask implements Runnable{
					// implements : 구현
					// Runnable : 스레드 인터페이스
	// 1. 필드
	// 2. 생성자
	// 3. 메소드[ 스레드 제공하는 함수 = run ]
	public void run() {
		// 싱글스레드 : 소리가 5번 출력되고 문자열 5번 출력된다.
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // toolkit : console ui 제공
		for( int i = 0 ; i<10 ; i++) {			
			toolkit.beep(); // 비프음 소리 함수 [ 소리 속도보다 반복문이 더 빠르다.[스레드가 더 빠르다.] ]
			try {
				Thread.sleep(500); // Thread.sleep(밀리초) : 밀리초 만큼 혈재 스레드 일시정지
				// .sleep(밀리초) : 스레드 일시정지 [ 무조건 예외처리 발생 ]
			} catch (Exception e) {
				
			}
		}
	}
	
}
