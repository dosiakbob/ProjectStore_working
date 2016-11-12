<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; UTF-8">
    <title>COOL SHOP</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="../../css/main.css"/>">

</head>
<body>
<div class="header">
    <div class="img">

        <img src="../../resources/onlinelogomaker-111116-0954-5457.jpg" alt="????">

        <div class="loggining">

            <button onclick='location.href="login"' class="button">Увійти</button>

            <sec:authorize access="hasRole('ROLE_ADMIN')">
                <a href="addcommodity">addcommodity</a>
                <br>
                <a href="orders">orders</a>
            </sec:authorize>
            <br> <a href="registration">registration</a> <br>
            <sec:authorize access="!isAuthenticated()">
                <button onclick='location.href="login"' class="button">Увійти</button>
            </sec:authorize>
            <sf:form action="Logout" method="post">
                <button>logout</button>
            </sf:form>
            <a href="addcommodity">addcommodity</a>
        </div>
</div>


</div>
<div class="fp">
    <div class="fpp">
        <div class="leftmenu">

            <div class="form">
                <!-- тут можна поставити форму пошуку -->

                <li><a href="phone">Мобільні телефони</a></li>
                <li><a href="tablet">Планшети</a></li>
                <li><a href="notebook">Ноутбуки</a></li>
                <li><a href="acsessorie">Аксесуари</a></li>

            </div>

        </div>
    </div>
    <div class="rightside">

        <div class="commodity">якийсь товар</div>
        <div class="commodity">якийсь товар</div>
        <div class="commodity">якийсь товар</div>
        <div class="commodity">якийсь товар</div>
        <div class="commodity"></div>

        не знаю як зробити тут список останніх доданих

        плюс тут має бути circle з бутстрапу

    </div>
</div>
</body>
</html>