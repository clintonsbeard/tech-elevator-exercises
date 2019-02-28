<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 2 - Fibonacci 25</title>
		<style>
			li {
				list-style-type: none;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 2 - Fibonacci 25</h1>
		<ul>
		<c:set var="f1" value="1" />
		<c:set var="f2" value="2" />
		<c:set var="f3" value="${f1 + f2}" />
		<c:forEach begin="1" end="25" var="num">
			<li>${f1}</li>
			<c:set var="f3" value="${f1 + f2}" />
			<c:set var="f1" value="${f2}" />
			<c:set var="f2" value="${f3}" />
		</c:forEach>
		</ul>
	</body>
</html>