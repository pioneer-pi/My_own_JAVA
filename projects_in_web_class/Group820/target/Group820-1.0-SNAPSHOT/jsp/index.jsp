<%--
  Created by IntelliJ IDEA.
  User: pioneer
  Date: 2021/12/11
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>commodity</title>
    <link rel="stylesheet" href="/Group820/css/header.css">
    <link rel="stylesheet" href="/Group820/css/footer.css">
    <style>
        * {
            margin:0;
            padding: 0;
            box-sizing: border-box;
        }
        .area {
            background-color: #00008B;
        }
        .row {
            display: flex;
            /*align-items: flex-start;*/
        }

        .header img {

            max-height: 300px;
            width:100%;
        }
        footer {
            position: absolute;
            bottom: 0;
            width:100%;
            text-align: center;
            font-size: 12px;
            color: white;
            padding: 10px;
            background: #228B22;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="header">
        <img src="/Group820/resources/picture.jpg" alt="picture1">
    </div>
    <div class="nav">
        <%@include file="/jsp/navigation.jsp" %>
    </div>

    <div class="main">

    </div>

    <footer>
        东北林业大学 <br>  820&copy;
    </footer>
</div>
</body>
</html>
