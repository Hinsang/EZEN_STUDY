package java1.가계부;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
	
	Scanner scanner = new Scanner(System.in);
	Controller control = new Controller(); // 메소드 호출
	
	public static void main(String[] args) {
		
		View view = new View();
		view.menu();
		
	}
	
	public void menu() {
		
		while( true ) {
			read();
			System.out.println("[메뉴버튼] 1.추가 2.수정 3.삭제 4.검색 5.통계");
			int btn = scanner.nextInt();
			if( btn == 1 ) {
				create();
			} else if( btn == 2 ) {
				update();
			} else if( btn == 3 ) {
				delete();
			}
			
		}
	}
	
	void create() {
		System.out.println("날짜 : ");
		String edate = scanner.next();
		System.out.println("금액 : ");
		int emoney = scanner.nextInt();
		System.out.println("내용 : ");
		scanner.nextLine();
		String ecomment = scanner.nextLine();
		
		boolean result = control.create(edate, emoney, ecomment);
		if( result ) {
			System.out.println("등록성공");
		} else {
			System.out.println("등록실패");
		}
	}
	
	void read() {
		ArrayList<ExpenseDTO> list = control.read();
		System.out.println("번호\t날짜\t\t금액\t내용");
		for(ExpenseDTO menu : list ) {
			System.out.print(menu.getEno() + "\t");
			System.out.print(menu.getEdate() + "\t");
			System.out.print(menu.getEmoney() + "\t");
			System.out.println(menu.getEcomment());
		}
	}
	
	void update() {
		System.out.println("게시물 번호 선택 : ");
		int eno = scanner.nextInt();
		System.out.println("날짜 : ");
		String edate = scanner.next();
		System.out.println("금액 : ");
		int emoney = scanner.nextInt();
		System.out.println("내용 : ");
		scanner.nextLine();
		String ecomment = scanner.nextLine();
		
		boolean result = control.update(eno, edate, emoney, ecomment);
		
		if(result) {
			System.out.println("수정성공");
		} else {
			System.out.println("수정실패");
		}
		
	}
	
	void delete() {
		System.err.println("삭제할 번호 : ");
		int eno = scanner.nextInt();
		boolean result = control.delete(eno);
		if(result) {
			System.out.println("삭제성공");
		} else {
			System.out.println("삭제실패");
		}
	}
	
}
