package com.techelevator;

import java.time.LocalDateTime;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.model.Review;
import com.techelevator.model.ReviewDao;

@Controller 
public class HelloController {

	@Autowired
	private ReviewDao reviewDao;
	
	@RequestMapping("/reviews")
	public String displayReviews() {
		return "reviews";
	}
	
	@RequestMapping("/writeReview")
	public String displayWriteReview() {
		return "writeReview";
	}
	
	@RequestMapping("/error")
	public String displayError() {
		return "error";
	}
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String getAllReviews(ModelMap map) {
		map.addAttribute("reviews", reviewDao.getAllReviews());
		return "homePage";
	}
	
	@RequestMapping(path="/reviewProcessor", method=RequestMethod.POST)
	public String postReview(Review review) {
		review.setDateSubmitted(LocalDateTime.now());
		reviewDao.save(review);
		return "redirect:/";
	}
	
}