package java1.ch07상속;

public class EX3_상속 {
	
	public static void main(String[] args) {
		
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("원면적 : " + calculator.areaCircle(r));
	
		Computer computer = new Computer();
		System.out.println("원면적 : " + computer.areaCircle(r));
		
	}
	
}
