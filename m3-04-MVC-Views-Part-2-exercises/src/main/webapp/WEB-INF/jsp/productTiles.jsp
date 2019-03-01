<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>

<html>
<head>
    <meta name="viewport" content="width=device-width" />
    <title>Product Tiles View</title>
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
		<div id="tile-flexbox">
			<c:forEach var="product" items="${productList}">
				<div id="tile-item">
					<div id="tile-image"><img src="img/${product.imageName}"></div>
					<div id="tile-name">${product.name}</div>
					<c:choose>
						<c:when test="${product.topSeller}">
						<div id="tile-bestseller">BEST SELLER!</div>
						</c:when>
					</c:choose>
					<div id="tile-manufacturer">By ${product.manufacturer}</div>
					<c:choose>
						<c:when test="${product.remainingStock <= 2}">
						<div id="tile-quantity">Only ${product.remainingStock} left!</div>
						</c:when>
					</c:choose>
					<div id="tile-price">$${product.price}</div>
					<c:set var="rating" value="${product.averageRating}" />
					<fmt:formatNumber var="weight" type ="number" maxFractionDigits="1" value="${product.weightInLbs}" />
					<div><strong>Weight</strong> ${weight} lbs</div>
					<fmt:formatNumber var="rating" type ="number" maxFractionDigits="0" value="${product.averageRating}" />
					<div id="tile-star"><img src="img/${rating}-star.png"></div>
				</div>
		    </c:forEach>
		</div>
    </section>
</body>
</html>