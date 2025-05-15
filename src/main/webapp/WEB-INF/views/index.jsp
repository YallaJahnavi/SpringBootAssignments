<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page session="true" %>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
    <h2>Welcome, ${sessionScope.loggedInUser.userName}!</h2>
    <p>You are successfully logged in.</p>
</body>
</html>
