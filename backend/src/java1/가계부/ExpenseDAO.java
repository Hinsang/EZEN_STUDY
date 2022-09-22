package java1.가계부;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ExpenseDAO {
	
	// 필드
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private static ExpenseDAO dao = new ExpenseDAO(); // 싱글톤 객체 [ 생성자를 private ]
	// 이 생성자의 결과값을 dao로 같은 static 전달해서 리턴해준다. 
	
	// 생성자
	private ExpenseDAO() { // private 싱글톤으로 외부접근 제한
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test",
					"root",
					"1234"
				);
		} catch (Exception e) {
			System.out.println("DB오류 : " + e);
		}
	}
	
	// 3. 메소드 ( DAO 결과를 반환하는 메소드 생성 )
	public static ExpenseDAO getInstance() { // 반환자료형 ExpenseDAO
		return dao;
	}
	
	boolean create( ExpenseDTO dto ) {
		String sql = "insert into expense values( null, ?, ?, ? )";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getEdate());
			ps.setInt(2, dto.getEmoney());
			ps.setString(3, dto.getEcomment());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
	
	ArrayList<ExpenseDTO> read() {
		ArrayList<ExpenseDTO> list = new ArrayList<>();
		String sql = "select * from expense";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while( rs.next() ) {
				ExpenseDTO expense = new ExpenseDTO(
							rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4)
						);
				list.add(expense);
			}
			return list;
		} catch (Exception e) {
			return list;
		}
	}
	
	boolean update( ExpenseDTO dto ) {
		String sql = "update expense set edate = ?, emoney = ?, ecomment = ? where eno = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getEdate());
			ps.setInt(2, dto.getEmoney());
			ps.setString(3, dto.getEcomment());
			ps.setInt(4, dto.getEno());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
	
	boolean delete( int eno ) {
		String sql = "delete from expense where eno = ?"; // 삭제조건 넣어줘야함
		try {
			ps = con.prepareStatement(sql);
			ps.setInt( 1, eno );
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
}


















