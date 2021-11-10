<%--
  Created by IntelliJ IDEA.
  User: pioneer
  Date: 2021/11/1
  Time: 17:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${user.name}
<h1>c:set</h1>
<c:set var="salary1" value="${2100 * 10}"/>
通过EL显示结果: ${salary1} <br>
<h1>c:if</h1>
<c:set var="salary" value="${21000}"/>
    c:if<br>
    <c:if test="${salary > 20000}" var="iftest">
        好多啊
    </c:if>
    <c:if test="${salary < 2000}">
        好少啊
    </c:if>
    ${iftest}
<h1>c:choose,c:when,c:otherwise</h1>
<c:choose>
    <c:when test="${salary <= 2000}">
        太惨了
    </c:when>
    <c:when test="${salary > 20000}">
        不错的薪水，还能生活
    </c:when>
    <c:otherwise>
        什么都没有
    </c:otherwise>
</c:choose>
<h1>c:forEach</h1>

</body>
</html>
