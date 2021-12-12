<%--
  Created by IntelliJ IDEA.
  User: pioneer
  Date: 2021/12/11
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <div class="header ">
        <img src="/Group820/resources/picture.jpg" alt="picture1">
    </div>
    <div class="nav">
        <%@include file="/jsp/navigation.jsp" %>
    </div><br>
    <form action="/Group820/admin/addGoods" method="post">
        Gid: <input type="text" name="Gid"><br>
        Gname: <input type="text" name="Gname"><br>
        Gprice: <input type="text" name="Gprice"><br>
        Gtype: <input type="text" name="Gtype"><br>
        Gintroduce: <input type="text" name="Gintroduce"><br>

        <button type="submit">提交</button>
    </form>
    <footer>
        <p>东北林业大学 <br>  820&copy;</p>
    </footer>
</div>
</body>
</html>
