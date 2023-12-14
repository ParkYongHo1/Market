<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="result-box">
	<c:choose>
		<c:when test="${empty findPwd}">
		<p class="inquiry">조회결과가 없습니다.</p>
		</c:when>
        <c:otherwise>
            <p class="title">회원님의 임시 비밀번호 입니다</p>
			<div class="result-box">
				<p>${newPwd}</p>
        </c:otherwise>
	</c:choose>
</div>
</body>
</html>