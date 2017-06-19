package com.hlf.dblock;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

/**
 * @ClassName:     SelectSql.java
 * @Description:   TODO
 * 
 * @author         hlf
 * @version        V1.0  
 * @Date           2017Âπ?Êú?Êó?‰∏äÂçà7:57:24 
 */

public class Select2Sql {
	int i = 0;
	public static void main(String[] args) throws SQLException {
		 Connection conn = DbConnection.getConnection();
		 String sql = "select * from user where id = 2 for update";
		 PreparedStatement pstmt;
		 conn.setAutoCommit(false);
		 try {
				 pstmt  = (PreparedStatement) conn.prepareStatement(sql);
					ResultSet  rs = pstmt.executeQuery();
					while (rs.next()) {
						System.out.println(rs.getString("username")+ rs.getString("password"));
					}
					 pstmt.close();
			
		 conn.commit();
		 conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}
}
