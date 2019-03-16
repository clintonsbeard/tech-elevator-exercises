<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="pageTitle" value="Home Page"/>
<%@include file="common/header.jspf" %>

<h2>Login</h2>

<c:url value="/login" var="loginSubmit" />
<form:form action="${loginSubmit}" method="POST" modelAttribute="login">
	
	<div class="form">
		<div class="input">
	    	<label for="email">Email</label>
			<form:input path="email" placeholder="enter email" onfocus="this.placeholder = ''" onblur="this.placeholder = 'enter email'"/> 
		</div>   
		<div class="error">       
	     	<form:errors path="email"/>
		</div>
	</div>
	<div class="form">
	    <div class="input">
	        <label for="password">Password</label>
	        <form:password path="password" placeholder="enter password" onfocus="this.placeholder = ''" onblur="this.placeholder = 'enter password'"/>
	    </div>
	    <div class="error">
	        <form:errors path="password"/>
	    </div> 
	</div>
    <div class="input">
        <button type="submit">Submit</button>
    </div>  
     
</form:form>

<%@include file="common/footer.jspf" %>