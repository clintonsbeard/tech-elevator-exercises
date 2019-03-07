<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:import url="/WEB-INF/jsp/common/header.jsp"/>

	<div id="container">
		<div class="value">
			<div class="label">
				<c:out value="Favorite Color: "/>
			</div>
			<c:out value="${things.color}"/>
		</div>
		<div class="value">
			<div class="label">
				<c:out value="Favorite Food: "/>
			</div>
			<c:out value="${things.food}"/>
		</div>
		<div class="value">
			<div class="label">
				<c:out value="Favorite Season: "/>
			</div>
			<c:out value="${things.season}"/>
		</div>
	</div>

<c:import url="/WEB-INF/jsp/common/footer.jsp"/>