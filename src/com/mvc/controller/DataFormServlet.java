package com.mvc.controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.bean.DataFormBean;
import com.mvc.bean.RegisterBean;
import com.mvc.dao.DataFormDao;
import com.mvc.dao.RegisterDao;
 
@SuppressWarnings("serial")
public class DataFormServlet extends HttpServlet {
 
 public DataFormServlet() {
 }
 
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 //Copying all the input parameters in to local variables
 
    String requestor = request.getParameter("requestor");
    String user_email = request.getParameter("user_email");
	String releaselist = request.getParameter("releaselist");
	String cr_name = request.getParameter("cr_name");
	String environment = request.getParameter("environment");
	String tirksrequest = request.getParameter("tirksrequest");
	String quantity = request.getParameter("quantity");
	String user_message = request.getParameter("user_message");
 
	System.out.println("INSIDE SERVLET:-"+requestor+" "+user_email+" "+releaselist+" "+cr_name+" "+environment+" "+tirksrequest+" "+quantity+" "+user_message);
 
 DataFormBean dataformbean = new DataFormBean();
 dataformbean.setRequestor(requestor);
 dataformbean.setUser_email(user_email);	
 dataformbean.setReleaselist(releaselist);
 dataformbean.setCr_name(cr_name);
 dataformbean.setEnvironment(environment);
 dataformbean.setTirksrequest(tirksrequest);
 dataformbean.setQuantity(quantity);
 dataformbean.setUser_message(user_message);
 

 DataFormDao dataformDao = new DataFormDao();
 
 //The core Logic of the Registration application is present here. We are going to insert user data in to the database.
 String userRequestor = dataformDao.dataformUser(dataformbean);
 
 if(userRequestor.equals("SUCCESS"))   //On success, you can display a message to user on Home page
 {
 request.getRequestDispatcher("/Home.jsp").forward(request, response);
 }
 else   //On Failure, display a meaningful message to the User.
 {
 request.setAttribute("errMessage", userRequestor);
 request.getRequestDispatcher("/Register.jsp").forward(request, response);
 }
 }
}