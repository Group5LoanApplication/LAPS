<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="s"%>
	<!-- <form action="./BookTicket"> -->
	<h1 align="center">Loan Details Form</h1>
	<table border="1" align="center">
		<tr>
			<td><b>Application ID</b></td>
			<td><input type="text" name="id" value="${show.applicationId}" required></td>
		</tr>
		<tr>
			<td><b>Application Date</b></td>
			<td><input type="date" name="typeDate" value="${show.applicationDate} "required></td>
		</tr>
		<tr>
			<td><b>Loan Program</b></td>
			<td><input type="text" style="float: left" value="${show.loanProgram} "required></td>
		</tr>
		<tr>
			<td><b>Address of Property</b></td>
			<td><textarea name="address" rows='3' multiple size='3' required></textarea></td>
		</tr>

		<tr>
			<td><b>Document Proof Available</b></td>
			<td><input type="checkbox">Purchase
			<input type="checkbox">Construction
			<input type="checkbox">Extension
			<input type="checkbox">Renovation</td>
		</tr>
		<tr>
			<td><b>Date of Interview</b></td>
			<td><input type="date"  name="dateInterview" required/></td>
		</tr>

	</table>
	<table align="center">
	<tr><td>
	<button type="submit" value="save">Save</button></td></tr>
	</table>
	</form>

</body>
</html>