/**
 * FileName:     CommandSql.java
 * @Description: TODO
* All rights Reserved, Designed By ‰∏≠ÂçéÁΩ?
 * @author:    lingfenghuang
 * @version    V1.0 
 * Createdate:         2017Âπ?Êú?Êó?‰∏äÂçà11:50:11
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
import com.mysql.jdbc.Statement;

/**
 * @ClassName:     CommandSql.java
 * @Description:   TODO
 * 
 * @author         hlf
 * @version        V1.0  
 * @Date           2017Âπ?Êú?Êó?‰∏äÂçà11:50:11 
 */

public class CommandSql {

	 public static void main(String[] args) throws SQLException {
		 Connection conn = DbConnection.getConnection();
		 //String sql =  "show status like 'table%'";
		String sql2 = "show open tables from test";
		 java.sql.Statement stmt = conn.createStatement();
		 conn.setAutoCommit(false);
		 try {
		    ResultSet  result  = stmt.executeQuery(sql2);
		    while (result.next()) {
			}
			 conn.commit();
			 stmt.close();
			 conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
