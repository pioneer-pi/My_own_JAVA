<%--
  Created by IntelliJ IDEA.
  User: pioneer
  Date: 2021/12/12
  Time: 8:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>update</title>
</head>
<body>
<div class="container">
    <div class="header ">
        <img src="/Group820/resources/picture.jpg" alt="picture1">
    </div>
    <div class="nav">
        <%@include file="/jsp/navigation.jsp" %>
    </div><br>
    <form action="/Group820/admin/update" method="post">
        Gid: <input type="text" name="Gid" value="${goods.gid}"><br>
        Gname: <input type="text" name="Gname" value="${goods.gname}"><br>
        Gprice: <input type="text" name="Gprice" value="${goods.gprice}"><br>
        Gtype: <input type="text" name="Gtype" value="${goods.gtype}"><br>
        Gdelete: <input type="text" name="Gdelete" value="${goods.gdelete}"><br>
        Gintroduce: <input type="text" name="Gintroduce" value="${goods.gintroduce}"><br>

        <button type="submit">提交</button>
    </form>
    <footer>
        <p>东北林业大学 <br>  820&copy;</p>
    </footer>
</div>
</body>
</html>
