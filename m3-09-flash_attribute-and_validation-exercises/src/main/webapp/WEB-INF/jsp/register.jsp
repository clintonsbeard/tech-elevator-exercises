<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="pageTitle" value="Home Page"/>
<%@include file="common/header.jspf" %>

<h2>New User Registration</h2>

<c:url value="/register" var="registerSubmit" />

<form:form action="${registerSubmit}" method="POST" modelAttribute="register">

	<div class="form">
		<div class="input">
   			<label for="firstName">First Name</label>
   			<form:input path="firstName" placeholder="enter last name" onfocus="this.placeholder = ''" onblur="this.placeholder = 'enter first name'"/>
   		</div>
   		<div class="error">
   			<form:errors path="firstName"/>
   		</div>
   	</div>
	<div class="form">
	    <div class="input">
	    	<label for="lastName">Last Name</label>
			<form:input path="lastName" placeholder="enter last name" onfocus="this.placeholder = ''" onblur="this.placeholder = 'enter last name'"/>            
		</div>
		<div class="error">
	     	<form:errors path="lastName"/>
	    </div>
	</div>
	<div class="form">
		<div class="input">
	    	<label for="email">Email</label>
			<form:input path="email" placeholder="enter email" onfocus="this.placeholder = ''" onblur="this.placeholder = 'enter email'"/>      
		</div>
		<div class="error">      
	    	<form:errors path="email"/>
	     	<form:errors path="emailMatching"/>
	    </div>
	</div>
	<div class="form">
	    <div class="input">
	        <label for="confirmEmail">Confirm Email</label>
	        <form:input path="confirmEmail" placeholder="confirm email" onfocus="this.placeholder = ''" onblur="this.placeholder = 'confirm email'"/>
	    </div>
	    <div class="error">
	        <form:errors path="confirmEmail"/>
	    </div>
	</div>
	<div class="form">
	    <div class="input">
	        <label for="password">Password</label>
	        <form:password path="password" placeholder="enter password" onfocus="this.placeholder = ''" onblur="this.placeholder = 'enter password'"/>
	    </div>
	    <div class="error">
	       	<form:errors path="password"/>
	       	<form:errors path="passwordMatching"/>
	    </div>
	</div>
	<div class="form">
	    <div class="input">
	        <label for="confirmPassword">Confirm Password</label>
	        <form:password path="confirmPassword" placeholder="confirm password" onfocus="this.placeholder = ''" onblur="this.placeholder = 'confirm password'"/>
	    </div>
	    <div class="error">
	        <form:errors path="confirmPassword"/>
	    </div>
	</div>
	<div class="form">
	    <div class="input">
	        <label for="birthDate">Birth Date</label>
	        <form:input type="date" path="birthDate" placeholder="enter birth date" onfocus="this.placeholder = ''" onblur="this.placeholder = 'enter birth date'"/>
	    </div>
	    <div class="error">
	    	<form:errors path="birthDate"/>
	    </div>
	</div>
	<div class="form">
	    <div class="input">
	        <label for="numberOfTickets">Number of Tickets</label>
	        <form:input type="number" path="numberOfTickets" placeholder="enter number of tickets"  onfocus="this.placeholder = ''" onblur="this.placeholder = 'enter number of tickets'"/>
	    </div>  
	    <div class="error">
	        <form:errors path="numberOfTickets"/>
	    </div> 
	</div>
    <div class="input">
        <button type="submit">Submit</button>
    </div> 

</form:form>

<%@include file="common/footer.jspf" %>