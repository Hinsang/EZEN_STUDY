package java1.ch11API클래스;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Scanner;

public class EX4_달력 {
	
	Scanner scanner = new Scanner(System.in); // 입력객체
	Calendar cal = Calendar.getInstance();
	int year = cal.get(Calendar.YEAR);
	int month = cal.get(Calendar.MONTH) + 1;
	int day = cal.get(Calendar.DAY_OF_MONTH);
	Controller control = new Controller();
	
	void run() {
		while(true) {
			// ** 1일의 요일[]
			cal.set(year, month-1, 1); // 현재 월의 1일 날짜 // 0~11이므로 -1해줌
			int sweek = cal.get( Calendar.DAY_OF_WEEK ); // 현재 월의 1일의 요일
			// ** 현재날짜의 마지막 일 수 찾기
			int eday = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // 마지막 일수를 구해주는 함수
	
			// 출력 코드 //
			System.out.printf(" ====== %d 년 %d 월 의 달력 ========== \n ", year, month);
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			
			// 1일 전까지 공백 반복문
			for( int i = 1 ; i<sweek ; i++ ) {
				System.out.printf("공백\t");
			}
			
			// 1일부터 ~ 마지막 일수 까지 일수를 출력하는 반복문
			for(int i = 1 ; i<=eday ; i++) {
				System.out.printf("%2d \t", i);
				// 토요일 이후에 줄바꿈처리
				if( (sweek % 7) == 0 ) { // 7의 배수이면
					System.out.println();
				}
				sweek++; // 일수를 출력할때마다 요일도 증가처리
			}
			일정출력();
			System.out.println("\n=====================================");
			/////////////////////////////////////////////////////////
			System.out.println("\n◀이전달[1] ▶다음달[2] 검색[3] 일정추가[4] : ");
			int btn = scanner.nextInt();
				// 이전달 : 월에서 차감 [ 만일 월이 0 이면 월=12 설정 연도 1 차감 ]
			if( btn == 1 ) {
				// 다음달 : 월에서 1증가
				month--;
				if( month == 0 ) {
					month = 12;
					year--;
				}
			} else if( btn == 2 ) {
				month++;
				if( month == 13) {
					month = 1;
					year++;
				}
			} else if( btn == 3 ) {
				System.out.println("검색 연도 : ");
				int inyear = scanner.nextInt();
				System.out.println("검색 월 : ");
				int inmonth = scanner.nextInt();
				if((inyear<1900 || inyear>9999) && (inmonth<1 || inmonth>12)){
					System.out.println("경고 : 지원하지 않는 날짜 입니다.");
				} else {
					year = inyear;
					month = inmonth;
				}
			} else if( btn == 4 ) {
				일정추가();
			}
		}
		// 출력 코드 //
	}
	
	void 일정추가() { // 날짜, 메모 등
		System.out.print("날짜를 입력하세요 : ");
		String cdate = scanner.next();
		System.out.println("일정을 추가하세요 : ");
		String ccomment = scanner.next();
		
		boolean result = control.create(cdate, ccomment);
		if(result) {
			System.out.println("일정추가가 완료되었습니다.");
		} else {
			System.out.println("일정추가실패");
		}
	}
	
	void 일정출력() {
		System.out.println();
		System.out.println("번호\t날짜\t\t메모");
		String strmonth = "";
		if( month < 10 ) {strmonth = "0"+month;}
		else { strmonth = month+""; }
		HashMap< Integer, ArrayList<String> > map = DAO.getInstance().read(String.valueOf(year), strmonth);
		
		for( Integer key : map.keySet()) {
			System.out.println(key+"\t");
			// keySet() : 모든키 호출
			for( String s : map.get(key) ) {
				System.out.print(s+"\t");
			}
			
		}
	}
	
}












