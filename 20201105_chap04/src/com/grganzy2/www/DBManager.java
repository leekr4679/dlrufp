package com.grganzy2.www;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.grganzy2.www.src.Member;

public class DBManager {

	public Member selectOne(String idx) {
		Member member = new Member();

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.90:1521:xe", "scott", "1234");
			pstmt = conn.prepareStatement("select * from memberchap04gr where idx = ?");
			pstmt.setInt(1, Integer.parseInt(idx));
			rs = pstmt.executeQuery();

			if (rs.next()) {
				member.setIdx(rs.getString("idx"));
				member.setAddress(rs.getString("address"));
				member.setPassword(rs.getString("password"));
				member.setEmali(rs.getString("email"));
				member.setHobbyArray(rs.getString("hobby"));
				member.setName(rs.getString("name"));
				member.setId(rs.getString("id"));
				member.setPhone(rs.getString("phone"));
				// member.setPasswordCheck(rs.getString("passwordCheck"));
				member.setGender(rs.getString("gender"));
				member.setRegdate(rs.getString("regdate"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e) {

			}
		}
		return member;
	}

	public void insert(Member member) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.90:1521:xe", "t", "1234");
			pstmt = conn.prepareStatement("INSERT INTO memberchap04gr"
					+ "(NAME, GENDER, ID, PASSWORD, ADDRESS, PHONE, EMAIL, HOBBY, REGDATE, IDX) "
					+ "VALUES ((select nvl(max(idx)+1,1)?, ?, ?, ?, ?, ?, ?, ?, sysdate, (select nvl(max(idx)+1,1) from memberchap04gr))");
			pstmt.setString(1, member.getName());
			pstmt.setString(2, member.getGender());
			pstmt.setString(3, member.getId());
			pstmt.setString(4, member.getPassword());
			pstmt.setString(5, member.getAddress());
			pstmt.setString(6, member.getPhone());
			pstmt.setString(7, member.getEmali());
			pstmt.setString(8, member.getHobbyArray());
			pstmt.executeUpdate();
			System.out.println("완료");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
			}
		}
	}

	public ArrayList<Member> select() {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; // select 해서 반환되는 table 내용 담는 객체

		ArrayList<Member> al = new ArrayList<Member>(); // rs 내용을 바꿔서 ArrayList에 담는 객체

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.90:1521:xe", "scott", "1234");
			pstmt = conn.prepareStatement("select * from MEMBERCHAP04GR order by regdate desc");
			// select -> executeQuery();
			// insert OR update OR delete -> executeUpdate();
			rs = pstmt.executeQuery();

			// int i = 1;
			while (rs.next()) { // 다음 행이 있으면 true 없으면 false
				// System.out.println(i++);
				Member temp = new Member();
				temp.setIdx(rs.getString("idx"));
				temp.setAddress(rs.getString("address"));
				temp.setPassword(rs.getString("password"));
				temp.setEmali(rs.getString("email"));
				temp.setHobbyArray(rs.getString("hobby"));
				temp.setName(rs.getString("name"));
				temp.setId(rs.getString("id"));
				temp.setPhone(rs.getString("phone"));
				// temp.setPasswordCheck(rs.getString("passwordCheck"));
				temp.setGender(rs.getString("gender"));
				temp.setRegdate(rs.getString("regdate"));

				System.out.println(temp);
				al.add(temp);
			}
			;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}

				if (conn != null) {
					conn.close();
				}

				if (pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e) {
			}
		}
		return al;
	}

	public void defualt() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.90:1521:xe", "scott", "1234");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e) {

			}
		}

	}

	public void delete(String idx) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.90.:1521:xe", "scott", "1234");
			pstmt = conn.prepareStatement("delete from memberchap04gr where idx=?");
			pstmt.setInt(1, Integer.parseInt(idx));
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e) {

			}

		}
	}
}