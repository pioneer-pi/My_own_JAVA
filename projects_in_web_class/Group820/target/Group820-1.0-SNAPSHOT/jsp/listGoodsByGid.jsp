<%--
  Created by IntelliJ IDEA.
  User: pioneer
  Date: 2021/12/11
  Time: 13:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/Group820/css/header.css">
    <link rel="stylesheet" href="/Group820/css/footer.css">
    <style>
        /*
        Card展示图片
        */
        .blank2{
            display: flex;
            flex-direction: row;
            align-items: center;
        }
        .blank2 .card{
            margin: 40px 20px;
            width: 200px;
            height: 300px;
            text-align: center;
            /*box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2),0 6px 20px 0 rgba(0,0,0,0.19);*/
        }
        /*.blank2 .card:hover{*/
        /*    box-shadow: 0 8px 8px 0 rgba(0,0,0,0.2),0 6px 20px 0 rgba(0,0,0,0.19);*/
        /*}*/
        .blank2 .card .img img{
            width: 200px;
            height: 300px;
            object-fit: cover;
            border-radius: 5px;
        }
        .blank2 .card .container{
            padding: 10px;
        }
        .blank2 .card .container p{
            text-align: center;
        }
        .blank2 a{
            text-decoration: none;
        }

        .blank2{
            display: flex;
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
        <div class="blank2">
            <div class="card">
                <div class="img">
                    <img src="/Group820/resources/goodsimg/goods_${goods.gid}.jpg" alt="${goods.gname}">
                </div>
            </div>
            <div class="introduce">
                <p>商品名: ${goods.gname}</p>
                <p>商品价格: ${goods.gprice}元/斤</p>
                <p>商品介绍: ${goods.gintroduce}</p>
            </div>
        </div>
    </div>

    <footer>
        东北林业大学 <br>  820&copy;
    </footer>
</div>
</body>
</html>
