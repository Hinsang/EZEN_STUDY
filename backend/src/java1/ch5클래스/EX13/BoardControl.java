package java1.ch5클래스.EX13;

public class BoardControl {

	BoardDao boardDao = new BoardDao(); // 현재 클래스에 존재하는 메소드들이 dao객체의 메소드 호출용
	
	// 1.
	boolean regist( String b_title , String b_content , String b_writer , String b_password ) {
		// 로직 or DAO 호출 작성 예정
		
		// 1. 4개의 매개변수 받는다.
		// 2. 변수 없을때 이동하면 매개변수 코드가 많으니까 객체화 하자
		
		// 메소드 실행결과를 boardDto에 저장
		BoardDto boardDto = new BoardDto(0, b_title, b_content, b_writer, b_password, 0);
		// 3. 유효성검사 [ 추후에 ]
		// 4. DB 처리
		// boardDao로 boardDto 넘겨줌
		boolean result = boardDao.regist(boardDto);
		return result;
	}

	// 2.
	BoardDto[] getBoardlist() {
		// 로직 or DAO 호출 작성 예정
		BoardDto[] boardlist = null;
		boardlist = boardDao.getBoardlist();
		// dao에서 값 받아서 변수에 저장 후 리턴
		return boardlist;
	}
	// 3.
	BoardDto getBoard(int b_no) {
		BoardDto board = null;
		board = boardDao.getBoard(b_no);
		return board;
	}
	// 4.
	boolean update( int b_no , String b_password, String new_title, String new_content ) {
		
		BoardDto boardDto = new BoardDto(b_no, new_title, new_content, null , b_password, 0 );
		
		boolean result = boardDao.update(boardDto);
		
		return result;
	}
	// 5.
	boolean update( int b_no , String b_password ) {
		// sql 코드 들어갈 예정
		return false;
	}
	
}
