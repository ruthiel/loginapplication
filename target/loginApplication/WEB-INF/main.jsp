<%--
  Created by IntelliJ IDEA.
  User: codecadet
  Date: 08/12/16
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Bem-vindo a esta página de Login!</h1>
<span>Foste adicionado ${user.username}!</span>
<%--<h2>List of Bootcamp Users:</h2>--%>
<%--<c:if test="${not empty users}">--%>
    <%--<ul>--%>
        <%--<c:forEach var="user" items="${users}">--%>
            <%--<li>${user.username} <strong>${user.email}</strong></li>--%>
        <%--</c:forEach>--%>
    <%--</ul>--%>
<%--</c:if>--%>
</body>
</html>
