package com.techelevator.validation.model;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

public class Registration {
	
	@NotBlank(message="First name is a required field.")
	@Size(min=2, max=20, message="First name is limited to a maximum of 20 characters.")
	private String firstName;
	
	@NotBlank(message="Last name is a required field.")
	@Size(min=2, max=20, message="Last name is limited to a maximum of 20 characters.")
	private String lastName;
	
	@NotBlank(message="Email is a required field.")
	@Email(message="Email must be valid.")
	private String email;
	
	@NotBlank(message="Verify email is a required field.")
	@Email(message="Verify email must be valid.")
	private String confirmEmail;
	
	@NotBlank(message="Password is a required field.")
	@Size(min=8, message="Password must be at least 8 characters.")
	private String password;
	
	@NotBlank(message="Confirm password is a required field.")
	@Size(min=8, message="Confirm password must be at least 8 characters.")
	private String confirmPassword;
	
	@NotBlank(message="Birth date is a required field.")
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private String birthDate;
	
	@NotNull(message="Number of tickets is a required field.")
	@Min(value=1, message="Number of tickets must be at least 1.")
	@Max(value=10, message="Number of tickets must be no more than 10.")
	private int numberOfTickets;
	
	private boolean emailMatching; 
	@AssertTrue(message="Email and verify email must match.")
	public boolean isEmailMatching() {
		if(email != null) {
			return email.equals(confirmEmail);
		} else {
			return false;
		}
	}
	
	private boolean passwordMatching; 
	@AssertTrue(message="Password and confirm password must match.")
	public boolean isPasswordMatching() {
		if(password != null) {
			return password.equals(confirmPassword);
		} else {
			return false;
		}
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getConfirmEmail() {
		return confirmEmail;
	}
	public void setConfirmEmail(String confirmEmail) {
		this.confirmEmail = confirmEmail;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	
	public int getNumberOfTickets() {
		return numberOfTickets;
	}
	public void setNumberOfTickets(int numberOfTickets) {
		this.numberOfTickets = numberOfTickets;
	}

}