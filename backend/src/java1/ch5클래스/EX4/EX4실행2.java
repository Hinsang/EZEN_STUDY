package java1.ch5클래스.EX4;

public class EX4실행2 {
	public static void main(String[] args) {
		// 1. 객체 선언
		// 생성자가 있기 때문에 기본생성자가 사라진다.
		Korean k1 = new Korean("박자바", "011225-1234567");
		System.out.println( k1.name );
		System.out.println( k1.ssn );
		System.out.println( k1.nation );
		
		// 2. 빈생성자로 객체 선언
		Korean k2 = new Korean();
		k2.name = "박자바";
		k2.ssn = "011225-1234567";
		
		System.out.println( k1.name );
		System.out.println( k1.ssn );
		System.out.println( k1.nation );
	}
}
