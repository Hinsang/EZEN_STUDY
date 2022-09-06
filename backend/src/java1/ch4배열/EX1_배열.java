package java1.ch4배열;

public class EX1_배열 {
	public static void main(String[] args) {
		int[] scores = { 83, 90, 87 };	// int형 배열 선언, 3개 값 초기화, 인덱스 0~2
		System.out.println("배열[0] : " + scores[0]);
		System.out.println("배열[1] : " + scores[1]);
		System.out.println("배열[2] : " + scores[2]);
		System.out.println("배열 : " + scores);	// 16진수 메모리 호출
		
		// 배열 반복문 활용
		int sum = 0;
		for(int i = 0 ; i<scores.length ; i++) { // i는 0부터 배열의길이 미만까지 1씩 증가
			sum += scores[i]; // 인덱스 돌려서 총합 계산
		}
		System.out.println("총합 : " + sum);
		System.out.println("총합 : " + (sum/3.0));
		// 1. sum/3 	-> int/int 		-> int
		// 2. sum/3.0 	-> int/double 	-> double
		
		// 예2
		int[] 배열 = new int[3]; // new 연산자를 이용한 선언 // int형 3개를 저장할 수 있는 배열 [ 고정길이 ]
		
		for(int i = 0 ; i<배열.length ; i++) {
			System.out.println(배열[i]);
		}
		
		// 배열의 각 인덱스에 데이터 넣기
		배열[0] = 100;
		배열[1] = 93;
		배열[2] = 20;
		
		// 배열내 모든 인덱스 호출
		for(int i = 0 ; i<배열.length ; i++) {
			System.out.println(배열[i]);
		}
		
		for(int value : 배열) {
			// for(반복변수 : 배열명) : 배열내 0번 인덱스부터 마지막인덱스까지 반복변수에 하나씩 대입
			System.err.println(value);
		}
		
	}
}

/*
	배열
	제공받은 메소드 X ---> [js] push, splice
	
	배열 선언
		1. 타입[] 배열명; 2. 타입 배열명[];
	
	배열 생성
		1. 타입[] 배열명 = { 값0, 값1, 값2, 값3, ~~ } : 배열선언과 동시에 값 대입
			* 배열에 미리 값 넣을때
		2. 타입[] 배열명 = new 타입[ 길이 ]			: 배열의 길이만큼 선언[ 초기값 ]
			* 배열의 길이를 미리 설정할때
												정수:0 실수:0.0 클래스:null
	
	배열 호출										
		배열명 : 배열의 메모리 주소(번지)
			1. 배열명[인덱스번호]
		특정 인덱스의 데이터 변경[수정]
			1. 해당 인덱스에 새로운 데이터를 넣어준다.
	for(반복변수 : 배열명) : 배열내 0번 인덱스부터 마지막인덱스까지 반복변수에 하나씩 대입
*/

















