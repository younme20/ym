<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>first</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/ui.css'/>" />
<link rel="stylesheet" href="libs/bootstrap/css/bootstrap.min.css">
<!-- jQuery --> 
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script> 
<script src="<c:url value='/resources/js/common/common.js'/>" charset="utf-8"></script>
<script src="<c:url value='/resources/js/study/study.js'/>" charset="utf-8"></script>
</head>
<body>
	<h2>스터디 관리 게시판 목록</h2>
	<button id="btnList" type="button" class="btn btn_left">목록</button>
	<button id="btnUpdate" type="button" class="btn btn_left">수정</button>	
	<table class="board_view">
		<colgroup>
			<col width="15%"/>
			<col width="35%"/>
			<col width="15%"/>
			<col width="35%"/>
		</colgroup>
		<caption>게시글 상세</caption>
		<tbody>
			<tr>
				<th scope="row">글 번호</th>
				<td>${map.IDX }</td>
				<th scope="row">조회수</th>
				<td>${map.HITCNT }</td>
			</tr>
			<tr>
				<th scope="row">작성자</th>
				<td>${map.CREATE_ID }</td>
				<th scope="row">작성시간</th>
				<td>${map.CREATE_DATETIME}</td>
			</tr>
			<tr>
				<th scope="row">제목</th>
				<td colspan="3">${map.TITLE }</td>
			</tr>
			<tr>
				<td colspan="4">에디터 자리</td>
			</tr>
		</tbody>
	</table>
</body>
</html>