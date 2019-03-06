<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:import url="/WEB-INF/jsp/common/header.jsp"/>

<c:forEach var="thing" items="${things}">
	<c:out value="${thing.color}"/>
</c:forEach>

<c:import url="/WEB-INF/jsp/common/footer.jsp"/>