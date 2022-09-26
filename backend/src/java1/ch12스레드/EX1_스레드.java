package java1.ch12스레드;

import java.awt.Toolkit;

public class EX1_스레드 {

	public static void main(String[] args) {
		// 스레드 : 한가닥 실 의미 [ 코드 읽는 하나의 흐름 ]
		// 멀티스레드 : 코드 읽는 여러개의 흐름
		// main스레드 : main함수 시작될때 실행 ---> return시 스레드 종료
		
		// 싱글스레드 : 소리가 5번 출력되고 문자열 5번 출력된다.
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // toolkit : console ui 제공
		for( int i = 0 ; i<10 ; i++) {			
			toolkit.beep(); // 비프음 소리 함수 [ 소리 속도보다 반복문이 더 빠르다.[스레드가 더 빠르다.] ]
			try {
				Thread.sleep(500); // Thread.sleep(밀리초) : 밀리초 만큼 혈재 스레드 일시정지
				// .sleep(밀리초) : 스레드 일시정지 [ 무조건 예외처리 발생 try~catch]
			} catch (Exception e) {
				
			}
		}
		
		for(int i = 0 ; i<5 ; i++) {
			try {
				System.out.println("띵");
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
		
		System.out.println(" -- 멀티스레드 시작 --");
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start(); // run 메소드 호출
		
		// main스레드 생성된스레드 실행 후 다음코드 실행
		
		for(int i = 0 ; i<5 ; i++) {
			try {
				System.out.println("띵");
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
		
		System.out.println(" -- 익명구현 객체 멀티스레드 -- ");
		// 익명구현 객체 - 1회용 [ 이름 없으니까 다른곳에 호출 불가능 ]
		Thread thread2 = new Thread( new Runnable() {
			
			public void run() {
				for(int i = 0 ; i<5 ; i++) {
					try {
						System.out.println("띵");
						Thread.sleep(500);
					} catch (Exception e) {
						
					}
				}
			}
		});
			
		System.out.println(" -- 익명구현 객체 멀티스레드 -- ");
		// 익명구현 객체 - 1회용 [ 이름 없으니까 다른곳에 호출 불가능 ]
		Thread thread3 = new Thread( new Runnable() {
			
			public void run() {
				for(int i = 0 ; i<5 ; i++) {
					try {
						System.out.println("띵");
						Thread.sleep(500);
					} catch (Exception e) {
						
					}
				}
			}
		});
			
		thread3.start();
		
		return; // main 함수 종료
		
	}
	
}

/*

	운영체제에서 프로그램단위 [멀티태스킹] ex) 메모장 여러개 키는 것
	프로그램단위에서 나눠지는 것 [멀티프로세스] ex) 작업관리자에서 프로그램 눌렀을때 나눠지는 것
	프로세스에서 나눠지는 것 [쓰레드] ex) 각각의 기능처리
	멀티스레드 흐름단위 - 사다리타기(병렬 우선순위 O)
	
*/
