//RegisterBean.java
package com.mvc.bean;
public class DataFormBean {
	
	private String requestor;
	private String user_email;
	private String releaselist;
	private String cr_name;
	private String environment;
	private String tirksrequest;
	private String quantity;
	private String user_message;
	
	public String getRequestor() {
		return requestor;
	}
	public void setRequestor(String requestor) {
		this.requestor = requestor;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getReleaselist() {
		return releaselist;
	}
	public void setReleaselist(String releaselist) {
		this.releaselist = releaselist;
	}
	public String getCr_name() {
		return cr_name;
	}
	public void setCr_name(String cr_name) {
		this.cr_name = cr_name;
	}
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	public String getTirksrequest() {
		return tirksrequest;
	}
	public void setTirksrequest(String tirksrequest) {
		this.tirksrequest = tirksrequest;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getUser_message() {
		return user_message;
	}
	public void setUser_message(String user_message) {
		this.user_message = user_message;
	}
	
}