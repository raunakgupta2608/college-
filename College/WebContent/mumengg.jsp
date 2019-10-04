<%@ page  import="com.college.Collegebean" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <jsp:useBean id="colkey" class="com.college.Collegebean" scope="session"/>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mumengg</title>
<link rel="stylesheet" type="text/css" href="mumengg.css">
<link href="https://fonts.googleapis.com/css?family=PT+Sans|Source+Sans+Pro&display=swap" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">

$(document).ready(function(){
	$("#registerjspdiv").hide();
	$("#mumjspbut").click(function(){
		$("#registerjspdiv").toggle();
	});
	$("#mumjspbut").hover(function(){
		$(this).css("background", "#FDE281");
	});
	$("#mumjspbut").mouseleave(function(){
		$(this).css("background", "#FEF3DC");
	});
});

</script>

</head>
<body id="registerjspbody">

<input type="button" value="Display" id="mumjspbut">
<div id="registerjspdiv">

<%
	Collegebean cg = (Collegebean) request.getAttribute("colkey");
	int n=cg.getI();
	for(int j=0;j<n;j++)
	{
		out.print(cg.getList().get(j));
		out.print("<br>");
	}

%>
</div>
</body>
</html>