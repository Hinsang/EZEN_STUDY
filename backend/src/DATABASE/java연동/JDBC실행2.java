package DATABASE.java연동;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC실행2 {
	public static void main(String[] args) {

		try {
		// 1. DB연동
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/shop_db3",
				"root",
				"1234"
		);
		System.out.println("연동 성공");
		// 2. SQL 작성
		String sql = "insert into product values('바나나',1500,'2021-07-01','델몬트',17)";
		// 3. SQL 조작[연결]
		PreparedStatement ps = con.prepareStatement(sql);
		// 4. SQL 실행
		ps.executeUpdate();
		
		sql = "insert into product values('카스',2500,'2022-03-01','OB',3)";
		ps = con.prepareStatement(sql);
		ps.executeUpdate();

		sql = "insert into product values('삼각김밥',800,'2023-09-01','CJ',22)";
		ps = con.prepareStatement(sql);
		ps.executeUpdate();
		
		} catch (Exception e) {
			System.out.println("오류발생 : " + e);
		}
	}
}
