package EX7_비회원제게시판.java.copy;

public class Board {

	// 클래스멤버
	// 1. 필드
	String title; // 상자크기[자료형] 상자이름[변수명]
	String content;
	String writer;
	String password;
	int view;
	
	// 2. 생성자
		// 1. 빈 생성자 [ 기본생성자 ]
	Board() {
	
	}
		// 2. 풀 생성자 [ 모든 매개변수를 갖는 생성자 ]
	Board(String title, String content, String writer, String password, int view) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.password = password;
		this.view = view;
	}
	
	// 3. 메소드
	
}
