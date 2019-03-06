<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section id="mainContent">
<h2 class="centered">Write a Review</h2>
	
	<div id="writeReview">
		<c:url var="submitPostResult" value="/reviewProcessor" />
		<form action="${submitPostResult}" method="POST">
			<div>
				<label for="username">Username</label>
				<input type="text" name="username"/>
			</div>
			<div>
				<label for="rating">Rating</label>
				<input type="text" name="rating"/>
			</div>
			<div>
				<label for="title">Review Title</label>
				<input type="text" name="title"/>
			</div>
			<div>
				<label for="text">Review Text</label>
				<textarea name="text"></textarea>
			</div>
			<button type="submit">Submit</button>
		</form>
	</div>
</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />