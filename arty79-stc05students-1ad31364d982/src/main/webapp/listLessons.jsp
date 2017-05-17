<!--
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
-->
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="UTF-8"/>
    <title>ListLessons</title>
</head>
<body>
<c:url value="/logout" var="logoutUrl" />
<form action="${logoutUrl}" method="post" id="logoutForm">
    <input type="hidden" name="${_csrf.parameterName}"
           value="${_csrf.token}" />
</form>
<script>
    function formSubmit() {
        document.getElementById("logoutForm").submit();
    }
</script>

<c:if test="${pageContext.request.userPrincipal.name != null}">
    <h2>
        Welcome : ${pageContext.request.userPrincipal.name} | <a
            href="javascript:formSubmit()"> Logout</a>

        <a href = '<%= request.getContextPath() %>/list'> Students list</a>
    </h2>
</c:if>
<link>
<h3>Lessons list</h3>
<table border="1">
    <thead>
    <tr>
        <th>ID</th>
        <th>room</th>
        <th>lesson date</th>
        <th>studyGroupId</th>
        <th>description</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${lessons}" var="lessons">
        <tr>
            <td><c:out value="${lessons.id}"></c:out></td>
            <td><c:out value="${lessons.room}"></c:out></td>
            <td><c:out value="${lessons.lessonDate}"></c:out></td>
            <td><c:out value="${lessons.studyGroupId}"></c:out></td>
            <td><c:out value="${lessons.description}"></c:out></td>

            <td><a href="${pageContext.request.contextPath}/listLessons/edit?id=${lessons.id}">edit</a>
                <a href="${pageContext.request.contextPath}/listLessons/delete?id=${lessons.id}">delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="${pageContext.request.contextPath}/listLessons/add">Add lesson</a>
</body>
</html>
