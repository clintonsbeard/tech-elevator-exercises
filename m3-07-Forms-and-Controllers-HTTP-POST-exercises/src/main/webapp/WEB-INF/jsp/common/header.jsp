<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Squirrel Cigar Parties for Dummies</title>
    <c:url value="/css/style.css" var="cssHref" />
    <link rel="stylesheet" href="${cssHref}">
</head>

<body>
    <header>
    	<c:url var="home" value="/"/>
    	<h1><a href="${home}">Squirrel Cigar Parties for Dummies</a></h1>
    	<h2><a href="${home}">The new book by Craig Castelaz!</a></h2>
    </header>