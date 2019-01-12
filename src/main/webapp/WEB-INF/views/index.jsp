<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <script>
        <c:if test="${message ne null}">
        alert('${message}');
        </c:if>
    </script>
</head>
<body>
<h2>Hello World!</h2>

<a href="${pageContext.request.contextPath}/students">Get All Students</a>
<br>
<a href="${pageContext.request.contextPath}/add-student">Add Student</a>

</body>
</html>
