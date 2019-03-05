<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Actors List"/>

<%@include file="common/header.jspf"%>

<c:url var="actorSearchURL" value="/actorResults" />
<form action="${actorSearchURL}" method="GET">
	<input type="text" name="searchTerm" />
	<input type="submit" value="Search" />
</form>
<table class="table">
	<tr>
		<th>Name</th>
	</tr>
	<c:forEach items="${actors}" var="actor">
		<tr>
	    	<td><c:out value="${actor.firstName}" /> <c:out value="${actor.lastName}" /></td>
		</tr>
	</c:forEach>
</table>

<%@include file="common/footer.jspf"%>