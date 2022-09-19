package java1.ch5클래스.EX15_정적멤버;

public class EX15실행 {
	
	public static void main(String[] args) {
		
		// 정적 멤버 호출
			// 클래스명.정적멤버
		double result = Calculator.pi2;
		Calculator.plus2(10, 5);
		Calculator.minus2(10, 5);
			// 주의할점 : static 멤버(필드,메소드)에서 static 아닌 멤버 호출X
			// 해결방안 : static 멤버(필드,메소드)에서 static 아닌 멤버 호출할때 객체 이용한 멤버 호출
		
		// 인스턴스 멤버 호출
			// 객체 생성
		Calculator c = new Calculator();
		double result2 = c.pi2;
		c.plus1(10, 5);
		c.minus1(10, 5);
		
	}
	
}
