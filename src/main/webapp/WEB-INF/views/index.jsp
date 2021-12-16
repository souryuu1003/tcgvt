<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<div id="Frame_Set">
	<input id="Error_Message" value="${errorMessage}" hidden="hidden">
	<table border="1" style="text-align: center; table-layout: fixed;">
	<thead>
		<tr>
			<th>NO</th>
			<th>ID</th>
			<th>PW</th>
			<th>ROLL</th>
			<th>MCOUNT</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="list" items="${userList}">
		<tr>
			<td>${list.userNo}</td>
			<td>${list.userId}</td>
			<td style="overflow: hidden;">${list.userPw}</td>
			<td>${list.userRl}</td>
			<td>${list.userMc}</td>
		</tr>
		</c:forEach>
	</tbody>
	</table>
	<div style="height: 100%; width: 100%; text-align: center; font-size: 2.4em;">
		Spring Boardへようこそ。
	</div>
</div>
</body>
</html>
