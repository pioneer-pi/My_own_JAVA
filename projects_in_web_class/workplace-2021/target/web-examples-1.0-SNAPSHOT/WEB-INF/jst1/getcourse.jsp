<%--
  Created by IntelliJ IDEA.
  User: pioneer
  Date: 2021/11/1
  Time: 20:27
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
<h2>${course.name}</h2>
发布时间
<fmt:formatDate value="${course.insertDate}"/>
<p>${course.description}</p>
</body>
</html>
