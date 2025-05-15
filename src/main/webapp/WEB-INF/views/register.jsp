<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <title>User Registration</title>
</head>
<body>
    <h2>Register</h2>
    <form:form method="POST" action="register" modelAttribute="user">
        Name: <form:input path="userName" /><br><br>
        Email: <form:input path="email" /><br><br>
        Password: <form:password path="password" /><br><br>
        <input type="submit" value="Register" />
    </form:form>

    <p style="color: red;">${error}</p>
    <p style="color: green;">${msg}</p>
</body>
</html>
