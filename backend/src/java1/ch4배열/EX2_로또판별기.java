package java1.ch4배열;

import java.util.Random;
import java.util.Scanner;

/*
	
	로또 판별기
		1. 구매번호 : 사용자에게 6개 수 입력 -> 배열저장
			1. 1~45 사이 만 입력받기 아니면 재입력
			2. 중복 x
		2. 추첨번호 : 컴퓨터 난수 6개 생성 -> 배열저장
			1. 1~45 사이 난수
		3. 구매번호와 추첨번호와 동일한 수의 개수
	
 */

public class EX2_로또판별기 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] 구매번호 = new int[6];
		int[] 추첨번호 = new int[6];
		
		// 6번 입력받기
		for(int i=0 ; i<6 ; i++) {
			System.out.println("안내)" + (i+1) + "번째 번호 선택 : ");
			구매번호[i] = scanner.nextInt();
			if(구매번호[i] <= 0 || 구매번호[i] > 46) {
				System.err.println("안내) 선택할 수 없는 번호입니다.");
				i--; // 재입력이니까 i를 포함 안시킴
				continue; // 다시 for문 반복
			}
			
			boolean 중복체크 = false; // for문 시마다 중복체크 false;
			for(int j = 0 ; j<i ; j++) { // j가 i전짜기 하나씩 비교
				if(구매번호[j] == 구매번호[i]) {
					System.out.println("안내)이미 선택된 번호입니다.");
					중복체크 = true;
				}
			}
			if(중복체크 == true) {
				i--;
				continue; // 바로 위의 for문 반복
			}
			System.out.println(구매번호[i] + " 숫자 선택하셨습니다. ");
		} // for end
	
////////////////////////////////////////////////////////////////////////////////////		
		
		// 컴퓨터 추첨 난수 발생
		for(int i = 0 ; i<6 ; i++) {
			Random random = new Random();
			// random.nextInt(수); // 0 ~ 수 전까지 난수 발생
			// random.nextInt(끝번호)+시작번호;
			추첨번호[i] = random.nextInt(45)+1; // 1~45 사이의 난수 발생
			// [조건1] 중복체크
			for(int j = 0 ; j<i ; j++) {
				if(추첨번호[j] == 추첨번호[i]) { // 추첨번호가 중복되면 다시뽑는다.
					i--; // continue를 안넣어도 실행되는데는 문제가없는데 i는 차감시켜줘야함
					continue; // 반복문을 마저 실행하냐 다시 반복하냐의 차이
				}
			}
		}

////////////////////////////////////////////////////////////////////////////////////		
		
		// 구매번호, 추첨번호 출력
		
		for(int value : 구매번호) {
			System.out.printf("%2d\t", value); // %2d는 공백 두자리 사용하겠다는 의미 \t은 탭
		}
		System.out.println();
		
		for(int value : 추첨번호) {
			System.out.printf("%2d\t", value);
		}
		System.out.println();
	
////////////////////////////////////////////////////////////////////////////////////
		
		// 맞은 개수 출력
		int 당첨개수 = 0;
		for(int i = 0 ; i<구매번호.length ; i++) {
			
			for(int j = 0; j<추첨번호.length ; j++) {
				if (구매번호[i] == 추첨번호[j]) {
					당첨개수++;
				}
			}
		}
		System.out.println("총 당첨 개수 : " + 당첨개수);
		
	}
}


































