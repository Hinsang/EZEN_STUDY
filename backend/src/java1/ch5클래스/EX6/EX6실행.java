package java1.ch5클래스.EX6;

import java.util.Scanner;

public class EX6실행 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Member[] MemberObject = new Member[100];
		
		while(true) {
			
			System.out.println("1.회원가입 2.로그인");
			int ch = scanner.nextInt();
			
			if(ch == 1) {
				System.out.println("아이디 : ");
				String id = scanner.next();
				System.out.println("비밀번호 : ");
				String password = scanner.next();
				System.out.println("이름 : ");
				String name = scanner.next();
				
				// 객체 선언
				Member signupInfo = new Member(id, password, name, 1000);
				
				int index = 0;
				for(Member temp : MemberObject) { // for( 반복변수 : 배열 )
					index++;
					if(temp == null) { // 해당 객체가 비어 있으면
						// temp = signupInfo; // 임시변수 수정 [ 원본 그대로 ]
						MemberObject[index] = signupInfo;
						// 해당 인덱스의 새로운 객체 대입 [ 객체의 주소값 대입 ]
						break;
					}
				}
			}
			else if(ch == 2) {
				System.out.println("아이디 : ");
				String id = scanner.next();
				System.out.println("비밀번호 : ");
				String password = scanner.next();
				
				// 객체 선언
				Member loginInfo = new Member(id, password);
				
				for(Member temp : MemberObject) {
					if(temp != null && 
							temp.id.equals(loginInfo.id) && 
								temp.password.equals(loginInfo.password)) {
						System.out.println("로그인성공");
						break;
					}
				}
			}
		}
		
	}
}
