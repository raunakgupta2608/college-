<%@ page import="com.college.Collegebean" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<jsp:useBean id="colkey" class="com.college.Collegebean" scope="session"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register JSP</title>
<link rel="stylesheet" type="text/css" href="register.css">
<link href="https://fonts.googleapis.com/css?family=Cardo|Fredoka+One&display=swap" rel="stylesheet">

</head>
<body id="registerjspbody">

<%
	Collegebean cg = (Collegebean) request.getAttribute("colkey");
%>

<div id="formjspdiv">
	<form action="Mumengg">
		<div id="buttondiv">
			<br><br>
			<input type="submit" id ="button"value="Engineering College in Mumbai">
		</div>
	</form>
</div>


<div id="registerjspdiv">
<table id="registertablejsp">
			<tr>
			<th>CID</th>
			<th>CNAME</th>
			<th>COURSE_TYPE</th>
			<th>CITY</th>
			<th>FEES</th>
			<th>PINCODE</th>
			</tr>
			
			<tr>
			<td> <jsp:getProperty property="cid" name="colkey"/></td>
			<td><jsp:getProperty property="cname" name="colkey"/></td>
			<td><jsp:getProperty property="coursetype" name="colkey"/></td>
			<td><jsp:getProperty property="city" name="colkey"/></td>
			<td><jsp:getProperty property="fees" name="colkey"/></td>
			<td><jsp:getProperty property="pincode" name="colkey"/></td>
			</tr>
</table>
</div>
<br><br>

</body>
</html>