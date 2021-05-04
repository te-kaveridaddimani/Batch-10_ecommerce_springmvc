<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.te.ecommerce.beans.Items" %>
	
	
<% String message = (String) request.getAttribute("message"); %>
<% Items item = (Items) request.getAttribute("item"); %>

<jsp:include page="header.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
		<legend>Search Item</legend>
		<form action="./search" method="post">
			<table>
				<tr>
					<td>Item ID</td>
					<td>:</td>
					<td><input type="number" name="id"
						placeholder="Enter the ID" required="required"></td>
				</tr>
		
				<tr>
					<td><input type="submit" value="Search item"></td>
				</tr>
			</table>
		</form>
	</fieldset>
	
	<% if(message != null) { %>
	
		<h3> <%= message %> </h3>	
	
	<% } %>

	
	<% if(item != null){ %>
		
		<h3>Id : <%= item.getId() %> </h3>
		<h3>Name : <%= item.getName()%> </h3>
		<h3>Quantity : <%= item.getQuntity()%> </h3>
		<h3>Price : <%= item.getPrice() %> $ </h3>
	
	<% } %>
	
</body>
</html>