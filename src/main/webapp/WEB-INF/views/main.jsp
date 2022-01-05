<jsp:include page="header/header.jsp"/>
<body>
<c:choose>
	<c:when test="${userId}">
		${userId}
	</c:when>
	<c:otherwise>
		userId error
	</c:otherwise>
</c:choose>

</body>
<jsp:include page="footer/footer.jsp"/>