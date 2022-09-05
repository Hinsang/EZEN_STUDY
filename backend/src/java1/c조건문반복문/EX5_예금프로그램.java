package java1.c조건문반복문;

import java.util.Scanner;

// 클래스 선언
public class EX5_예금프로그램 {
	
	// main 함수
	public static void main(String[] args) {
		
		boolean run = true; // 종료 하는 스위치 변수
		int balance = 0; // 금액 저장하는 변수
		Scanner scanner = new Scanner(System.in); // 입력객체 선언
		// 객체 선언 : 클래스명 객체명 = new 생성자명(매개변수)
			// 객체마다 변수와 메소드(함수) 포함 = 멤버
			// 객체의 멤버호출 ( . ) 접근연산자
		
		while( run ) {
			System.out.println("------------------------");
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.println("------------------------");
			System.out.print("선택>"); int ch = scanner.nextInt();
			if( ch == 1 ) {
				System.out.print("안내) 예금액>"); balance += scanner.nextInt();
			} else if( ch == 2 ) {
				System.out.print("안내) 출금액>");
				int money = scanner.nextInt();
				if(balance < money) {
					System.out.println("안내) 잔액이 부족합니다.");
				} else {
					balance -= money;
				}
			} else if( ch == 3 ) {
				System.out.println("안내) 잔고>" + balance);
			} else if( ch == 4 ) {
				break;	// break = 반복문 탈출	return = 함수 탈출
			} else {
				System.out.println("안내) 알수없는 번호 입니다.");
			}
		}
		System.out.println("프로그램 종료");
	}
	
}
