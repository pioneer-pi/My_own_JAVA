<%--
  Created by IntelliJ IDEA.
  User: pioneer
  Date: 2021/11/1
  Time: 19:30
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
<h1>fmt:formatNumber</h1>
<c:set var="balance" value="120000.2309"/>
<p>格式化数字(1):<fmt:formatNumber value="${balance}" type="currency"/></p>
<p>格式化数字(2):<fmt:formatNumber type="number" maxIntegerDigits="3" value="${balance}"/></p>
<p>格式化数字(3):<fmt:formatNumber type="number" maxFractionDigits="6" value="${balance}"/> </p>
<p>格式化数字(4):<fmt:formatNumber type="number" groupingUsed="false" value="${balance}"/> </p>
<p>格式化数字(5):<fmt:formatNumber type="percent" maxIntegerDigits="3" value="${balance}"/> </p>
<p>格式化数字(6):<fmt:formatNumber type="percent" minFractionDigits="10" value="${balance}"/></p>
<p>格式化数字(7):<fmt:formatNumber type="percent" minIntegerDigits="3" value="${balance}"/> </p>
<p>格式化数字(8):<fmt:formatNumber type="number" pattern="###.###E0" value="${balance}"/> </p>
<p>英镑:
<fmt:setLocale value="en_GB"/>
<fmt:formatNumber value="${balance}" type="currency"/></p>
<p>美元:
<fmt:setLocale value="en_US"/>
<fmt:formatNumber value="${balance}" type="currency"/></p>

<h1>fmt:formatDate</h1>
<c:set var="now" value="<%=new java.util.Date()%>"/>
<p>日期格式化(1): <fmt:formatDate value="${now}" type="time"/> </p>
<p>日期格式化(2): <fmt:formatDate value="${now}" type="date"/> </p>
<p>日期格式化(3): <fmt:formatDate value="${now}" pattern="yyyy-MM-dd"/></p>
<p>日期格式化(4): <fmt:formatDate value="${now}" pattern="yyyy-MM-dd HH:mm E"/> </p>
<fmt:setLocale value="zh-CN"/>
<p>日期格式化(5): <fmt:formatDate value="${now}" pattern="yyyy/MM/dd HH:mm:SS E"/> </p>
</body>
</html>
