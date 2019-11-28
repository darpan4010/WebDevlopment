//RegisterDao.java
package com.mvc.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mvc.bean.DataFormBean;
import com.mvc.bean.RegisterBean;
import com.mvc.util.DBConnection;
public class DataFormDao {
	public String dataformUser(DataFormBean dataFormBean)
	{

		String requestor = dataFormBean.getRequestor();
	    String user_email = dataFormBean.getUser_email();
		String releaselist = dataFormBean.getReleaselist();
		String cr_name = dataFormBean.getCr_name();
		String environment = dataFormBean.getEnvironment();
		String tirksrequest = dataFormBean.getTirksrequest();
		String quantity = dataFormBean.getQuantity();
		String user_message = dataFormBean.getUser_message();
		
		System.out.println("INSIDE DATAFORMDAO:- "+requestor+" "+user_email+" "+releaselist+" "+cr_name+" "+environment+" "+tirksrequest+" "+quantity+" "+user_message);
	 
		
		Connection con = null;
		PreparedStatement preparedStatement = null;
		try
		{
			con = DBConnection.createConnection();
			String query = "insert into TDMDATA(REQUESTOR,USEREMAIL,RELEASELIST,CRNAME,ENVIRONMENT,TIRKSREQUEST,QUANTITY,USERMESSAGE) values (?,?,?,?,?,?,?,?)"; //Insert user details into the table 'USERS'
			preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
			preparedStatement.setString(1,requestor);
			preparedStatement.setString(2, user_email);
			preparedStatement.setString(3, releaselist);
			preparedStatement.setString(4, cr_name);
			preparedStatement.setString(5, environment);
			preparedStatement.setString(6, tirksrequest);
			preparedStatement.setString(7, quantity);
			preparedStatement.setString(8, user_message);
			int i= preparedStatement.executeUpdate();
			if (i!=0)  //Just to ensure data has been inserted into the database
				return "SUCCESS"; 
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return "Oops.. Something went wrong there..!";  // On failure, send a message from here.
	}
}