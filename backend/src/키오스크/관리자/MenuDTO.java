package 키오스크.관리자;

public class MenuDTO {
	
	// 1.필드
	private int mno;
	private String mname;
	// 2. 생성자
	public MenuDTO() {}
	public MenuDTO(int mno, String mname) { // 값 저장
		this.mno = mno;
		this.mname = mname;
	}
	// 3. 메소드 [ private 필드 접근 메소드 : getter , setter ]
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	
}
