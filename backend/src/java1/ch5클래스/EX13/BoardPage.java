package java1.ch5클래스.EX13;

import java.util.Scanner;

public class BoardPage {

	Scanner scanner = new Scanner(System.in);
	BoardControl control = new BoardControl();
	
	public static void main(String[] args) {
		// 메소드 호출 방식 : 1. static 2. new
		BoardPage page = new BoardPage();
		page.view();
	}
	
	// 0. 메인화면
	void view() {
		BoardPage page = new BoardPage();
		while( true ) {
			page.getBoardlist();
			System.out.println("1.글쓰기 2.글제목 선택 : "); // 안내[출력-print] -> 입력[scanner]
			int btn = scanner.nextInt();
			if( btn == 1 ) {
				page.regist();
			} else if( btn == 2) {
				page.getBoard();
			} else {
				System.out.println("경고) 알 수 없는 번호입니다.");
			}
		}
	
	}
	
	// 1. 등록화면
	void regist() {
		System.out.println("===>>> 등록 페이지");
		System.out.println(">>제목 : ");
		String b_title = scanner.nextLine();
		System.out.println(">>내용 : ");
		String b_content = scanner.nextLine();
		System.out.println(">>작성자 : ");
		String b_writer = scanner.next();
		System.out.println(">>패스워드 : ");
		String b_password = scanner.next();
		scanner.nextLine(); // nextLine() 겹치는 문제 해결방안
		
		// view에서 입력받은 데이터를 control 이동
		boolean result = control.regist(b_title, b_content, b_writer, b_password);
		// control 처리된 결과의 반환값을 result에 저장한 다음 제어
		if(result) {
			System.out.println("안내) 게시물 등록 완료");
		} else {
			System.out.println("안내) 게시물 등록 실패");
		}
	}
	// 2. 모든게시물 출력화면
	void getBoardlist() {
		System.out.println("===>>> 게시판");
		System.out.println("번호\t작성자\t제목\t조회수");
		
		// control에 모든 게시물호출 메소드 호출 -> 모든 게시물의 배열을 반환을 받는다.
		BoardDto[] boardlist = control.getBoardlist();
		
		// for(int i = 0 ; i<boardlist.length ; i++) {}
		for(BoardDto dto : boardlist) {
		// for(배열의자료형 반복변수명 :  배열)
			System.out.print(dto.b_no + "\t");
			System.out.print(dto.b_writer + "\t");
			System.out.print(dto.b_title + "\t");
			System.out.print(dto.b_view + "\n");
		}
	}
	// 3. 개별게시물 출력 화면
	void getBoard() {
		System.out.println(">> 게시물번호 : ");
		int b_no = scanner.nextInt();
		BoardDto board = control.getBoard(b_no); // 입력받은 번호를 getBoard 메소드에 전달하면 해당 게시물의 정보를 가져왔는데 null이면
			if(board == null) {
				System.out.println("경고) 해당 게시물이 없습니다.");
				return;
			}
		System.out.println("===>>> 등록 페이지");
		System.out.print("제목 : " + board.b_title + "\t");
		System.out.print("작성자" + board.b_writer + "\t");
		System.out.println("조회수" + board.b_view);
		System.out.println("내용" + board.b_content);
		
		// 출력
		System.out.println("1.뒤로가기 2.수정 3.삭제 :");
		int btn = scanner.nextInt();
		BoardPage page = new BoardPage();
		if( btn == 1 ) {
			return;
		} else if( btn == 2 ) {
			page.update(b_no);
		} else if( btn == 3 ) {
			page.delete();
		} else {
			
		}
		
	}
	// 4. 수정처리 출력 화면
	void update(int b_no) {
		
		System.out.println("===>>> 수정처리 페이지");
		System.out.println("패스워드 : ");
		String b_password = scanner.next();
		System.out.println("제목 : ");
		String new_title = scanner.next();
		System.out.println("내용 : ");
		String new_content = scanner.next();
		boolean board = control.update(b_no, b_password, new_title, new_content);
		
		if(board == true) {
			System.out.println("수정처리가 완료되었습니다!!");
		} else {
			System.out.println("수정처리가 실패했습니다!!");
		}
	}
	// 5. 삭제처리 출력 화면
	void delete() {
		System.out.println("===>>> 삭제처리 페이지");
	}
	
}
