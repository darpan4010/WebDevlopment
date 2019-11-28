<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.Date"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href='Hello.css' rel='stylesheet' type='text/css'>
<title>TDM-Self Service Portal</title>
<script>
	function validate() {
		var requestor = document.form.requestor.value;
		var user_email = document.form.user_email.value;
		var releaselist = document.form.releaselist.value;
		var cr_name = document.form.cr_name.value;
		var environment = document.form.environment.value;
		var tirksrequest = document.form.tirksrequest.value;
		var quantity = document.form.quantity.value;
		var user_message = document.form.user_message.value;
		
		
		if (requestor == null || requestor == "") {
			alert("Requestor Name can't be blank");
			return false;
		} else if (user_email == null || user_email == "") {
			alert("Email can't be blank");
			return false;
		} else if (releaselist == null || releaselist == "") {
			alert("Releaselist can't be blank");
			return false;
		} else if (cr_name == null || cr_name == "") {
			alert("CR Name can't be blank");
			return false;
		} else if (environment == null || environment == "") {
			alert("Environment Name can't be blank");
			return false;
		}else if (tirksrequest == null || tirksrequest == "") {
			alert("tirksrequest Name can't be blank");
			return false;
		}else if (quantity == null || quantity == "") {
			alert("quantity Name can't be blank");
			return false;
		}else if (user_message == null || user_message == "") {
			alert("user_message Name can't be blank");
			return false;
		}
	}
</script>

</head>

<body>

	<h1>Test Data Request Form</h1>
	<form name="form" action="DataFormServlet" method="post"
		onsubmit="return validate()">

		<div>
			    <label for="requestolabelr">SPOC (Requestor):</label>     <input
				type="text" id="requestor" name="requestor">  
		</div>

		 
		<div>
			    <label for="maillabel">E-mail:</label>     
				<input type="email" id="mail" name="user_email">  
		</div>
		
		<div>
			    <label for="releaselabel">Release:</label>    
		   <select name="releaselist" id="releaselist">
				<option value="jan">Jan</option>
				<option value="feb">Feb</option>
				<option value="mar">Mar</option>
				<option value="apr">Apr</option>
			</select>  
		</div>

		<div>
			    <label for="mail">CR:</label>     <input type="text" id="cr"
				name="cr_name">  
		</div>

		<div>
			    <label for="mail">Address type:</label>     
			<select name="addressType" id="addressType">
				<option value="none">None</option>
				<option value="gpon">GPON</option>
				<option value="gfast">GFAST</option>
				<option value="gponctlon">GPON-CTLON</option>
				<option value="gfastctlon">GFAST-CTLON</option>
			</select>  
		</div>

		<div>
			    <label for="mail">Environment</label>    
			 <select name="environment" id="environment">
				<option value="none">None</option>
				<option value="test1">Test1</option>
				<option value="test2">Test2</option>
				<option value="test3">Test3</option>
			</select>  
		</div>

		<div>
			    <label for="mail">TIRKS Request:</label> 
			<select name="tirksrequest" id="tirksrequest">
				<option value="none">None</option>
				<option value="focorders">FOC Orders</option>
				<option value="equipmentbuild">Equipment Build</option>
			</select>  
		</div>

		<div>
			    <label for="mail">Quantity:</label>     
			<select name="quantity" id="quantity">
				<option value="zero">0</option>
				<option value="one">1</option>
				<option value="two">2</option>
				<option value="three">3</option>
				<option value="four">4</option>
				<option value="five">5</option>
				<option value="six">6</option>
				<option value="seven">7</option>
				<option value="eight">8</option>
			</select>  
		</div>

		<div>
			    <label for="msg">Comments:</label>    
			<textarea id="msg" name="user_message"></textarea>
			 
		</div>
		   
		<div class="button">
			   
			<button type="sendyourreq">Send your Request</button>
			 
		</div>
	</form>
</body>
</html>