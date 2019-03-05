package com.techelevator;

import com.techelevator.dao.CustomerDao;
import com.techelevator.dao.model.Customer;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerSearchController {

    @Autowired
    private CustomerDao customerDao;

	@RequestMapping("/customerSearch")
	public String showSearchCustomerForm() {
		return "customerList";
	}

	@RequestMapping("/customerResults")
	public String searchCustomers(HttpServletRequest request) {
		
		String firstOrLastName = request.getParameter("firstOrLastName");
		String sortChoice = request.getParameter("sortBy");
	
		List<Customer> customers = customerDao.searchAndSortCustomers(firstOrLastName, sortChoice);
	
		request.setAttribute("customers", customers);
		
		return "customerList";
	}
	
}