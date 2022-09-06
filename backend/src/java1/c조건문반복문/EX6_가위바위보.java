package java1.c조건문반복문;

import java.util.Random;
import java.util.Scanner;

/*
	가위바위보 게임
		[ 조건 ]
		1. 플레이어에게 가위[0], 바위[1], 보[2] 중에 입력받기
		2. 컴퓨터에게 난수[0~2] 생성 ( random.nextInt(3) )
			* Random 클래스
			* Random 변수명 = new Random()
				* 변수명.nextInt(수) : 0~수-1 까지의 난수 발생	
		3. 승리자 판단 [ 경우의수 ]
		4. 게임종료시 최종 승리자가 출력
		[ 메뉴 ]
			가위(0) 바위(1) 보(2) 종료(3)
 */

public class EX6_가위바위보 {
	public static void main(String[] args) {
		boolean result = true;
		Scanner scanner = new Scanner(System.in);
		int 플레이어;
		int 컴퓨터;
		int count = 0;
		int 게임판수 = 0;
		while(result) {			
			System.out.println("가위(0) 바위(1) 보(2) 종료(3) : ");
			플레이어 = scanner.nextInt();
			// 난수 생성 Random 클래스 사용
			Random random = new Random(); // 랜덤 객체 생성
			컴퓨터 = random.nextInt(3); // 랜덤객체를 이용한 int형 난수 생성 : 객체명.nextInt(수) 0~(수-1)까지 난수 생성
			// 경우의 수 판단
			if(플레이어 >= 0 && 플레이어 <=2) {
				if((플레이어==0 && 컴퓨터==2) || (플레이어==1 && 컴퓨터==0) || (플레이어==2 && 컴퓨터==1)) { // 승리 경우
					System.out.println("결과) 플레이어 승리");
					count++;
				} else if((플레이어==0 && 컴퓨터==0) || (플레이어==1 && 컴퓨터==1) || (플레이어==2 && 컴퓨터==2)) {
					System.out.println("결과) 무승부");
				} else {
					System.out.println("결과) 컴퓨터 승리");
					count--;
				}
				게임판수++;
			}
				else if(플레이어 == 3) {
					System.out.println("게임종료) 게임횟수 : " + 게임판수);
				if(count == 0) {
					System.out.println("무승부 입니다!!");
				} else if(count > 0) {
					System.out.println("플레이어 승리!!");
				} else {
					System.out.println("컴퓨터 승리!!");
				}
				break;
			}
			else {
				System.out.println("알 수 없는 번호입니다.");
			}
		}
	}
}
