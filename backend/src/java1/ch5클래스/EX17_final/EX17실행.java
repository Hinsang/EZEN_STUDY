package java1.ch5클래스.EX17_final;

public class EX17실행 {
	
	public static void main(String[] args) {
		
		Person p2 = new Person("123456-1234567", "홍길동");
		
		// p2.nation = "USA";			// 오류 : final 필드는 수정 불가능
		// p2.ssn = "654321-987654";
		p2.name = "홍삼원";			// final 아니기 때문에 수정 가능
		
	}
	
}
