package java1.ch13컬렉션프레임워크;

import java.util.ArrayList;
import java.util.LinkedList;

public class EX3_LinkedList {
	
	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>();
		LinkedList<String> list2 = new LinkedList<>();
		
		long startTime;		// 시작 시간을 저장하는 변수
		long endTime;		// 끝 시간을 저장하는 변수 
		
		// 1. ArrayList 삽입을 만번 했을때 걸리는 시간 테스트 
		startTime =	System.nanoTime();	// System.nanoTime() : 현재시스템[PC]의 시간(나노) 호출 
		for( int i = 0 ; i<1000000 ; i++ ) {
			list1.add(  0,i+"" );	// 숫자 -> 문자열 변환	: 1. 숫자+""  2. String.valueOf(숫자)
		}
		endTime = System.nanoTime();
		System.out.println( " ArrayList 10000개를 삽입하는데 걸리는 시간 : " + (endTime-startTime) +" ns");
		
		//
		startTime = System.nanoTime();
		for( int i = 0 ; i<1000000 ; i++ ) {
			list2.add( 0, i+"");
		}
		endTime = System.nanoTime();
		System.out.println( " LinkedList 10000개를 삽입하는데 걸리는 시간 : " + (endTime-startTime) +" ns");
		
	}

}
