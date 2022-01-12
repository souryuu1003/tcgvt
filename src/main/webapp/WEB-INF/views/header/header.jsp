<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String contextPath = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>This is Trading Card Game</title>
<link rel="stylesheet" type="text/css" href="<%=contextPath %>/resources/css/standard.css">
<script type="text/javascript" src="<%=contextPath %>/resources/js/standard.js"></script>
</head>
<div id="STATIC_WRAP">
	<header>
		<h1><a onclick="location.href="main"">Trading Card Game</a></h1>
		<ul id="HEADER_MENU">
			<li><h2><a href="<%=contextPath %>/main">Main</a></h2></li>
			<li><h2><a href="<%=contextPath %>/board/free">Board</a></h2></li>
 			<li><h2><a href="<%=contextPath %>/board/free">Free</a></h2></li>
			<li><h2><a href="<%=contextPath %>/board/tip">Tip</a></h2></li>
			<li><h2><a href="<%=contextPath %>/board/forum">Forum</a></h2></li>
			
			<li><h2><a href="<%=contextPath %>/shop/card">Card Shop</a></h2></li>
 			<li><h2><a href="<%=contextPath %>/shop/card">Card</a></h2></li>
			<li><h2><a href="<%=contextPath %>/shop/booster">Booster</a></h2></li>
			<li><h2><a href="<%=contextPath %>/shop/deck">Deck</a></h2></li>
			
			<li><h2><a href="<%=contextPath %>/cards/deck">Cards</a></h2></li>
 			<li><h2><a href="<%=contextPath %>/cards/deck">Deck</a></h2></li>
			<li><h2><a href="<%=contextPath %>/cards/list">List</a></h2></li>
			<li><h2><a href="<%=contextPath %>/cards/album">Album</a></h2></li>
			
			<li><h2><a href="<%=contextPath %>/trade/house">Trade</a></h2></li>
 			<li><h2><a href="<%=contextPath %>/trade/house">house</a></h2></li>
			<li><h2><a href="<%=contextPath %>/trade/auction">Auction</a></h2></li>
			
			<li><h2><a href="<%=contextPath %>/customer/FAQ">Customer</a></h2></li>
 			<li><h2><a href="<%=contextPath %>/customer/FAQ">FAQ</a></h2></li>
			<li><h2><a href="<%=contextPath %>/customer/QNA">QNA</a></h2></li>
			
		</ul>
	</header>
	<body>