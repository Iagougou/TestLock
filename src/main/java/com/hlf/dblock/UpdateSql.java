/**
 * FileName:     UpdateSql.java
 * @Description: TODO
* All rights Reserved, Designed By ‰∏≠ÂçéÁΩ?
 * @author:    lingfenghuang
 * @version    V1.0 
 * Createdate:         2017Âπ?Êú?Êó?‰∏äÂçà7:57:35
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2017Âπ?Êú?Êó?      hlf        1.0             1.0
 *
 */
package com.hlf.dblock;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

/**
 * @ClassName:     UpdateSql.java
 * @Description:   TODO
 * 
 * @author         hlf
 * @version        V1.0  
 * @Date           2017Âπ?Êú?Êó?‰∏äÂçà7:57:35 
 */

public class UpdateSql {
	
	 public static void main(String[] args) throws SQLException {
		 Connection conn = DbConnection.getConnection();
		 String sql = "update user set password =111 where id =1";
		 conn.setAutoCommit(false);
		 PreparedStatement pstmt;
		 try {
			pstmt  = (PreparedStatement) conn.prepareStatement(sql);
		    int  exffceive  = pstmt.executeUpdate();
			System.out.println("count===="+exffceive);
			 conn.commit();
			 pstmt.close();
			 conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
