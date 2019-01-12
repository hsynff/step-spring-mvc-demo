<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
    <table border="1px">
        <thead>
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Surname</th>
                <th>Gender</th>
                <th>Course</th>
                <th>Update</th>
                <th>Delete</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach items="${list}" var="student">
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.surname}</td>
                <td>${student.gender}</td>
                <td>${student.course}</td>
                <td><a href="${pageContext.request.contextPath}/update-student?id=${student.id}">Update</a></td>
                <td><a href="${pageContext.request.contextPath}/delete-student?id=${student.id}">Delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>
