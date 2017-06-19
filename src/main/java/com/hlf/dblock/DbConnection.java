/**
 * FileName:     DbConnection.java
 * @Description: TODO
* All rights Reserved, Designed By ‰∏≠ÂçéÁΩ?
 * @author:    lingfenghuang
 * @version    V1.0 
 * Createdate:         2017Âπ?Êú?Êó?‰∏äÂçà7:57:52
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2017Âπ?Êú?Êó?      hlf        1.0             1.0
 *
 */
package com.hlf.dblock;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

/**
 * @ClassName:     DbConnection.java
 * @Description:   TODO
 * 
 * @author         hlf
 * @version        V1.0  
 * @Date           2017Âπ?Êú?Êó?‰∏äÂçà7:57:52 
 */

public class DbConnection {

	public static Connection  getConnection(){
		 String diver = "com.mysql.jdbc.Driver";
		 String url = "jdbc:mysql://localhost:3306/test";
		 String username = "root";
		 Connection  conn  = null;
		 String password = "root";
		 try{
			 Class.forName(diver);
			 conn = (Connection) DriverManager.getConnection(url,username,password);
		 }catch(Exception e){
			e.printStackTrace(); 
		 }
		 return conn;
	}
}
