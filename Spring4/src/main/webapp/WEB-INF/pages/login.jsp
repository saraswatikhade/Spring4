<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<form method="post" action="<c:url value='j_spring_security_check'/>">
		<table>

			<tr>
				<td>User Name:<input type="text" name="j_username"></td>
			</tr>
			<tr>
				<td>Password: <input type="password" name="j_password"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" name="Login"></td>
			</tr>
		</table>
	</form>
</body>
</html>