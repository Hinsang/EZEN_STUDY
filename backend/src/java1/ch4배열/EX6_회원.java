package java1.ch4배열;

import java.util.Scanner;

public class EX6_회원 {
	public static void main(String[] args) {
		
		String[][] numberlist = new String[100][4]; // 문자열 400개를 저장할 수 있는 배열 선언
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("==================== 회원제 페이지 ===================");
			System.out.println("메뉴 : 1.로그인 2.회원가입 3.아이디찾기 4.비밀번호찾기");
			System.out.println("==================== 회원제 페이지 ===================");
			System.out.print("선택 : ");
			int btn = scanner.nextInt();
			
			if(btn == 1) {
				
			} else if (btn == 2) {
				
			} else if (btn == 3) {
				
			} else if (btn == 4) {
				
			} else {
				System.out.println("안내) 알 수 없는 번호입니다.");
			} // 그외 입력했을때
		}
		
	}
}
