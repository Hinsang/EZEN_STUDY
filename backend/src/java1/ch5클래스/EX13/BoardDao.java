package java1.ch5클래스.EX13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BoardDao {
	
	// 1. 필드
	// JDBC 자주 사용하는 클래스/인터페이스
	Connection con; 		// DB 접속할 수 있는 인터페이스
		// con = DriverManager.getConnection("db주소", "db계쩡명", "db비밀번호")
	PreparedStatement ps;	// 접속된 DB에 SQL 연결 조작하는 인터페이스
	ResultSet rs;			// SQL 결과를 조작하는 인터페이스

	// 2. 생성자
	public BoardDao() {
		// 빈생성자에 DB 접속 코드 ( 객체 생성시 자동으로 DB 접속 )
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/boardtest",
					"root",
					"1234"
					);
		} catch (Exception e) {
			System.out.println("경고) DB 접속 실패 " + e );
		}
	}
	
	// 3. 메소드
		// 1. 등록 메소드
	boolean regist( BoardDto boardDto ) {
		
		// 1. sql 작성
		String sql = "insert "
					+ "into "
					+ "	board(b_title, b_content, b_writer, b_password, b_view)"
					+ "values( ? , ? , ? , ?, ? )";
				// ? : 변수가 들어갈 자리 [ 와일드카드 ]
			// 2. sql 연결 조작
		try {
			ps = con.prepareStatement(sql); // 위에서 작성된 sql을 ps인터페이스 연결
				// * : ? 에 변수 넣기
				ps.setString(1, boardDto.b_title); // 1 : 첫번째 ?에 , 제목
				ps.setString(2, boardDto.b_content); // 1 : 두번째 ?에 , 내용				
				ps.setString(3, boardDto.b_writer); // 1 : 세번째 ?에 , 작성자				
				ps.setString(4, boardDto.b_password); // 1 : 네번째 ?에 , 패스워드				
				ps.setInt(5, 0); // 1 : 다섯번째 ?에 , 0		게시물 등록시 조회수 0으로 시작해야되므로				
			ps.executeUpdate();				// ps 인터페이스 sql 실행
			return true; // 등록 성공시 true
			// 3. sql 결과
		} catch (Exception e) {
			System.out.println("경고) DB오류 : " + e);
			return false; // 등록 실패시 false
		}
		
	}
	
	// * 전체 게시물 수 메소드
	int getrows() {
		
		// 1. SQL 작성
		String sql = "select count(*) from board";
		// 2. SQL 연결/조작
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				return rs.getInt(1); // 레코드[=행=게시물] 개수 반환
			}
		} catch (Exception e) {
			System.out.println("경고) DB오류 : " + e);
		}
		// 3. SQL 결과
		return 0;
	}
	
		// 2. 모든 게시물 출력 테스트
	BoardDto[]  getBoardlist() {
		int count = getrows(); // 전체 게시물 수 함수 호출 -> 반환 count 저장
		BoardDto[] boardlist = new BoardDto[count]; // 배열 선언 [ 배열의 길이 = 게시물 수 ]
		
		// 1. SQL 작성
		String sql = "select * from board";
		// 2. SQL 연결/조작
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery(); // select : executeQuery() // insert, update, delete : executeUpdate()
			// ResultSet rs : 쿼리[sql결과]에 조작
				// rs -> null --.next()--> 검색된레코드[행] --.next()--> 다음레코드[행]
			int row = 0; // 인덱스 변수
			while( rs.next() ) {
				// 레코드 한개당 6개의 필드 -> 6개 변수 -> 객체 -> 배열
				// 해당 레코드의 필드를 호출해서 객체화
				int b_no = rs.getInt(1); // 해당 레코드의 첫번째 필드의 데이터 호출
				String b_title = rs.getString(2);
				String b_content = rs.getString(3);
				String b_writer = rs.getString(4);
				String b_password = rs.getString(5);
				int b_view = rs.getInt(6);
				// 객체화
				BoardDto board = new BoardDto(b_no, b_title, b_content, b_writer, b_password, b_view);
				// BoardDto board = new BoardDto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
				boardlist[row] = board;
					row++; // 인덱스 증가
			}
			
		} catch (Exception e) {
			
		}
		
		// 3. SQL 결과
		
		return boardlist;
	}
	
		// 3. 개별 게시물 출력 메소드
	BoardDto getBoard(int b_no) {
		BoardDto board = null;

		// 1. SQL 작성
		String sql = "select * from board where b_no = ?"; // 변수가 들어갈 자리라는 뜻
		// 2. SQL 연결/조작
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, b_no);
			rs = ps.executeQuery(); // ResultSet : rs
			if(rs.next()) {
				// 검색된 레코드의 필드를 객체화
				board = new BoardDto(rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getInt(6));
			}
		} catch (Exception e) {
			System.out.println("경고) DB오류 : " + e);
		}
		// 3. SQL 결과
		
		return board;
	}
	
		// 4. 수정 처리 메소드
	boolean update( BoardDto boardDto ) {
		String sql = "update board set(?, ?)";
		try {
			ps = con.prepareStatement(sql); // 위에서 작성된 sql을 ps인터페이스 연결
				ps.setString(1, boardDto.b_title); // 1 : 첫번째 ?에 , 제목
				ps.setString(2, boardDto.b_content); // 1 : 두번째 ?에 , 내용				
			ps.executeUpdate();				// ps 인터페이스 sql 실행
			return true; // 등록 성공시 true
			// 3. sql 결과
		} catch (Exception e) {
			System.out.println("경고) DB오류 : " + e);
			return false; // 등록 실패시 false
		}
	}
	
		// 5. 삭제 처리 메소드
	boolean delete( int b_no , int b_password ) {
		// sql 코드 들어갈 예정
		return false;
	}
	
}


















