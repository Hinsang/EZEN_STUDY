package java1.가계부;

import java.sql.Date;

public class ExpenseDTO {
	// DB 필드랑 맞추기
	private int eno;
	private String edate;
	private int emoney;
	private String ecomment;

	public ExpenseDTO() {
		
	}

	public ExpenseDTO(int eno, String edate, int emoney, String ecomment) {
		super();
		this.eno = eno;
		this.edate = edate;
		this.emoney = emoney;
		this.ecomment = ecomment;
	}

	public int getEno() {
		return eno;
	}

	public String getEdate() {
		return edate;
	}

	public void setEdate(String edate) {
		this.edate = edate;
	}

	public int getEmoney() {
		return emoney;
	}

	public void setEmoney(int emoney) {
		this.emoney = emoney;
	}

	public String getEcomment() {
		return ecomment;
	}

	public void setEcomment(String ecomment) {
		this.ecomment = ecomment;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}
	
}


