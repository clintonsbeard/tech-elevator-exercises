<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

	<c:import url="/WEB-INF/jsp/header.jsp">
	    <c:param name="pageTitle" value="Toy Department" />
	</c:import>
	
		<div id="tile-flexbox">
			<c:forEach var="product" items="${productList}">
				<div id="tile-item">
					<c:url var="productDetailUrl" value="/productDetail">
						<c:param name="productId" value="${product.productId}" />
					</c:url>
					<div id="tile-image">
						<c:url value="img/${product.imageName}" var="productImage" />
						<a href="${productDetailUrl}"><img src="${productImage}"></a>
					</div>
					<div id="tile-name">
						<a href="${productDetailUrl}"><c:out value="${product.name}" /></a>
					</div>
					<c:choose>
						<c:when test="${product.topSeller}">
							<div id="tile-bestseller">
								<c:out value="BEST SELLER!" />
							</div>
						</c:when>
					</c:choose>
					<div id="tile-manufacturer">
						<c:out value="By ${product.manufacturer}" />
					</div>
					<c:choose>
						<c:when test="${product.remainingStock <= 2}">
							<div id="tile-quantity">
								<c:out value="Only ${product.remainingStock} left!" />
							</div>
						</c:when>
					</c:choose>
					<div id="tile-price">
							<c:out value="$${product.price}" />
					</div>
					<div>
						<fmt:formatNumber var="weight" type ="number" maxFractionDigits="1" value="${product.weightInLbs}" />
						<strong>Weight</strong> ${weight} lbs
					</div>
					<div id="tile-star">
						<fmt:formatNumber var="rating" type ="number" maxFractionDigits="0" value="${product.averageRating}" />
						<c:url value="img/${rating}-star.png" var="starImage" />
						<img src="${starImage}">
					</div>
				</div>
		    </c:forEach>
		</div>
		
<c:import url="/WEB-INF/jsp/footer.jsp" />