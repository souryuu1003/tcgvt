<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<% String contextPath = request.getContextPath(); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>This is Trading Card Game</title>
<link rel="stylesheet" type="text/css" href="<%= contextPath %>/resources/css/standard.css">
<script type="text/javascript" src="<%= contextPath %>/resources/js/standard.js"></script>
</head>
<div id="STATIC_WRAP">
	<header>
		<h1><a href="<%= contextPath %>/main" onchange="test()">Trading Card Game</a></h1>
		
		<ul id="HEADER_MENU_WRAP">
			<li class="header_menu"><h2><a href="<%= contextPath %>/main">Main</a></h2></li>
			
			<li id="NOTICE_MENU" class="header_menu" onmouseover="openSubMenu(0)"  onmouseout="closeSubMenu(0)">
				<h2 class="header-main-menu"><a href="<%= contextPath %>/notice/update">Notice</a></h2>
				<div class="header-sub-menu">
					<h2><a href="<%= contextPath %>/notice/update">Update</a></h2>
					<h2><a href="<%= contextPath %>/notice/event">Event</a></h2>
				</div>
			</li>
			
			<li class="header_menu"><h2><a href="<%= contextPath %>/board/free">Board</a></h2></li>
<%--  			<li><h2><a href="<%= contextPath %>/board/free">Free</a></h2></li>
			<li><h2><a href="<%= contextPath %>/board/tip">Tip</a></h2></li>
			<li><h2><a href="<%= contextPath %>/board/forum">Forum</a></h2></li> --%>
			
			<li class="header_menu"><h2><a href="<%= contextPath %>/shop/card">Card Shop</a></h2></li>
<%--  			<li><h2><a href="<%= contextPath %>/shop/card">Card</a></h2></li>
			<li><h2><a href="<%= contextPath %>/shop/booster">Booster</a></h2></li>
			<li><h2><a href="<%= contextPath %>/shop/deck">Deck</a></h2></li> --%>
			
			<li class="header_menu"><h2><a href="<%= contextPath %>/cards/deck">Cards</a></h2></li>
<%--  			<li><h2><a href="<%= contextPath %>/cards/deck">Deck</a></h2></li>
			<li><h2><a href="<%= contextPath %>/cards/list">List</a></h2></li>
			<li><h2><a href="<%= contextPath %>/cards/album">Album</a></h2></li> --%>
			
			<li class="header_menu"><h2><a href="<%= contextPath %>/trade/house">Trade</a></h2></li>
<%--  			<li><h2><a href="<%= contextPath %>/trade/house">house</a></h2></li>
			<li><h2><a href="<%= contextPath %>/trade/auction">Auction</a></h2></li> --%>
			
			<li class="header_menu"><h2><a href="<%= contextPath %>/customer/FAQ">Customer</a></h2></li>
<%--  			<li><h2><a href="<%= contextPath %>/customer/FAQ">FAQ</a></h2></li>
			<li><h2><a href="<%= contextPath %>/customer/QNA">QNA</a></h2></li> --%>
			
		</ul>
	</header>
	<body>