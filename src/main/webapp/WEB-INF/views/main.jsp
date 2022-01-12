<jsp:include page="header/header.jsp"/>
<jsp:include page="aside/aside.jsp"/>
		<div class="bodyWrap">
			<c:choose>
				<c:when test="${userId}">
					${userId}
				</c:when>
				<c:otherwise>
					userId error
				</c:otherwise>
			</c:choose>
		</div>
<jsp:include page="footer/footer.jsp"/>