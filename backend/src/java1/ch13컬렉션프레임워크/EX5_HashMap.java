package java1.ch13컬렉션프레임워크;

import java.util.HashMap;

public class EX5_HashMap {
	
	public static void main(String[] args) {
	
		// 1. HashMap< key , value > 선언 
		HashMap<String,Integer> map = new HashMap<>();
		
		// 2.  entry(키,값) 저장		{ 키 = 값 , 키2=값2 , 키3=값3 }
			// * 키 (해시코드) : 중복 불가능   * 값 : 중복 가능 
			// 만일 키가 중복이면 기존 엔트리 제거후 새로운 엔트리 추가 
		map.put( "신용권" , 85 );	System.out.println( map.toString() );
		map.put( "홍길동" , 90 );	System.out.println( map.toString() );
		map.put( "동장군" , 80 );	System.out.println( map.toString() );
		map.put( "홍길동" , 95 );	System.out.println( map.toString() );
		System.out.println("엔트리(키:값)수 : " + map.size() );
		
		// 3. 호출 [ .get(키) ]
			// 키 통해 값을 호출할수 있다.
		System.out.println(" .get(키) -> 값 반환 : " + map.get("신용권") );
		
		// 4. 모든 key 호출 [ .keySet() ]
		for( String key : map.keySet() ) {
			System.out.println("키 : " + key );
			System.out.println("값 : " + map.get(key) );
		}
		// 5. 
		map.remove("홍길동");
		// 6.
		map.clear();
		
	}
}
