<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; UTF-8">
<title>COOL SHOP</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css">

</head>
<body>
<header>

	<%--<button onclick='location.href="login"'class="button">Увійти</button>--%>
		<sec:authorize access="hasRole('ROLE_ADMIN')">
			<a href="commodity">commodity</head>
			<br>
			<a href="orders">orders</a>
		</sec:authorize>
		<br> <a href="registration">registration</a> <br>
		<sec:authorize access="!isAuthenticated()">
			<a href="Login">Login</a>
		</sec:authorize>
		<sf:form action="Logout" method="post">
			<button>logout</button>
		</sf:form>

</header>
<div class="fp">
	<div class="fpp">
		<div class="leftmenu">

			<div class="form">
				<!-- тут можна поставити форму пошуку -->

				<li> <a href="phone">Мобільні телефони</a></li>
				<li> <a href="tablet">Планшети</a></li>
				<li> <a href="notebook">Ноутбуки</a></li>
				<li> <a href="acsessorie">Аксесуари</a></li>

			</div>

		</div>
	</div>
	<div class="rightside">
		не знаю як зробити тут список останніх доданих

		плюс тут має бути circle з бутстрапу

	</div>
</div>
</body>
</html>