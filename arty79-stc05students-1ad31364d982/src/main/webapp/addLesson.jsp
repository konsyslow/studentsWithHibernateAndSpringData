<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="UTF-8"/>
    <title>Add lesson</title>
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
    </h2>
</c:if>
<form method="post" action="${pageContext.request.contextPath}/listLessons/update">
    <input name="id" value="${lesson.id}" type="hidden">
    <label>Room</br>
        <input type="text" name="room" value="${lesson.room}"/>
        </br>
    </label>
    <label>Lesson date</br>
        <input type="text" name="lessonDate" value="${lesson.lessonDate}"/>
        </br>
    </label>
    <label>Group Id</br>
        <input type="text" name="studyGroupId" value="${lesson.studyGroupId}">
        </br>
    </label>
    <label>Description</br>
        <input type="text" name="description" value="${lesson.description}">
        </br>
    </label>
    <input type="submit" value="Save"/>
</form>

</body>
</html>
