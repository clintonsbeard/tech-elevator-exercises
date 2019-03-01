<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>

<html>
<head>
    <meta name="viewport" content="width=device-width" />
    <title>Product Table View</title>
    <link rel="stylesheet" href="css/site.css" />
</head>
<body>
    <header>
        <h1>MVC Exercises - Views Part 2: Models</h1>        
    </header>
    <nav>
        <ul>
            <li><a href="productList">List Layout</a></li>
            <li><a href="productTiles">Tile Layout</a></li>
            <li><a href="productTable">Table Layout</a></li>
        </ul>
    </nav>
    <section id="main-content">
    	<h1>Toy Department</h1>
		<table id ="table">
			<tr>
				<td></td>
				<c:forEach var="product" items="${productList}">
					<td id="table-image"><img src="img/${product.imageName}"></td>
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
					<td id ="gray">${product.name}</td>
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
    </section>
</body>
</html>