<%--
  Created by IntelliJ IDEA.
  User: pioneer
  Date: 2021/11/1
  Time: 20:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <c:forEach items="${courses}" var="c">
        <tr>
            <td><a href="/myWeb/jst1/getcourse?cid=${c.id}">${c.name}</a></td>
            <td><fmt:formatDate value="${c.insertDate}" pattern="yyyy-MM-dd HH:mm"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
