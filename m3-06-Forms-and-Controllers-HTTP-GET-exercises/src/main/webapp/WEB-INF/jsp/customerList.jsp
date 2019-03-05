<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Customers List"/>

<%@include file="common/header.jspf"%>

<c:url var="customerSearchURL" value="/customerResults" />
<form action="${customerSearchURL}" method="GET">
	<div style="display:inline-block;">
		<input type="text" name="firstOrLastName" />
	</div>
	<div style="display:inline-block;">
	<label for="sortBy">Sort:</label>
		<select name="sortBy">
			<option value="last_name">Last Name</option>
			<option value="email">Email</option>
			<option value="active">Active</option>
		</select>
	</div>
	<div style="display:inline-block;">
		<input type="submit" value="Search" />
	</div>
</form>
<table class="table">
	<tr>
		<th>Name</th>
		<th>Email</th>
		<th>Active</th>
	</tr>
	<c:forEach items="${customers}" var="customer">
		<tr>
	    	<td><c:out value="${customer.firstName}" /> <c:out value="${customer.lastName}" /></td>
	    	<td><c:out value="${customer.email}" /></td>
    		<c:choose>
    			<c:when test="${customer.active == true}">
    				<td><c:out value="Yes" /></td>
    			</c:when>
    			<c:otherwise>
    				<td><c:out value="No" /></td>
    			</c:otherwise>
    		</c:choose>
		</tr>
	</c:forEach>
</table>

<%@include file="common/footer.jspf"%>