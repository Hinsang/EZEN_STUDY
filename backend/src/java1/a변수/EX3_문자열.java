package java1.a변수;

public class EX3_문자열 {
	public static void main(String[] args) {
//		char 문자 = "자바"; // 오류발생 : char는 문자 한개만 저장할 수 있다.
		String 문자열 = "자바";
		
		String name = "홍길동";	System.out.println(name);
		String job = "프로그래머";	System.out.println(job);
		
		System.out.println("안녕하세요");	// println : 출력후 줄바꿈처리 O
		System.out.print("자바입니다.");	// print : 출력후 줄바꿈처리 X
		System.out.println("하하하하하.");	// println : 출력후 줄바꿈처리 O
		
		System.out.println("번호\t이름\t직업");
		System.out.print("행 단위 출력\n");
		System.out.print("행 단위 출력\n");
		System.out.println("우리는 \"개발자\" 입니다.");
		System.out.print("봄\\여름\\가을\\겨울");
		System.out.println("");
		
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|  ");
		System.out.println("");
		
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");
		System.out.println("");
		
		System.out.print("\t\t[[ 출석부 ]]");
		System.out.print("\n------------------------------");
		System.out.print("\n이름\t\t1교시\t\t2교시\t\t3교시");
		System.out.print("\n유재석\t출석\t\t결석\t\t출석");
		System.out.print("\n강호동\t출석\t\t결석\t\t출석");
		System.out.print("\n------------------------------");
	}
}
/*
	문자[한글자] char : '자'
	문자열[두글자 이상] String : "자바 입니다"
 
 	console 화면에 출력 함수
 	print()		: 출력
 	println()	: 출력 하고 줄바꿈[\n] 포함
 	printf()	: 형식문자 출력
	
	- 제어[이스케이프] 문자
		1. \n : 줄바꿈	2.\t : 들여쓰기[tab 5칸]
		3. \" : " 출력
			"홍길동" ----> 홍길동
			"\"홍길동\"" ----> "홍길동
 */
