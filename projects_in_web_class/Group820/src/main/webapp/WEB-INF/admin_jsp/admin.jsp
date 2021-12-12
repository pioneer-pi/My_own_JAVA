<%--
  Created by IntelliJ IDEA.
  User: pioneer
  Date: 2021/12/11
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>login</title>
    <link rel="stylesheet" href="/Group820/css/header.css">
    <style>
        * {
            margin:0;
            padding: 0;
            box-sizing: border-box;
        }
        .header img {

            max-height: 300px;
            width:100%;
        }

        /*
        商品管理
         */
        .admin{
            margin-top: 30px;
            margin-bottom: 30px;
        }
        table{
            width: 100%;
            border-collapse: collapse;
        }
         table th,
         table td{
            text-align: center;
            padding: 10px;
            border-bottom: 1px solid #ddd;
        }
         tbody tr:nth-child(odd){
            background-color: #f2f2f2;
        }
        .operate{
            display: inline-block;
            border-radius: 8px;
            padding: 10px 15px;
            cursor: pointer;
            color: white;
            text-decoration: none;
            background-color: lightcoral;
        }
        .admin tbody td a.operate:hover{
            background-color: red;
        }
        .add{

            width: 200px;
            display: block;
            margin: 10px;
        }
        .add a{
            /*float: right;*/
            text-align: center;
            display: block;
            background-color: #00BFFF;
            color: white;
            padding: 10px 20px;
            border-radius: 8px;
            cursor: pointer;
            text-decoration: none;

        }

        /*
        footer(修改版)
         */
        footer {
            width:100%;
            text-align: center;
            justify-content: center;
            align-items: center;
            font-size: 12px;
            color: white;
            padding: 10px;

            background: #228B22;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="header ">
        <img src="/Group820/resources/picture.jpg" alt="picture1">
    </div>
    <div class="nav">
        <%@include file="/jsp/navigation.jsp" %>
    </div>
    <div class="admin">
        <form action="/Group820/admin/query" method="post" >
            商品编号:<input type="text" name="Gid"/>
            商品名称:<input type="text" name="Gname"/>
            商品种类:<input type="text" name="Gtype"/>
            <input type="submit" value="查找"/>
        </form>
        <br>
        <table>
            <thead>
            <tr>
                <th>商品编号Gid</th>
                <th>商品名称</th>
                <th>商品价格</th>
                <th>商品种类</th>
                <th>是否显示</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${goods}" var="g">
                <tr>
                    <td>${g.gid}</td>
                    <td>${g.gname}</td>
                    <td>${g.gprice}</td>
                    <td>${g.gtype}</td>
                    <td>${g.gdelete}</td>
                    <td><a href="/Group820/admin/delete?Gid=${g.gid}" class="operate">删除</a> <a href="/Group820/admin/findone?Gid=${g.gid}" class="operate">修改</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    <div class="add">
        <a href="/Group820/admin/transferAdd">添加商品</a>
    </div>
    <footer>
        <p>东北林业大学 <br>  820&copy;</p>
    </footer>
</div>
</body>
</html>

