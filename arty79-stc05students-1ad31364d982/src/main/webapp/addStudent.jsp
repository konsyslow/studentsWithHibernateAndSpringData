<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="UTF-8"/>
    <title>Add user</title>
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
<form method="post" action="${pageContext.request.contextPath}/list/update">
    <input name="id" value="${student.id}" type="hidden">
    <label>Name</br>
        <input type="text" name="name" value="${student.name}"/>
        </br>
    </label>
    <label>Age</br>
        <input type="text" name="age" value="${student.age}"/>
        </br>
    </label>
    <label>Group</br>
        <input type="text" name="groupId" value="${student.groupId}">
        </br>
    </label>
    <input type="submit" value="Save"/>
</form>

</body>
</html>
