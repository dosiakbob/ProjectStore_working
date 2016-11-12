<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dosia
  Date: 10.11.2016
  Time: 21:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<div style="text-align:center; margin-top:20%">

    <c:forEach var="com" items="${commodities}" >
        ${com.name} ${com.price} <a href="del/${com.id}">delete</a> <a href="update/${com.id}">update</a>
        <br>
    </c:forEach>
    <div style="text-align:center; margin-top:20%">

        <form action="addcommodity" method="POST">
            <input name="type" placeholder="commodityType">
            <br>
            <input name="name" placeholder="commodityName">
            <br>
            <input name="description" placeholder="commodityDescription">
            <br>
            <input name="price" placeholder="commodityPrice">
            <br>
            <button>save commodity</button>
        </form>
    </div>
</div>
</body>
</html>
