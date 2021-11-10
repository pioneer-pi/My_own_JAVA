<%--
  Created by IntelliJ IDEA.
  User: pioneer
  Date: 2021/11/1
  Time: 20:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
姓名:<br>
<input type="text" value="${teacher.name}">
<br>
职称:<br>
<select>
    <c:forEach items="${titles}" var="t">
        <c:set var="s" value=""/>
        <c:if test="${t.id == teacher.title.id}">
            <c:set var="s" value="selected"/>
        </c:if>
        <option value="${t.id}" ${s}>${t.name}</option>
    </c:forEach>
</select>
<ul>
    <c:forEach items="${courses}" var="c">
        <c:set var="checked" value=""/>
        <c:forEach items="${teacher.courses}" var="tc">
            <c:if test="${tc.id == c.id}">
                <c:set var="checked" value="checked"/>
            </c:if>
        </c:forEach>
        <li><label> <input type="checkbox" ${checked}>${c.name}</label></li>
    </c:forEach>
</ul>
</body>
</html>
