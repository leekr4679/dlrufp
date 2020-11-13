package com.grganzy.www.DBManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.grganzy.www.Member.Member;

public class DBManager {

	public void insert(Member member) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection("oracle:jdbc:@192.168.0.90:1521:xe", "scott", "1234");
			pstmt = conn.prepareStatement("insert into memberchap04gr"
					+ "(NAME, GENDER, ID, PASSWORD, ADDRESS, PHONE, EMAIL, HOBBY, REGDATE, IDX) "
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, sysdate, (select nvl(max(idx)+1,1) from memberchap04gr))");
			
			pstmt.setString(1, member.getName());
			pstmt.setString(2, member.getGender());
			pstmt.setString(3, member.getId());
			pstmt.setString(4, member.getPassword());
			pstmt.setString(5, member.getAddress());
			pstmt.setString(6, member.getPhone());
			pstmt.setString(7, member.getEmail());
			pstmt.setString(8, member.getHobbyArray());
			pstmt.setString(9, member.getRegdate());
			pstmt.setString(10, member.getIdx());
			
			pstmt.executeUpdate();
			System.out.println("완료");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) {
					conn.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e) {

			}
		}
	}
	
	public ArrayList<Member> select() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<Member> al = new ArrayList<Member>();
		
		try {
			Class.forName("oracle.jdbc,driver.OracleDriver");
			
			conn = DriverManager.getConnection("oracle:jdbc:thin:@192.168.0.90:1521:xe", "scott", "1234");
			pstmt = conn.prepareStatement("select into memberchap04gr order by regdate desc");
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Member temp = new Member();
				temp.setName(rs.getString("name"));
				temp.setGender(rs.getString("gender"));
				temp.setId(rs.getString("id"));
				temp.setPassword(rs.getString("password"));
				temp.setAddress(rs.getString("address"));
				temp.setPhone(rs.getString("phone"));
				temp.setEmail(rs.getString("phone"));
				temp.setRegdate(rs.getString("regdate"));
				temp.setIdx(rs.getString("idx"));
				
				System.out.println(temp);
				al.add(temp);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) {
					conn.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				if(rs != null) {
					rs.close();
				}
			} catch(Exception e) {
				
			}
		}
		return al;
	}
	
	public void defualt() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("oracle:jdbc:thin:@192.168.0.60:152:xe", "scott", "1234");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) {
					conn.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
			} catch(Exception e) {
				
			}
		}
	}
}