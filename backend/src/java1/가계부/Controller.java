package java1.가계부;

import java.util.ArrayList;

public class Controller {

	// 내용추가 컨트롤러
	boolean create(String edate, int emoney, String ecomment) {
		// 매개변수 3개 --> 1개의 dto로 선언
		ExpenseDTO dto = new ExpenseDTO(0, edate, emoney, ecomment);

		return ExpenseDAO.getInstance().create(dto);
	}
	
	// 메뉴 호출 로직
	ArrayList<ExpenseDTO> read() {
		return ExpenseDAO.getInstance().read();
	}
	
	boolean update(int eno, String edate, int emoney, String ecomment) {
		ExpenseDTO dto = new ExpenseDTO(eno, edate, emoney, ecomment);
		return ExpenseDAO.getInstance().update(dto);
	}
	
	// 내용삭제 컨트롤러
	boolean delete(int eno) {
		return ExpenseDAO.getInstance().delete(eno);
	}
	
}
