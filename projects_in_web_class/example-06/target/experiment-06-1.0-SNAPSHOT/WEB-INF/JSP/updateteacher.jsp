<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pioneer
  Date: 2021/11/4
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
姓名:<br>
<input value="${teacher.name}">
<br>
<p>注册时间: ${teacher.insertDate}</p>
<br>
职称:
<select>
    <c:forEach items="${titles}" var="t">
        <c:set var="status" value="/" />
        <c:if test="${t.id == teacher.title.id}">
            <c:set var="status" value="selected"/>
        </c:if>
        <option value="${t.id}" ${s}>${t.name}</option>
    </c:forEach>
</select>
<br>
授课：
<br>
<ul>
    <c:forEach items="${courses}" var="c">
        <c:set var="checked" value="/" />
        <c:forEach items="${teacher.courses}" var="tc">
            <c:if test="${tc.id == c.id}">
                <c:set var="checked" value="checked"/>
            </c:if>
        </c:forEach>
        <li><label><input type="checkbox" ${checked}>${c.name}</label></li>
    </c:forEach>
</ul>
</body>
</html>
