<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:import url="/WEB-INF/jsp/common/header.jsp"/>

<h2>What is your favorite season?</h2>

<c:url var="answer3" value="/answer3" />
<form action="${answer3}" method="POST">
	<input type="radio" name="season" value="Spring"><c:out value="Spring"/>
	<input type="radio" name="season" value="Summer"><c:out value="Summer"/>
	<input type="radio" name="season" value="Fall"><c:out value="Fall"/>
	<input type="radio" name="season" value="Winter"><c:out value="Winter"/>
	<input type="submit" value="Next >>>" class="form">
</form>

<c:import url="/WEB-INF/jsp/common/footer.jsp"/>