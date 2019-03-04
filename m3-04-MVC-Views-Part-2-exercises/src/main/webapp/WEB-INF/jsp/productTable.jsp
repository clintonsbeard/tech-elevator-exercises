<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

	<c:import url="/WEB-INF/jsp/header.jsp">
	    <c:param name="pageTitle" value="Toy Department" />
	</c:import>
	
		<c:url var="productDetailUrl" value="/productDetail">
			<c:param name="productId" value="${product.productId}" />
		</c:url>
						
		<table id ="table">
			<tr>
				<td></td>
				<c:forEach var="product" items="${productList}">
					<td id="table-image"><a href="${productDetailUrl}"><img src="img/${product.imageName}"></a></td>
				</c:forEach>
			</tr>
			<tr>
				<td></td>
				<c:forEach var="product" items="${productList}">
					<c:choose>
						<c:when test="${product.topSeller}">
							<td id="table-bestseller">BEST SELLER!</td>
						</c:when>
						<c:otherwise>
							<td></td>
						</c:otherwise>
					</c:choose>
				</c:forEach>
			</tr>
			<tr>
				<td id="label">Name</td>
				<c:forEach var="product" items="${productList}">
					<td id ="gray">
						<a href="${productDetailUrl}"><c:out value="${product.name}" /></a>
					</td>
				</c:forEach>
			</tr>
			<tr>
				<td id="label">Rating</td>
				<c:forEach var="product" items="${productList}">
				<fmt:formatNumber var="rating" type ="number" maxFractionDigits="0" value="${product.averageRating}" />
				<td id="table-star"><img src="img/${rating}-star.png"></td>
				</c:forEach>
			</tr>
			<tr>
				<td id="label">Mfr</td>
				<c:forEach var="product" items="${productList}">
				<td id ="gray">${product.manufacturer}</td>
				</c:forEach>
			</tr>
			<tr>
				<td id="label">Price</td>
				<c:forEach var="product" items="${productList}">
				<td id="table-price">$${product.price}</td>
				</c:forEach>
			</tr>
			<tr>
				<td id="label">wt. (in lbs)</td>
				<c:forEach var="product" items="${productList}">
				<fmt:formatNumber var="weight" type ="number" maxFractionDigits="0" value="${product.weightInLbs}" />
				<td id ="gray">${product.weightInLbs}</td>
				</c:forEach>
			</tr>
		</table>
		
<c:import url="/WEB-INF/jsp/footer.jsp" />