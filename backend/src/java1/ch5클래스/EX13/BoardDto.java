package java1.ch5클래스.EX13;

public class BoardDto {
	
	int b_no;
	String b_title;
	String b_content;
	String b_writer;
	String b_password;
	int b_view;
	
	public BoardDto() {
		
	}

	public BoardDto(int b_no, String b_title, String b_content, String b_writer, String b_password, int b_view) {
		super();
		this.b_no = b_no;
		this.b_title = b_title;
		this.b_content = b_content;
		this.b_writer = b_writer;
		this.b_password = b_password;
		this.b_view = b_view;
	}
	
}
