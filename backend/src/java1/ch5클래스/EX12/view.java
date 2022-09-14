package java1.ch5클래스.EX12;

import java.util.Scanner;

// print, scanner : 입/출력

public class view { // 화면구현

	// * 함수 밖에 canner 선언한 이유 : 모든 함수에서 같이 사용할려고 [ 필드 ]
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		start();
		
		// new를 써서 메모리 할당하는 방법
		// view view = new view();
		// view.start();
	}
	
	// 1. 프로그램 시작하는 화면 구현 함수 [ 매개변수x / 반환x / 정적메소드: 호출시 객체 생략 가능 ]
	static void start() {
		while(true) { // 무한루프
			view_boardlist(); // 무조건 view_boardlist(); 함수 호출
			System.out.println("1.글쓰기 2.글보기 : ");
			int ch = scanner.nextInt();
			if(ch == 1) {
				view_regist(); // 만일 1번 입력했으면 view_regist();함수 호출
			}
			else if(ch == 2) {
				view_board(); // 만일 2번 입력했으면 view_board(); 함수 호출
			}
			else {
				System.out.println("안내) 알 수 없는 번호입니다.");
			}
		}
	}
	
	// 2. 게시물을 등록하는 화면 구현 함수
	static void view_regist() {
		System.out.println("------------- 게시물 등록 페이지 ------------");
		System.out.println("제목 : ");
		String title = scanner.next();
		System.out.println("내용 : ");
		String content = scanner.next();
		System.out.println("작성자 : ");
		String writer = scanner.next();
		System.out.println("비밀번호 : ");
		String password = scanner.next();
		
		// 메소드 호출
		boolean result =
		Controller.con_regist(title, content, writer, password);
		
		if(result) {
			System.out.println("안내) 게시물 등록 완료");
		} else {
			System.out.println("안내) 게시물 등록 실패 [ 관리자에게 문의 ]");
		}
		
	}
	
	// 3. 게시물을 상세페이지 화면 구현 함수
	static void view_board() {
		System.out.println("게시물번호 선택 : ");
		int bnum = scanner.nextInt();
		System.out.println("------------- 게시물 상세 페이지 ------------");
		
		Board temp = Controller.boardlist[bnum]; // 새로운객체[임시객체] = 입력받은 인덱스의 객체
		if(temp == null) {
			System.out.println("안내) 없는 게시물 번호입니다."); // 만약에 해당 객체가 null이면
			return;
		}
		System.out.println("제목 : " + temp.title + "		작성자 : " + temp.writer);
		System.out.println("내용 : " + temp.content);
		System.out.println("1.뒤로가기 2.수정 3.삭제 선택 : ");
		int ch = scanner.nextInt();
		
		if(ch == 1) { }		
		else if(ch==2) {
			view_update(bnum);
		}	// 수정 함수 호출
		else if(ch==3) {
			view_delete(bnum); // 삭제 화면 함수 호출 [ 매개변수 1개 int = 현재 보고 있는 게시물 ]
		}	// 삭제 함수 호출
		else {
			
		}
		return;
	}
	
	// 4. 게시물 목록 화면 구현 함수
	static void view_boardlist() {
		System.out.println("------------- 게시물 목록 페이지 ------------");
		System.out.println("번호\t\t작성자\t\t제목");
		for(int i = 0 ; i<Controller.boardlist.length ; i++) {
			Board temp = Controller.boardlist[i];
				// temp 객체의 목적 : 코드 줄이기
			if( temp != null) {				
				System.out.print( i + "\t\t");
				System.out.print( temp.writer + "\t\t"); // temp 미사용시 Controller.boardlist[i].writer
				System.out.print( Controller.boardlist[i].title + "\n");
			}
		}
	}
	
	static void view_delete(int bnum) {
		System.out.println("비밀번호 : ");
		String password = scanner.next();
		boolean result = Controller.con_delete(bnum, password);
		if(result) {
			System.out.println("안내) 게시물 삭제 성공");
		} else {
			System.out.println("안내) 게시물 삭제 실패");
		}
	}
	
	static void view_update(int bnum) {
		System.out.print("비밀번호 : ");
		String password = scanner.next();
		System.out.print("수정할 제목 : ");
		String title = scanner.next();
		System.out.print("수정할 내용 : ");
		String content = scanner.next();
	
		boolean result = Controller.con_update(bnum, password, title, content);
		
		if(result) {
			System.out.println("안내) 게시물 수정 성공");
		} else {
			System.out.println("안내) 게시물 수정 실패");
		}
	}
	
	// 7. 비밀번호 검증 함수 ????
	
}










