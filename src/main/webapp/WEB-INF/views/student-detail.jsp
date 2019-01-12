<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/update-student" method="post">
    <span>Id:</span>
    <input type="text" value="${student.id}" name="id">
    <br>
    <span>Name</span>
    <input type="text" name="name" value="${student.name}">
    <br>
    <span>Surname</span>
    <input type="text" name="surname" value="${student.surname}">
    <br>
    <span>Gender</span>
    <select name="gender">
        <option value="Male" <c:if test="${student.gender eq 'Male'}">selected</c:if>>Male</option>
        <option value="Female" <c:if test="${student.gender eq 'Female'}">selected</c:if> >Female</option>
    </select>
    <br>
    <span>Course</span>
    <select name="course">
        <option value="Java" <c:if test="${student.course eq 'Java'}">selected</c:if>>Java</option>
        <option value="Web" <c:if test="${student.course eq 'Web'}">selected</c:if>>Web</option>
        <option value="Design" <c:if test="${student.course eq 'Design'}">selected</c:if>>Design</option>
    </select>
    <input type="submit">
</form>

</body>
</html>
