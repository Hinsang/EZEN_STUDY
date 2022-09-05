package java1.c조건문반복문;

import java.util.Scanner;

public class EX7_별찍기 {
	
	public static void main(String[] args) {
		// 0. 입력객체 [ 1번 선언 ]
		Scanner scanner = new Scanner(System.in);
		
		// 1. 입력받은 수 만큼 * 출력
		System.out.print("문제1) 별개수 : ");
		int s1 = scanner.nextInt();
		for( int i = 1 ; i <= s1 ; i++ ) {
			System.out.print("*");
		}
		
		System.out.println("\n--------------------------------------------");
		
		// 2. 입력받은 수 만큼 * 출력 [ 3줄마다 줄바꿈 처리 ]
		System.out.print("문제2) 별개수 : ");
		int s2 = scanner.nextInt();
		for(int i = 1 ; i<=s2 ; i++) {
			System.out.print("*");
			if(i%3 == 0) {
				System.out.println();
			}
		}
		
		System.out.println("\n--------------------------------------------");
		
		// 별문제3 : 입력받은 줄 만큼 출력
		System.out.print("문제3) 줄개수 : ");
		int s3 = scanner.nextInt();
		for(int i = 1 ; i<=s3 ; i++) {	// i는 줄
			for(int j = 1 ; j<=i ; j++) {	// j는 별
				System.out.print('*');
			}
			System.out.println();
		}
		
		System.out.println("\n--------------------------------------------");
		
		// 별문제4 : 입력받은 줄 만큼 출력
		System.out.println("문제4) 줄개수 : ");
		int s4 = scanner.nextInt();
		for(int i = 1 ; i<=s4 ; i++) {
			for(int j = 1 ; j<=s4-i+1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n--------------------------------------------");
		
		// 별문제5 : 입력받은 줄 만큼 출력
		
		System.out.println("문제5) 줄개수 : ");
		int s5 = scanner.nextInt();
		for(int i = 1 ; i<=s5 ; i++) {
			for(int j = 1 ; j<=s5-i ; j++) {
				System.out.print(' ');
			}
			for(int s = 1 ; s<=i ; s++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		System.out.println("\n--------------------------------------------");
		
		// 별문제6 : 입력받은 줄 만큼 출력
		
		System.out.println("문제6) 줄개수 : ");
		int s6 = scanner.nextInt();
		for(int i = 1 ; i<=s6 ; i++) {
			for(int j = 1 ; j<=i-1 ; j++) {
				System.out.print(' ');
			}
			for(int s = 1 ; s<=s6-i+1 ; s++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		System.out.println("\n--------------------------------------------");
		
		// 별문제7 : 입력받은 줄 만큼 출력
		
		System.out.println("문제7) 줄개수 : ");
		int s7 = scanner.nextInt();
		for(int i=1 ; i<=s7 ; i++) {
			for(int j=1 ; j<=s7-i ; j++) {
				System.out.print(" ");
			}
			for(int s=1 ; s<=(i*2)-1 ; s++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 별문제8 : 입력받은 줄만큼 출력 
		
		System.out.println("문제8) 줄개수 : ");
		int s8 = scanner.nextInt();
		for(int i=1 ; i<=s8 ; i++) {
			for(int j=1 ; j<=s8-i ; j++) {
				System.out.print(" ");
			}
			for(int s=1 ; s<=(i*2)-1 ; s++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		// 별문제9 : 입력받은 줄만큼 출력
		
		System.out.println("문제9) 줄개수 : ");
		int s9 = scanner.nextInt();
		for(int i=1 ; i<=s9 ; i++) {
			for(int j=1 ; j<i ; j++) {
				System.out.print(" ");
			}
			for(int s=s9*2+1 ; s>=2*i+1 ; s--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 별문제10 : 입력받은 줄만큼 출력
		
		System.out.println("문제10) 줄개수 : ");
		int s10 = scanner.nextInt();
		for(int i=1 ; i<=s10 ; i++) {
			for(int j=1 ; j<=s10-i ; j++) {
				System.out.print(" ");
			}
			for(int s=1 ; s<=(i*2)-1 ; s++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i=1 ; i<=s10 ; i++) {
			
			for(int j=1 ; j<=i ; j++) {
				System.out.print(" ");
			}
			for(int s=(s10*2)-1 ; s>=i*2+1 ; s--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		// 별문제11 : 입력받은 줄만큼 출력 [ 입력받은 행/열 동일 ] 
		
		System.out.println("문제11) 줄개수 : ");
		int s11 = scanner.nextInt();
		for(int i=1 ; i<=s11 ; i++) {
			for(int j=1 ; j<=i ; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			
			for(int s=1 ; s<=(i*2)-1 ; s++) { System.out.print("*"); }
		}
		System.out.println();
	}
	
}























