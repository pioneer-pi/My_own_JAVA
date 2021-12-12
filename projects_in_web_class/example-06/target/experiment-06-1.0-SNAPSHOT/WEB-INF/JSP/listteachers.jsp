<%--
  Created by IntelliJ IDEA.
  User: pioneer
  Date: 2021/11/4
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
    <style>
        table tr{
            text-align: center;
        }
        table th,table td{
            padding: 10px;
        }
    </style>
</head>
<body>
<table>
    <tr>
        <th>姓名</th>
        <th>时间</th>
    </tr>
    <c:forEach items="${teachers}" var="t">
        <tr>
            <td><a href="/myWeb/updateteachers?tid=${t.id}">${t.name}</a> </td>
            <td><fmt:formatDate pattern="yyyy-MM-dd HH:mm"
                                value="${t.insertDate}" /></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
