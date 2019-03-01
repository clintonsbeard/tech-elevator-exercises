<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:import url="/WEB-INF/jsp/header.jsp">
	<c:param name="pageTitle" value="Toy Department" />
</c:import>
	
	<div id="detailFlexbox">
		<div id="detailImg">
			<img src="img/${product.imageName}">
		</div>
		<div id="detailBox">
			<div id="detailName">
				<c:out value="${product.name}" />
				<c:choose>
				<c:when test="${product.topSeller}">
					<div id="detailBestSeller">
						<c:out value="BEST SELLER!" />
					</div>
				</c:when>
			</c:choose>
			</div>
			<div id="detailManufacturer">
				<c:out value="by ${product.manufacturer}" />
			</div>
			<div id="detailRating">
				<fmt:formatNumber var="rating" type ="number" maxFractionDigits="0" value="${product.averageRating}" />
				<c:url value="img/${rating}-star.png" var="starImage" />
				<img src="${starImage}">
			</div>
			<div id="detailPrice">
				<c:out value="Price: $${product.price}" />
			</div>
			<div>
				<fmt:formatNumber var="weight" type ="number" maxFractionDigits="1" value="${product.weightInLbs}" />
				<strong>Weight</strong> ${weight} lbs
			</div>
			<div id="detailDesc">
				<strong>Description:</strong> <c:out value="${product.description}" />
			</div>
		</div>
	</div>
	
<c:import url="/WEB-INF/jsp/footer.jsp" />