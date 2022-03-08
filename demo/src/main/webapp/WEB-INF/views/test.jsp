<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jsp test</title>

</head>
<body>
	<h2>Hello JSP</h2>
	<div>JSP LIST TEST</div>
	<c:out value="${name}"></c:out>
	<c:forEach var="item" items="${list}" varStatus="idx">
		${idx.index},${item}<br/>
	</c:forEach>
</body>

</html>