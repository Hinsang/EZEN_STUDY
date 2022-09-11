package java1.ch4배열;

import java.util.Scanner;

public class 도서대여프로그램 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[][] user = new String[100][3]; // id, password, login token
		String[][] booklist = new String[100][3]; // bookname, bookrental, bookrentaluser
		String[][] admin = new String[1][3]; // 관리자 계정 // id, password, login token
		// test 책 목록
		booklist[0][0] = "자바";
		booklist[0][1] = "X";
		booklist[0][2] = " ";
		booklist[1][0] = "파이썬";
		booklist[1][1] = "X";
		booklist[1][2] = " ";
		admin[0][0] = "admin";
		admin[0][1] = "admin";
		admin[0][2] = "token";
		
		while(true) {
			
			System.out.println("1.회원가입 2.로그인");
			// 이렇게 hasNextInt()를 넣어주면 nextInt로 숫자가 아닌 문자열을 받았을때 에러처리를 해줄 수 있다.
			while(!scanner.hasNextInt()) { 
				scanner.next();
				System.out.println("1.회원가입 2.로그인");
			}
			int btn = scanner.nextInt();
			
			// 회원가입
			if(btn == 1) {
				System.out.println("아이디를 입력하세요 : ");
				String id = scanner.next();
				System.out.println("패스워드를 입력하세요 : ");
				String password = scanner.next();
				
				if(admin[0][0].equals("admin") && id.equals("admin")) { // next()도 equals로 비교해야한다.
					System.out.println("admin 아이디는 만들 수 없습니다.");
				}
				
				for(int row = 0 ; row<user.length ; row++) {
					// id가 이미 존재하면서 id가 일치까지 하면
					if(user[row][0] != null && user[row][0].equals(id)) {
						System.out.println("이미 존재하는 id입니다.");
						break;
					} else {
						if(user[row][0] == null && !id.equals("admin")) {
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
					if(user[row][0]!=null) {
						login = 0; // 배열 값은 있으나 idcheck를 통과하지 않았으니 존재하지 않는 id이다.
						if(user[row][0].equals(idcheck)) {
							login = 1; // passwordcheck를 통과하지 않았으므로 password가 틀렸다.
							if(user[row][1].equals(passwordcheck)) {
								login = 2; // 둘다 성공하면 로그인 완료이다.
								user[row][2] = "token"; // token이라는 것을 넣어줘서 대여할때 id를 식별해주었다.
								break;	// ☆성공에서 break 안넣어주면 for문이 끝까지 돌면서 마지막꺼 외에는 전부 실패한다.☆
							}
							break;
						}
					}
				}
				if (login == 0) {
					while(true) {
						if(admin[0][0].equals(idcheck) && admin[0][1].equals(passwordcheck)) { // 관리자모드일때
							admin[0][2] = "token";
							System.out.println("1.도서등록 2.도서목록 3.도서삭제 4.로그아웃");
							while(!scanner.hasNextInt()) { 
								scanner.next();
								System.out.println("1~4의 숫자를 입력해주세요!!");
								System.out.println("1.도서등록 2.도서목록 3.도서삭제 4.로그아웃");
							}
							int btn4 = scanner.nextInt();
							if(btn4 == 0 || btn4 >= 5) {
								System.out.println("1~4의 숫자를 입력해주세요!!");
								continue;
							}
							if(btn4 == 1) { // 도서등록
								System.out.println("등록할 책을 입력해주세요 : ");
								String createbook = scanner.next();
								for(int i = 0 ; i < booklist.length ; i++) {
									if(booklist[i][0] == null) {
										booklist[i][0] = createbook;
										booklist[i][1] = "X";
										booklist[i][2] = "";
										System.out.println("책 등록을 완료했습니다!!");
										break;
									}
								}
								System.out.println("====================================");
								System.out.println("도서명\t대여여부\t대여자");
								for(int i = 0 ; i<booklist.length ; i++) {
									if(booklist[i][0] != null) { // 값이 있을때만 
										String bookname = booklist[i][0];
										String rental = booklist[i][1];
										String username = booklist[i][2];
										System.out.println(bookname + "\t" + rental + "\t" + username);
									}
								}
							} else if(btn4 == 2) { // 도서목록
								System.out.println("====================================");
								System.out.println("도서명\t대여여부\t대여자");
								for(int i = 0 ; i<booklist.length ; i++) {
									if(booklist[i][0] != null) { // 값이 있을때만 
										String bookname = booklist[i][0];
										String rental = booklist[i][1];
										String username = booklist[i][2];
										System.out.println(bookname + "\t" + rental + "\t" + username);
									}
								}
							} else if(btn4 == 3) { // 도서삭제
								System.out.println("삭제할 도서를 입력하세요 : ");
								String deletebook = scanner.next();
								for(int i = 0 ; i<booklist.length ; i++) {
									if(booklist[i][0] != null && booklist[i][0].equals(deletebook)) {
										booklist[i][0] = null;
										booklist[i][1] = null;
										booklist[i][2] = null;
										System.out.println("해당 도서가 삭제되었습니다.");
										
										for( int j = i ; j<user.length ; j++ ) { // 독립적으로 i위치부터 각각의 값을 땡겨와야하므로 j를 선언하고 for문 돌려줌
											booklist[j][0] = booklist[j+1][0];
											booklist[j][1] = booklist[j+1][1];
											booklist[j][2] = booklist[j+1][2];
											if( booklist[j+1][0] == null ) break; // 다음배열에 아이디 없으면 break
										}
										
										break;
									}
								}
								System.out.println("====================================");
								System.out.println("도서명\t대여여부\t대여자");
								for(int i = 0 ; i<booklist.length ; i++) {
									if(booklist[i][0] != null) { // 값이 있을때만 
										String bookname = booklist[i][0];
										String rental = booklist[i][1];
										String username = booklist[i][2];
										System.out.println(bookname + "\t" + rental + "\t" + username);
									}
								}
							} else if(btn4 == 4) { // 로그아웃
								System.out.println("로그아웃 되었습니다!!");
								admin[0][2] = " ";
								break;
							}
						} else if (admin[0][0].equals(idcheck) && !admin[0][1].equals(passwordcheck)) {
							System.out.println("관리자계정 비밀번호가 일치하지 않습니다.");
							break;
						} else {
							System.out.println("존재하지 않는 id입니다.");
							break;
						}
					}
				} else if (login == 1) {
					System.out.println("비밀번호가 일치하지 않습니다.");
				} else if (login == 2) {	// 로그인 상태
					while(true) {
						boolean bookcheck = false;
						boolean rentalcheck = false;
						boolean norental = false;
						System.out.println("1.도서검색 및 대여 2.도서목록 3.도서반납 4.로그아웃");
						
						while(!scanner.hasNextInt()) {	// 반납시 공백에서 반복되는 부분 방지
							scanner.nextLine();
							break;
						}
						while(!scanner.hasNextInt()) { 
							scanner.next();
							System.out.println("1~4의 숫자를 입력해주세요!!");
							System.out.println("1.도서검색 및 대여 2.도서목록 3.도서반납 4.로그아웃");
						}
						
						int btn2 = scanner.nextInt();
						
						if(btn2 == 0 || btn2 >= 5) {
							System.out.println("1~4의 숫자를 입력해주세요!!"); // 숫자범위 입력
							continue;
						}
						if(btn2 != 4) {
							System.out.println("====================================");
							System.out.println("도서명\t대여여부\t대여자");
						}
						
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
							
							for(int row = 0 ; row<booklist.length ; row++) { // booklist 검사
								if(booklist[row][0] != null && booklist[row][0].equals(booksearch)) {
									System.out.println("1.대여한다. 2.대여하지 않는다.");
									while(!scanner.hasNextInt()) { 
										scanner.next();
										System.out.println("1~2의 숫자를 입력해주세요!!");
										System.out.println("1.대여한다. 2.대여하지 않는다.");
									}
									int btn3 = scanner.nextInt();
									
									if(btn3 == 1) {
										if(booklist[row][1].equals("O")) {	// 이미 대여한 사용자 출력
											System.out.print(booklist[row][2] + "님이 ");
											rentalcheck = true;
											break;
										}
										booklist[row][1] = "O";
										for(int x = 0 ; x<user.length ; x++) { // user 검사
											if(user[x][0] != null && user[x][2] == "token") { // 값이 비어있지않고, 로그인 토큰이 있으면
												booklist[row][2] = user[x][0]; // 북리스트에 유저리스트의 이름을 넣어준다.
												break; // break 넣어서 for문 일치하면 뒤에까지 실행이 안되게 해주었다.
											}
										}
										System.out.println("====================================");
										System.out.println("도서명\t대여여부\t대여자");
										for(int i = 0 ; i<booklist.length ; i++) {
											if(booklist[i][0] != null) { // 값이 있을때만 
												String bookname = booklist[i][0];
												String rental = booklist[i][1];
												String username = booklist[i][2];
												System.out.println(bookname + "\t" + rental + "\t" + username);
												bookcheck = true;
											}
										}
									}
									else {
										norental = true;
										break;
									}
								}
							}
							if(norental == true) {
								continue;
							}
							if(rentalcheck == true) {
								System.out.println("이미 대여중입니다!!");
								continue;
							}
							if(bookcheck == false) {
								System.out.println("검색하신 책이 없습니다.");
								continue;
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
							while(true) {
								int returnbookcheck = 0;
								
								for(int i = 0 ; i<booklist.length ; i++) {
									if(booklist[i][0] != null) { // 값이 있을때만 
										String bookname = booklist[i][0];
										String rental = booklist[i][1];
										String username = booklist[i][2];
										System.out.println(bookname + "\t" + rental + "\t" + username);
									}
								}
								System.out.println("반납할 도서를 적어주세요 : ");
								String returnbook = scanner.next(); // 책 이름 검색
								
								for(int i = 0 ; i<booklist.length ; i++) {
									if(booklist[i][0] != null) { // 북리스트 값이 있고
										if(booklist[i][0].equals(returnbook)) {
											for(int x = 0 ; x<user.length ; x++ ) {
												// for문 안에서 예외처리할때 else문 쓰면 모든 경우의 수를 다 계산하므로 주의한다.
												// 그러므로 변수에 각상태를 저장해서 for문이 완전히 끝난 상태에서 출력한다.
												if(user[x][0] != null) {
													if(booklist[i][2].equals(user[x][0]) && user[x][2].equals("token")) {
														booklist[i][1] = "X";
														booklist[i][2] = " ";
														System.out.println("반납하였습니다.");
														returnbookcheck = 0;
														break;	// 반납상태일때 break로 for문을 나간다.
													} else {
														returnbookcheck = 1;
														// for문이 다 끝날때까지 break 안하고 기다린다.
													}
												}
											}
											break; // ☆책이 있을경우 값을 반환하고 break로 2중 for문을 나간다.☆
										}
										else {
											returnbookcheck = 2;
										}
									}
								}
								
								
								
								if(returnbookcheck == 1) {
									System.out.println("자신이 빌린 책만 반납할 수 있습니다.");
								}
								if(returnbookcheck == 2) {
									System.out.println("검색하신 책이 없습니다.");
								}
								
								System.out.println("====================================");
								System.out.println("도서명\t대여여부\t대여자");
								for(int i = 0 ; i<booklist.length ; i++) {
									if(booklist[i][0] != null) { // 값이 있을때만 
										String bookname = booklist[i][0];
										String rental = booklist[i][1];
										String username = booklist[i][2];
										System.out.println(bookname + "\t" + rental + "\t" + username);
									}
								}
								break;
							}
						}
						if(btn2 == 4) {
							for(int x = 0 ; x<user.length ; x++) { // user 검사
								user[x][2] = ""; // 전체 token 초기화
							}
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
