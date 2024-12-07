<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Sign-Up</title>
</head>
<body>
    <h2>Student Sign-Up</h2>
    <form action="student_signup" method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required><br><br>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br><br>
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br><br>
        <label for="username">gender:</label>
        <input type="text" id="gender" name="gender" required><br><br>
        <button type="submit">Sign Up</button>
    </form>
    <p><a href="student_login.jsp">Already have an account? Login here.</a></p>

    <%-- Display sign-up error --%>
    <c:if test="${not empty error}">
        <p style="color: red;">${error}</p>
    </c:if>
</body>
</html>
