package java1.ch11API클래스;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

import java1.가계부.ExpenseDAO;

public class DAO {
	
	// 필드
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private static DAO dao = new DAO();
	
	// 생성자
	private DAO() { // 외부 클래스에서 사용 불가능 [ 캡슐화 ]
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
	
	// 메소드
	public static DAO getInstance() {
		return dao;
	}
	
	boolean create(String cdate, String ccomment) {
		String sql = "insert into calendar values(null, ?, ?)";
		try {
			ps = con.prepareStatement(sql); // sql 연결
			ps.setString(1, cdate);
			ps.setString(2, ccomment);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
	
	HashMap< Integer, ArrayList<String> > read(String year, String month) {
		String sql = "select * from calendar";
		HashMap< Integer, ArrayList<String> > map = new HashMap<>();
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, year);
			ps.setString(2, month);
			rs = ps.executeQuery();
			while( rs.next() ) {
				// 레코드 -> 필드2와 필드3 -> 리스트 담기
				ArrayList<String> values = new ArrayList<>();
				values.add( rs.getString(2) );
				values.add( rs.getString(3) );
				// pk와 리스트를 map에 담기
				map.put(rs.getInt(1), values);
			}
			System.out.println(map.toString());
			return map;
		} catch (Exception e) {
			return map;
		}
	}
	
}
