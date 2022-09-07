package java1.ch4배열;

import java.util.Scanner;

public class 도서대여프로그램 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[][] user = new String[100][2];
		String[][] booklist = new String[100][3];
		booklist[0][0] = "자바";
		booklist[0][1] = "X";
		booklist[0][2] = " ";
		booklist[1][0] = "파이썬";
		booklist[1][1] = "X";
		booklist[1][2] = " ";
		
		while(true) {
			System.out.println("1.회원가입 2.로그인");
			int btn = scanner.nextInt();
			
			// 회원가입
			if(btn == 1) {
				System.out.println("아이디를 입력하세요 : ");
				String id = scanner.next();
				System.out.println("패스워드를 입력하세요 : ");
				String password = scanner.next();
				
				for(int row = 0 ; row<user.length ; row++) {
					
					// id가 이미 존재하면서 id가 일치까지 하면
					if(user[row][0] != null && user[row][0].equals(id)) {
						System.out.println("이미 존재하는 id입니다.");
						break;
					} else {						
						if(user[row][0] == null) {							
							user[row][0] = id;
							user[row][1] = password;
							System.out.println("가입이 완료되었습니다!!");
							break;
						}
					}
						
				}
			}
			// 로그인
			if(btn == 2) {
				System.out.println("아이디를 입력하세요 : ");
				String idcheck = scanner.next();
				System.out.println("패스워드를 입력하세요 : ");
				String passwordcheck = scanner.next();
				int login = 0;	// ☆for문 안에서 계속 반복되므로 계속 변하는 변수에 저장해서 하나의 값 출력하기☆
				for(int row = 0 ; row<user.length ; row++) {
					// for(int i = 0; i<user.length; i++) {	
					if(user[row][0]!=null) {						
						login = 0; // 배열 값은 있으나 idcheck를 통과하지 않았으니 존재하지 않는 id이다.
						if(user[row][0].equals(idcheck)) {
							login = 1; // passwordcheck를 통과하지 않았으므로 password가 틀렸다.
							if(user[row][1].equals(passwordcheck)) {
								login = 2; // 둘다 성공하면 로그인 완료이다.
							} 
						}
					}
					// }
				}
				if (login == 0) {
					System.out.println("존재하지 않는 id입니다.");
				} else if (login == 1) {
					System.out.println("비밀번호가 일치하지 않습니다.");
				} else if (login == 2) {	// 로그인 상태
					while(true) {
						System.out.println("1.도서검색 2.도서목록 3.도서대여 4.도서반납 5.로그아웃");
						int btn2 = scanner.nextInt();
						
						System.out.println("====================================");
						System.out.println("도서명\t대여여부\t대여자");
						
						if(btn2 == 1) {
							for(int i = 0 ; i<booklist.length ; i++) {
								if(booklist[i][0] != null) { // 값이 있을때만 
									String bookname = booklist[i][0];
									String rental = booklist[i][1];
									String username = booklist[i][2];
									System.out.println(bookname + "\t" + rental + "\t" + username);
								}
							}
							System.out.println("책이름을 검색하세요 : ");
							String booksearch = scanner.next();
							
							for(int row = 0 ; row<booklist.length ; row++) {
								if(booklist[row][0] != null && booklist[row][0].equals(booksearch)) {
									System.out.println("1.대여한다. 2.대여하지 않는다.");
									int btn3 = scanner.nextInt();
									
									
									if(btn3 == 1) {
										
									}
									else {
										break;
									}
								}
							}
						}
						if(btn2 == 2) {
							for(int i = 0 ; i<booklist.length ; i++) {
								if(booklist[i][0] != null) { // 값이 있을때만 
									String bookname = booklist[i][0];
									String rental = booklist[i][1];
									String username = booklist[i][2];
									System.out.println(bookname + "\t" + rental + "\t" + username);
								}
							}
						}
						if(btn2 == 3) {
							System.out.println("도서대여");
						}
						if(btn2 == 4) {
							System.out.println("도서반납");
						}
						if(btn2 == 5) {
							System.out.println("로그아웃!!");
							break;
						}
					}
				}
			}
			continue;
		}
	}
}
























