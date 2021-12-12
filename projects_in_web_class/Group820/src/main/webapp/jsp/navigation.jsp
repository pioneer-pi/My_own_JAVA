<%--
  Created by IntelliJ IDEA.
  User: pioneer
  Date: 2021/12/11
  Time: 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<style>
    * {
        box-sizing: border-box;
        margin:0;
        padding:0;
    }
    nav {
        width:100%;
        height:50px;
        margin:0px auto;
    }
    nav ul {
        margin:0;
        list-style-type:none;
        background-color:#228B22;
    }
    nav ul.main>li {
        display:inline-block;
    }
    nav a {
        display:block;
        color:white;
        text-decoration:none;
        padding:20px 35px;
    }
    nav a:hover {
        background-color:#006400;
    }
    .right {
        float: right;
    }
    div.second {
        display:none;
    }
    div.second ul {
        opacity: 0.6;
        position: absolute;
        list-style-type:none;
        background-color:#ccc;
    }
    div.second ul a {
        display:inline-block;
        text-decoration: none;
        color:black;
    }

    div.second ul a:hover {
        background-color:#999;
    }
</style>

<header>
    <nav>
        <ul class="main">
            <li><a href="/Group820/index">网站首页</a></li>
            <li><a href="">商品类型</a>
                <div class="second">
                    <ul>
                        <li><a href="/Group820/listGoodsByGtype?Gtype=蔬菜">蔬菜</a></li>
                        <li><a href="/Group820/listGoodsByGtype?Gtype=水果">水果</a></li>
                        <li><a href="/Group820/listGoodsByGtype?Gtype=粮油">粮油</a></li>
                    </ul>
                </div>
            </li>

            <li class="right"><a href="/Group820/judge">用户登录</a></li>
        </ul>
    </nav>
</header>
<script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
    $(function () {
        $("ul[class=main] li").hover(function () {
            $(this).children("div[class=second]").show();
        }, function () {
            $(this).children("div[class=second]").hide();
        })
    })
</script>
