<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section id="mainContent">
	<div id="main">
		<div id="image">
			<c:url var="bookImage" value="img/forDummies.png"/>
			<img src="${bookImage}">
		</div>
		<div id="marketing">
			<p class="tagline">"<c:out value="When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars. Return true if the party with the given values is successful, or false otherwise."/>"</p>
			<p><c:out value="As seen above, Craig Castlelaz's now famous words changed a nation.  And now..."/></p>
			<p><c:out value="They can change YOU."/></p>
			<p><c:out value="-Nietzsche"/></p>
		</div>
	</div>
	
	<c:url var="writeReview" value="/writeReview"/>
	<a href="${writeReview}" class="centered">Write A Review</a>
	
	<div id="reviews">
		<c:forEach items="${reviews}" var="review">
			<div class="review">
				<h4><c:out value="${review.title}"/></h4>
				<p>
					<c:out value="by ${review.username}"/>
					<fmt:parseDate var="parsedDate" pattern="yyyy-MM-dd'T'HH:mm:ss" value="${review.dateSubmitted}"/>
					<fmt:formatDate var="d" type="date" pattern="MM/dd/yyyy" value="${parsedDate}"/>
					<c:out value="on ${d}"/>
					<fmt:formatDate var="t" type="time" timeStyle="medium" value="${parsedDate}"/>
					<c:out value="at ${t}"/>
				</p>
				<c:forEach var="step" begin="1" end="${review.rating}">
					<img src="img/star.png">
				</c:forEach>
				<p><c:out value="${review.text}"/></p>
			</div>
		</c:forEach>
	</div>
</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />