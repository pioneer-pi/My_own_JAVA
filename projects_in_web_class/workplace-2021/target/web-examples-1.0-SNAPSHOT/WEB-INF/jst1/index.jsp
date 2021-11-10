<%--
  Created by IntelliJ IDEA.
  User: pioneer
  Date: 2021/11/1
  Time: 19:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<ul>
    <c:forEach items="${users}" var="u">
        <li>${u.name}</li>
    </c:forEach>
</ul>
<table>
    <tr>
        <td>index</td>
        <td>count</td>
        <td>name</td>
        <td>isFirst</td>
    </tr>
    <c:forEach items="${users}" var="u" varStatus="s">
        <tr>
            <td>${s.index}</td>
            <td>${s.count}</td>
            <td>${u.name}</td>
            <td>${s.first}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
