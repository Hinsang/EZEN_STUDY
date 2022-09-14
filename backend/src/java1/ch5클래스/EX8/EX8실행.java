package java1.ch5클래스.EX8;

import java.util.Scanner;

public class EX8실행 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
//		scanner.next();	객체명.메소드명()	[o]
//		Scanner.next();	클래스명.메소드명()	[x]
		
		// 1. 객체 생성
		Member m1 = new Member();
			// 객체가 멤버에 접근할때 . 연산자
			m1.id = "qwe";
			m1.password = "qwe";
			m1.name = "qwe";
		Member m2 = new Member("qwe");
		Member m3 = new Member("qwe", "qwe");
		Member m4 = new Member("qwe", "qwe", "qwe");
	}
}
