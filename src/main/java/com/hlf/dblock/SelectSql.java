/**
 * FileName:     SelectSql.java
 * @Description: TODO
* All rights Reserved, Designed By 中华�?
 * @author:    lingfenghuang
 * @version    V1.0 
 * Createdate:         2017�?�?�?上午7:57:24
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2017�?�?�?      hlf        1.0             1.0
 *
 */
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
 * @Date           2017�?�?�?上午7:57:24 
 */

public class SelectSql {
	int i = 0;
	public static void main(String[] args) throws SQLException {
		 Connection conn = DbConnection.getConnection();
		 String sql = "select * from user where id  =1 for update ";
		 PreparedStatement pstmt;
		 conn.setAutoCommit(false);
		 try {
				 pstmt  = (PreparedStatement) conn.prepareStatement(sql);
					ResultSet  rs = pstmt.executeQuery();
					while (rs.next()) {
						System.out.println("sql输出结果"+rs.getString("username")+ rs.getString("password"));
					}
	     pstmt.close();
		 conn.commit();
		 conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}
}
