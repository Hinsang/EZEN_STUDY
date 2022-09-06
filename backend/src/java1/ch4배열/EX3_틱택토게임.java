package java1.ch4배열;

import java.util.Random;
import java.util.Scanner;

public class EX3_틱택토게임 {
	
	public static void main(String[] args) {
		String[] 게임판 = { "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]" };
		Scanner scanner = new Scanner(System.in);
		boolean play = true;
		
		while(true) { // while 0
		
			// 처음 이후부터는 컴퓨터가 난수발생할때 게임판을 그리기 위해서, 처음 그리는 부분을 while문 바깥으로 빼주었다. 
			for(int i = 0 ; i<게임판.length ; i++) {
				System.out.print(게임판[i]);
				if(i % 3 == 2) {
					System.out.println();
				}
			} // for end
			while( true ) {	// while 1
				
				// 사용자 위치 입력받기 ---------------------------
				while( true ) { // 무한루프 [ 종료조건 : 승리판단 있을 경우 ]	// while 2
					System.out.print("나의 턴 [0~8선택] : ");
					int 위치 = scanner.nextInt();
					if(위치 < 0 || 위치 > 8) {
						System.out.println("안내) 선택할 수 없는 번호입니다.");
						// 게임판 그리기
						for(int i = 0 ; i<게임판.length ; i++) { // 다른키 눌러서 에러 발생하면 반복문, 게임판 다시 그려주기
							System.out.print(게임판[i]);
							if(i % 3 == 2) {
								System.out.println();
							}
						} // for end
						continue;
					}
					if(게임판[위치].equals("[ ]")) {
						게임판[위치] = "[O]";
						for(int i = 0 ; i<게임판.length ; i++) {
							System.out.print(게임판[i]);
							if(i % 3 == 2) {
								System.out.println();
							}
						} // for end
						break;
					} else {
						System.out.println("안내) 이미 알이 존재하는 위치입니다.");
					}
				} // while 2 end
				
				while( true ) {
					// 승리판정 ---------------------------
					
					// 가로
					for(int i = 0 ; i<=6 ; i+=3) {
						if(게임판[i] != "[ ]" && 게임판[i].equals(게임판[i+1]) && 게임판[i].equals(게임판[i+2])) {
							if(게임판[i].equals("[O]")) {
								System.out.println("[O]의 승리입니다!!");
								play = false;
								return;
							} else {
								System.out.println("[X]의 승리입니다!!");
								play = false;
								return;
							}
						}
					}
					// 세로
					for(int i = 0 ; i<=2 ; i++) {
						if(게임판[i] != "[ ]" && 게임판[i].equals(게임판[i+3]) && 게임판[i].equals(게임판[i+6])) {
							if(게임판[i].equals("[O]")) {
								System.out.println("[O]의 승리입니다!!");
								play = false;
								return;
							} else {
								System.out.println("[X]의 승리입니다!!");
								play = false;
								return;
							}
						}
					}
					// 대각선
					if(게임판[0] != "[ ]" && 게임판[0].equals(게임판[4]) && 게임판[0].equals(게임판[8])) {
						if(게임판[0].equals("[O]")) {					
							System.out.println("[O]의 승리입니다!!");
							play = false;
							return;
						} else {
							System.out.println("[X]의 승리입니다!!");
							play = false;
							return;
						}
					}
					if(게임판[2] != "[ ]" && 게임판[2].equals(게임판[4]) && 게임판[2].equals(게임판[6])) {
						if(게임판[2].equals("[O]")) {					
							System.out.println("[O]의 승리입니다!!");
							play = false;
							return;
						} else {
							System.out.println("[X]의 승리입니다!!");
							play = false;
							return;
						}
					}
					// 무승부
					if(게임판[0] != "[ ]" && 게임판[1] != "[ ]" && 게임판[2] != "[ ]" && 게임판[3] != "[ ]" && 게임판[4] != "[ ]" && 게임판[5] != "[ ]" && 게임판[6] != "[ ]" && 게임판[7] != "[ ]" && 게임판[8] != "[ ]") {
						System.out.println("무승부입니다!!");
						play = false;
						return;
					}	// 위에서 선행조건에 걸린다면 리턴에 걸려서 무승부가 안되게 해주었다.
					// 게임판 그리기
					
					break;	// 조건 해당 안되면 break로 while문 빠져나옴
				}
				
				// 컴퓨터 차례에 play가 true일때만 난수 발생
				if(play == true) {					
					while( true ) { // while 2
						// 컴퓨터 난수 발생 ---------------------------
						Random random = new Random();
						int 위치;
						위치 = random.nextInt(9);
						if(게임판[위치].equals("[ ]")) {
							게임판[위치] = "[X]";
							System.out.println("컴퓨터 턴");
							for(int i = 0 ; i<게임판.length ; i++) {
								System.out.print(게임판[i]);
								if(i % 3 == 2) {
									System.out.println();
								}
							} // for end
							break;
						}
					} // while 2 end
				}
				
				while( true ) {
					// 승리판정 ---------------------------
					
					// 가로
					for(int i = 0 ; i<=6 ; i+=3) {
						if(게임판[i] != "[ ]" && 게임판[i].equals(게임판[i+1]) && 게임판[i].equals(게임판[i+2])) {
							if(게임판[i].equals("[O]")) {
								System.out.println("[O]의 승리입니다!!");
								play = false;
								return;
							} else {
								System.out.println("[X]의 승리입니다!!");
								play = false;
								return;
							}
						}
					}
					// 세로
					for(int i = 0 ; i<=2 ; i++) {
						if(게임판[i] != "[ ]" && 게임판[i].equals(게임판[i+3]) && 게임판[i].equals(게임판[i+6])) {
							if(게임판[i].equals("[O]")) {
								System.out.println("[O]의 승리입니다!!");
								play = false;
								return;
							} else {
								System.out.println("[X]의 승리입니다!!");
								play = false;
								return;
							}
						}
					}
					// 대각선
					if(게임판[0] != "[ ]" && 게임판[0].equals(게임판[4]) && 게임판[0].equals(게임판[8])) {
						if(게임판[0].equals("[O]")) {					
							System.out.println("[O]의 승리입니다!!");
							play = false;
							return;
						} else {
							System.out.println("[X]의 승리입니다!!");
							play = false;
							return;
						}
					}
					if(게임판[2] != "[ ]" && 게임판[2].equals(게임판[4]) && 게임판[2].equals(게임판[6])) {
						if(게임판[2].equals("[O]")) {					
							System.out.println("[O]의 승리입니다!!");
							play = false;
							return;
						} else {
							System.out.println("[X]의 승리입니다!!");
							play = false;
							return;
						}
					}
					// 무승부
					if(게임판[0] != "[ ]" && 게임판[1] != "[ ]" && 게임판[2] != "[ ]" && 게임판[3] != "[ ]" && 게임판[4] != "[ ]" && 게임판[5] != "[ ]" && 게임판[6] != "[ ]" && 게임판[7] != "[ ]" && 게임판[8] != "[ ]") {
						System.out.println("무승부입니다!!");
						play = false;
						return;
					}	// 위에서 선행조건에 걸린다면 리턴에 걸려서 무승부가 안되게 해주었다.
					// 게임판 그리기
					
					break;	// 조건 해당 안되면 break로 while문 빠져나옴
				}
				
			} // while 1 end
		} // while 0 end
	}	
}

/*
	
	틱택토 게임
		[ 조건 ]
		1. 게임판 9칸 사용 -> 배열[0~8]
			1. String 배열	클래스는 비교연산자 불가능 -------->
				== : 그래서 문자열1.equals(문자열2)
				!= : !문자열.equals(문자열2)
		2. 사용자[O]가 알을 두고자 하는 위치[인덱스]
			1. 선택된 위치가 이미 다른 알이 존재하면 재입력 [ 중복 제거 ]
		3. 컴퓨터[X]가 난수생성[0~8]
			1. 난수의 위치가 이미 다른 알이 존재하면 재생성 [ 중복 제거 ]
		4. 승리자 판단 [ 1. 가로로 이기는 수 2. 세로로 이기는 수 3. 대각선으로 이기는 수 4. 무승부 ]
			
		
		[ 출력 ]
			1. 게임판 출력 예시
			[ ] [ ] [ ]
			[ ] [ ] [ ]
			[ ] [ ] [ ]
	
*/