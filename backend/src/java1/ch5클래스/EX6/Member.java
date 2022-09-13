package java1.ch5클래스.EX6;

public class Member {
	
	String id;
	String password;
	String name;
	int point;
	
	public Member() {
		
	}
	
	// 회원가입시 사용되는 객체 생성자
	Member( String id, String password, String name, int point ) {
		this.id = id;	// this 사용하는 이유 [ 내부필드와 매개변수의 이름이 동일할경우 식별용 ]
		this.password = password;
		this.point = point;
	}
	
	// 회원정보에서 비밀번호 변경시 사용되는 객체 생성자
	Member( String password ) {
		this.password = password;
	}
	
	// 로그인[아이디, 비밀번호]시 사용되는 객체 생성자
	Member( String id, String password ) {
		this.id = id;
		this.password = password;
	}
}
