<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>
	<meta name="viewport" content="width=device-width" />
	<title><c:out value="${param.pageTitle}" /></title>
	<link rel="stylesheet" href="css/site.css" />
</head>
<body>
	<header>
		<h1><c:out value="MVC Exercises - View Part 3: Detail" /></h1>
	</header>
	<nav>
		<ul>
            <li><a href="productList"><c:out value="List Layout" /></a></li>
            <li><a href="productTiles"><c:out value="Tile Layout" /></a></li>
            <li><a href="productTable"><c:out value="Table Layout" /></a></li>
        </ul>
	</nav>
<section id="main-content">
	<h1><c:out value="${param.pageTitle}" /></h1>