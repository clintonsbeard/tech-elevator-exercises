<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:import url="/WEB-INF/jsp/common/header.jsp"/>

<h2>What is your favorite food?</h2>

<c:url var="answer2" value="/answer2" />
<form action="${answer2}" method="POST">
	<input type="text" name="food" class="form">
	<input type="submit" value="Next >>>" class="form">
</form>

<c:import url="/WEB-INF/jsp/common/footer.jsp"/>