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
				<input type="text" name="username" required>
			</div>
			<div>
				<label for="rating">Rating</label>
				<select name="rating">
  					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
				</select>
			</div>
			<div>
				<label for="title">Review Title</label>
				<input type="text" name="title" required>
			</div>
			<div>
				<label for="text">Review Text</label>
				<textarea name="text" required></textarea>
			</div>
			<button type="submit">Submit</button>
		</form>
	</div>
</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />