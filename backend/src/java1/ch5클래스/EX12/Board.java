package java1.ch5클래스.EX12;

public class Board { // class model
	
	String title;
	String content;
	String writer;
	String password;
	int view;
	
	public Board() {
		
	}

	public Board(String title, String content, String writer, String password, int view) {
		super();
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.password = password;
		this.view = view;
	}
	
}
