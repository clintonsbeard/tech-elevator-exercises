package com.techelevator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.techelevator.model.FavoriteThings;

@Controller 
@SessionAttributes("things")
public class HelloController {

	private FavoriteThings favorite;
	
	@RequestMapping("/")
	public String displayPage1() {
		return "page1";
	}
	
	@RequestMapping("/page2")
	public String displayPage2() {
		return "page2";
	}
	
	@RequestMapping("/page3")
	public String displayPage3() {
		return "page3";
	}
	
	@RequestMapping("/summary")
	public String displaySummary() {
		return "summary";
	}
	
	@RequestMapping(path="/answer1", method=RequestMethod.POST)
	public String postAnswer1(ModelMap map, @RequestParam String color) {
		if (map.get("things") == null) {
			favorite = new FavoriteThings();
		}
		else {
			favorite = (FavoriteThings)map.get("things");
		}
		favorite.setColor(color);
		map.put("things", favorite);
		
		return "redirect:/getQuestion2";
	}
	
	@RequestMapping(path="/getQuestion2", method=RequestMethod.GET)
	public String getQuestion2() {
		return "redirect:/page2";
	}
	
	@RequestMapping(path="/answer2", method=RequestMethod.POST)
	public String postAnswer2(ModelMap map, @RequestParam String food) {
		if (map.get("things") == null) {
			favorite = new FavoriteThings();
		}
		else {
			favorite = (FavoriteThings)map.get("things");
		}
		favorite.setFood(food);
		map.put("things", favorite);
		
		return "redirect:/getQuestion3";
	}
	
	@RequestMapping(path="/getQuestion3", method=RequestMethod.GET)
	public String getQuestion3() {
		return "redirect:/page3";
	}
	
	@RequestMapping(path="/answer3", method=RequestMethod.POST)
	public String postAnswer3(ModelMap map, @RequestParam String season) {
		if (map.get("things") == null) {
			favorite = new FavoriteThings();
		}
		else {
			favorite = (FavoriteThings)map.get("things");
		}
		favorite.setSeason(season);
		map.put("things", favorite);
		return "redirect:/getSummary";
	}
	
	@RequestMapping(path="/getSummary", method=RequestMethod.GET)
	public String getSummary(ModelMap map) {
		map.get("things");
		return "redirect:/summary";
	}
	
}