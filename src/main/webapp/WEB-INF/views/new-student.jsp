<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/add-student" method="post">
    <span>Name:</span>
    <input type="text" name="name">
    <br>
    <span>Surname:</span>
    <input type="text" name="surname">
    <br>
    <span>Gender:</span>
    <select name="gender">
        <option value="Male">Male</option>
        <option value="Female">Female</option>
    </select>
    <br>
    <span>Course:</span>
    <select name="course">
        <option value="Java">Java</option>
        <option value="Web">Web</option>
        <option value="Design">Design</option>
    </select>
    <input type="submit">
</form>
</body>
</html>
