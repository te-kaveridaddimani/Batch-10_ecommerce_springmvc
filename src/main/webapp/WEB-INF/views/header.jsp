<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
	String expMsg = (String) request.getAttribute("expMsg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="1" style="width: 100%; text-align: center;">
	
		<tr style="background: lightgrey; color: blue; height: 30px">
		
			<td style="font-size: 20px"><a href="./add"
				style="text-decoration: none">Add Item </a></td>
				
			<td style="font-size: 20px"><a href="./remove"
				style="text-decoration: none">Remove Item</a></td>
				
			<td style="font-size: 20px"><a href="./search"
				style="text-decoration: none">Search Item</a></td>
				
			<td style="font-size: 20px"><a href="./searchAll"
				style="text-decoration: none">See All</a></td>
				
			<td style="font-size: 20px"><a href="./update"
				style="text-decoration: none">Update Item</a></td>
				
			<td style="font-size: 20px"><a href="./logout"
				style="text-decoration: none">Logout</a></td>
		</tr>

	</table>

	<%
		if (expMsg != null && !expMsg.isEmpty()) {
	%>
	<h1 style="color: blue;">
		<%=expMsg%></h1>
	<%
		}
	%>
</body>
</html>