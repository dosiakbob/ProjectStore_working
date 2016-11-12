<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>



    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600' rel='stylesheet' type='text/css'>
    <link href="//netdna.bootstrapcdn.com/font-awesome/3.1.1/css/font-awesome.css" rel="stylesheet">

    <link rel="stylesheet" type="text/css" href="../../css/registration.css"/>
    <link rel="stylesheet" type="text/css" href="<c:url value="../../css/main.css"/>
    <title>Title</title>
</head>
<body>

<div class="register">
    <h1>Registration</h1>

    <sf:form modelAttribute="user" action="/newUser" method="post">

        <label id="icon" for="name"><i class="icon-user"></i></label>
        <sf:input path="username" type="text" name="name" id="name" placeholder="username"  />
        <label id="icon" for="name"><i class="icon-envelope 	"></i></label>
        <sf:input path="email" type="text" name="name" id="name" placeholder="email"  />
        <label id="icon" for="name"><i class="icon-phone"></i></label>

        <sf:input path="password" type="password" name="name" id="name" placeholder="password"  />

        <div style="text-align: center;">
            <button class="button">Register</button>
        </div>
    </sf:form>
</div>

</body>
</html>
