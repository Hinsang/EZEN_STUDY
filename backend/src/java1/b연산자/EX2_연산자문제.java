package java1.b연산자;

import java.util.Scanner;

public class EX2_연산자문제 {
	public static void main(String[] args) {
		
		// 문제1 : 급여 명세서
		/*
		 	문제1 : 급여 계산
		 		[조건] 입력받기 : 기본급, 수당
		 		[출력] 실수령액 = 기본급 + 수당 - 세금[기본급10%]
		 */
		/*
		  	문제2 : 지폐 개수 새기
		  		[조건] 십만원 단위의 금액을 입력받기
		  		[출력] 입력받은 금액의 지폐수 출력
		  		[예시]	356789
		  			십만원 : 3장
		  			만원 : 5장
		  			천원 : 6장
		 */
		/*
		 	문제3 : 하나의 정수를 입력받아 7의 배수 이면 '맞다' 아니면 '아니다' [ if x ]
		 	문제4 : 하나의 정수를 입력받아 홀수이면 '홀수' 아니면 '짝수' [ if x ]
		 	문제5 : 하나의 정수를 입력받아 7의 배수 이면서 짝수 이면 '참' 아니면 '거짓'
		 	문제6 : 두개의 정수를 입력받아 더 큰수 출력
		 	문제7 : 반지름을 입력받아 원 넓이 출력하기
		 		// 원 넓이 공식 = 반지름 * 반지름 * 원주율[3.14]
		 	문제8 : 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇 %인지 출력하기
		 		// 예) 54.5		84.3	입력했으면 64.285714% 출력
		 	문제9 : 사다리꼴 넓이 구하기 [윗변과 밑변 높이를 입력받아 출력하기]
		 		// 사다리꼴 계산식 -> (윗변*밑변) * 높이 / 2
		 */
		
//		Scanner 입력객체 = new Scanner(System.in);
//		Integer 수당 = 입력객체.nextInt();
//		Scanner 입력객체2 = new Scanner(System.in);
//		Integer 기본급 = 입력객체2.nextInt();
//		System.out.println(수당+기본급);
		
		// 모범답안
		Scanner scanner = new Scanner(System.in);
//		System.out.print("문제1) 기본급 : ");
//		int 기본급 = scanner.nextInt();
//		System.out.print("문제1) 수당 : ");
//		int 수당 = scanner.nextInt();
//		int 실수령액 = 기본급 + 수당 - (int)(기본급*0.1);
//		System.out.println("문제1결과 : " + 실수령액);
		
//		System.out.print("문제2) 금액 : ");
//		int 금액;
//		금액 = scanner.nextInt(); // 입력받은 데이터를 정수형으로 가져와서 변수에 대입
//			System.out.println("십만원 : " + (금액/100000) + "장"); // 각각 빼고 단위로 나눠서 장 수를 구한다.
//				금액 -= (금액/100000) * 100000;
//			System.out.println("만원 : " + (금액/10000) + "장");
//				금액 -= (금액/10000) * 10000;
//			System.out.println("천원 : " + (금액/1000) + "장");
			
	}
}
















































